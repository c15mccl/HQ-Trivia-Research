import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class FormattedData3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FormattedData3
{
    public static void main(String args[]) throws IOException{
        File file = new File("MayAugScript.txt");
        Scanner scan = new Scanner(file);
        //System.out.println("Start");
        try{
            File myfile = new File("JanMayAnsCat1.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            String patternMatch = "";
            while (scan.hasNextLine()){   
                Pattern p1 = Pattern.compile("\"text\":\"(((([^? ])+\\s){1,})\\?)");
                Matcher m1 = p1.matcher(scan.nextLine());
                while (m1.find()){
                    patternMatch = m1.group();
                    //String question = patternMatch.replaceAll("text","Question");                   
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);
                    System.out.println("--------------------------------");
                }
            }
            fwrite.close();
            pwrite.close();
        }

        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
        
        
    }
}
