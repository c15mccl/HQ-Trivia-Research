import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class SepDecCat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SepDecCat
{
    public static void main(String [] args) throws FileNotFoundException
    {
        File file = new File("SepDecScript.txt");
        Scanner in = new Scanner(file);
        try{
            File file2 = new File("SepDecCat.txt");
            FileWriter fwrite2 = new FileWriter(file2);
            PrintWriter pwrite2 =  new PrintWriter(fwrite2);
            String patternMatch = "";
            while(in.hasNextLine()){
               Pattern p = Pattern.compile("\"category\":\"(.{1,15})\"");
               Matcher m = p.matcher(in.nextLine());
               // Pattern p = Pattern.compile("\"answers\":\\[[^]]*\\]");
               // Matcher m = p.matcher(in.nextLine());
               while(m.find()){
                   patternMatch = m.group();
                   
                   System.out.println(patternMatch);
                   pwrite2.println(patternMatch);
                   System.out.println("----------------------------");
                   
                }
            }
            fwrite2.close();
            pwrite2.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
       
        
        
        
     