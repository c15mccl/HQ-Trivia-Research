import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;

/**
 * Write a description of class JanMay2019 here.
 *
 * @author (Rachel Cleary, Mike Lostritto)
 * @version (a version number or a date)
 */
public class JanMay2019

{
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("JanMay2019.txt");
        Scanner in = new Scanner(file);
        while(in.hasNextLine()){
            String URL = in.nextLine();

            try{
                Document hQdata = Jsoup.connect(URL).get();
                //Elements hQdates = hQdata.select("question_number");
                Elements hQdates = hQdata.select("script");
                System.out.println(hQdates.size());
                for (Element e : hQdates)
                    for(DataNode node: e.dataNodes())
                    {
                        System.out.println(node.getWholeData());
                    }

                System.out.println("->");

            }
            catch(Exception e){
                e.printStackTrace();
                System.exit(1);
            }

        }
    }
}
