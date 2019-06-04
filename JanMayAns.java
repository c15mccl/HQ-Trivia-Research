import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class JanMayAns here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JanMayAns
{
    public static void main(String[]args)throws FileNotFoundException{
        File file = new File("JanMayAnsCat1.txt");
        Scanner scan = new Scanner(file);
        try{
            File myfile = new File("JanMayAnswers.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            //System.out.println(line);
            while (scan.hasNextLine()){
                String element = "]";
                String line = scan.nextLine();
                StringBuilder sb = new StringBuilder(line);

                sb.toString();
                int removeLine = line.indexOf(element);
                sb.delete(removeLine+1, line.length());
                System.out.println(sb.toString());
                pwrite.println(sb.toString());
            }
            pwrite.close();
            fwrite.close();
        }
        catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
