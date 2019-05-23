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
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            String URL = scan.nextLine();
            System.out.println(URL);
            String parse1 = URL.substring(27,37);
            String parse2 = URL.substring(38);
            String parse3 = "-";
            String parse4 = parse1 + parse3 + parse2;
            String filename = parse4 + ".txt";
            System.out.println(filename);
            try{
                FileWriter fwrite =  new FileWriter(filename);
                BufferedWriter writer = new BufferedWriter(fwrite);
                Document hQdata = Jsoup.connect(URL).get();
                Elements hQdates = hQdata.select("script");
                for (Element e : hQdates)
                    for(DataNode node: e.dataNodes())
                    {
                        //System.out.println(node.getWholeData());
                        writer.write(node.getWholeData());
                    }

                System.out.println("------------");
                //writer.close();
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
                //System.err.println(x);
                System.exit(1);
            }
        }


    }
}

