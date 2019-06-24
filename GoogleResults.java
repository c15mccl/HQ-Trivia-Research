import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.util.regex.*;
/**
 * Write a description of class GoogleResults here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GoogleResults
{
    public static void main(String[]args)throws FileNotFoundException, IOException, InterruptedException {
        File myfile = new File("FirstQuesURL.txt");
        Scanner scan = new Scanner(myfile);
        int count = 1;
        while(scan.hasNextLine()){
            String URL = scan.nextLine();
            try{
                File myfile2 = new File("Results.txt");
                FileWriter fwrite = new FileWriter(myfile2);
                PrintWriter pwrite =  new PrintWriter(fwrite);
                Document doc = Jsoup.connect(URL).get();
                Elements elem = doc.select("div#resultStats");
                System.out.println("Count: "+count);
                System.out.println(elem);
                System.out.println("---------------------");
                pwrite.println("Count: "+count);
                pwrite.println(elem);
                pwrite.println("---------------------");
                count++;
                fwrite.close();
                pwrite.close();
            }
            catch (Exception e){
                e.printStackTrace();
                //System.err.println(x);
                System.exit(1);
            }
        }

    }
}

