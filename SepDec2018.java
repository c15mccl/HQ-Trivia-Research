import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class SepDec2018 here.
 *
 * @author (Rachel Cleary)
 * @version (a version number or a date)
 */
public class SepDec2018
{

    public static void main(String [] args) throws FileNotFoundException{

        File file = new File("SEPDEC_URLS.txt");

        Scanner scan = new Scanner(file);
        int dayNum = 1;
        String day = "Day: ";
        while(scan.hasNextLine()){
            String URL = scan.nextLine();
            //System.out.println(URL);
            String filename = day + dayNum;
            System.out.println(filename);
            try{
                File myFile = new File(filename);
                FileWriter fwrite =  new FileWriter(myFile);
                PrintWriter pwrite = new PrintWriter(fwrite);
                Document hQdata = Jsoup.connect(URL).get();
                Elements hQdates = hQdata.select("script");
                //Pattern p = Pattern.compile("\"text\":\"");

                for (Element e : hQdates)
                    for(DataNode node: e.dataNodes())
                    {
                        //System.out.println(node.getWholeData());
                        pwrite.println(node.getWholeData());
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
            dayNum++;
        }

    }
}
