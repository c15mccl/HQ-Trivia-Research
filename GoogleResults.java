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
            String URL = "https://www.google.com/search?gs_ssp=eJzj4tLP1TcwKzcqzjM1YAQAFpkDNg&q=justin+bieber&oq=jus&aqs=chrome.2.69i57j0j46l3j0.2859j0j8&sourceid=chrome&ie=UTF-8";
            try{
                File myfile = new File("Results.txt");
                FileWriter fwrite = new FileWriter(myfile);
                PrintWriter pwrite =  new PrintWriter(fwrite);
                Document hQdata = Jsoup.connect(URL).get();
                Elements hQdates = hQdata.select("id");

                for(Element e : hQdates ){
                    for (DataNode node : e.dataNodes()){
                        pwrite.println(node.getWholeData());
                    }

                }
                System.out.println("------------");
                fwrite.close();
                pwrite.close();
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
                //System.err.println(x);
                System.exit(1);
            }
        }
    }

