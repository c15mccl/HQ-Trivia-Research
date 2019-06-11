import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.util.regex.*;
/**
 * Write a description of class JanMay2019 here.
 *
 * @author (Rachel Cleary, Mike Lostritto)
 * @version (a version number or a date)
 */
public class JanMay2019

{
    public static void main(String [] args) throws FileNotFoundException
    {
        File file = new File("JanMay2019.txt");
        Scanner scan = new Scanner(file);
        int dayNum = 1;
        String day = "Day: ";
        while(scan.hasNextLine()){
            String URL = scan.nextLine();
            String filename = day + dayNum;
            System.out.println(filename);
            
            try{
                File myFile = new File(filename);
                FileWriter fwrite =  new FileWriter(myFile);
                PrintWriter pwrite = new PrintWriter(fwrite);
                Document hQdata = Jsoup.connect(URL).get();
                Elements hQdates = hQdata.select("script");

                for (Element e : hQdates){
                    for(DataNode node: e.dataNodes()){
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
                System.exit(1);
            }
            dayNum++;
        }

    }
}

