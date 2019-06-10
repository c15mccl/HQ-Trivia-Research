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
            String URL = "https://www.google.com/search?q=when+was+siena+college+founded&oq=when+was+siena+college+founded&aqs=chrome..69i57.28499j1j4&sourceid=chrome&ie=UTF-8";
            try{
                File myfile = new File("Results.txt");
                FileWriter fwrite = new FileWriter(myfile);
                PrintWriter pwrite =  new PrintWriter(fwrite);
                Document doc = Jsoup.connect(URL).get();
                Elements elem = doc.select("div#resultStats");
                System.out.println(elem);

                
            }
            catch (Exception e){
                e.printStackTrace();
                //System.err.println(x);
                System.exit(1);
            }
        }
    }

