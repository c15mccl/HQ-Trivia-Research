import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class MayAugSav here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MayAugSav
{
    public static void main (String[]args) throws FileNotFoundException {
        File file = new File("MayAugScript.txt");
        Scanner scan = new Scanner(file);
        try{
            File myfile = new File("MayAugSav.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            String patternMatch = " ";
            
            //System.out.println(line);
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                Pattern p = Pattern.compile("\"savage\":(\\w{1,})");
                Matcher m = p.matcher(line);
                while (m.find()){
                    patternMatch = m.group();
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);
                }
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
