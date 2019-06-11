import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class JanMayDates here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JanMayDates
{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("JanMayScript.txt");
        Scanner scan = new Scanner(file);
        try{
            File myfile = new File("JanMayDates.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite = new PrintWriter(fwrite, true);
            String patternMatch = "";
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                Pattern p = Pattern.compile("/game/(.{12})");
                Matcher m = p.matcher(line);
                while(m.find()){
                    patternMatch = m.group();
                    Scanner in = new Scanner(patternMatch);
                    String line2 = in.nextLine();
                    if(patternMatch.contains("/game/")){
                        line2 = line2.replace("/game/","");
                    }
                    System.out.println(line2);
                    pwrite.println(line2);
                }
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
        
        
        
    }
}
