import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class SepDecSav here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SepDecSav
{
    public static void main(String [] args) throws FileNotFoundException
    {
        File file = new File("SepDecScript.txt");
        Scanner in = new Scanner(file);
        try{
            File file2 = new File("SepDecSav.txt");
            FileWriter fwrite2 = new FileWriter(file2);
            PrintWriter pwrite2 =  new PrintWriter(fwrite2);
            String patternMatch = "";
            while(in.hasNextLine()){
               String line = in.nextLine();
                Pattern p = Pattern.compile("\"savage\":(\\w{1,})");
                Matcher m = p.matcher(line);
                while (m.find()){
                    patternMatch = m.group();
                    System.out.println(patternMatch);
                    pwrite2.println(patternMatch);
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
