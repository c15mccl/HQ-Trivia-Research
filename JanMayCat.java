import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class JanMayCat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JanMayCat
{
    public static void main(String[]args) throws FileNotFoundException{
        File file = new File("JanMayScript.txt");
        Scanner scan = new Scanner(file);
        try{
            File myfile = new File("JanMayCat.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            String patternMatch = " ";
            //System.out.println(line);
            while (scan.hasNextLine()){
                Pattern p = Pattern.compile("\"category\":\"(.{1,15})\"");
                Matcher m = p.matcher(scan.nextLine());
                while (m.find()){
                    patternMatch = m.group();
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);
                    System.out.println("--------------------------------");
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
