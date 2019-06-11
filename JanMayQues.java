import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class JanMayQues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JanMayQues
{
      public static void main(String[]args)throws FileNotFoundException{
        File file = new File("JanMayCat.txt");
        Scanner scan = new Scanner(file);
        try{
            File myfile = new File("JanMayCat.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            String patternMatch = "";

            //System.out.println(line);

            while (scan.hasNextLine()){
                String element = "\"text\":";
                String line = scan.nextLine();
                StringBuilder sb = new StringBuilder(line);

                sb.toString();
                int removeLine = line.lastIndexOf(element);
                sb.delete(0, removeLine);
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
