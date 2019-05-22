import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
/**
 * Write a description of class SepDec2018 here.
 *
 * @author (Rachel Cleary)
 * @version (a version number or a date)
 */
public class SepDec2018
{

    public static void main(String [] args) throws FileNotFoundException
    {
        File file = new File("SEPDEC_URLS.txt");
<<<<<<< HEAD
        Scanner in = new Scanner(file);
        while(in.hasNextLine()){
            String URL = in.nextLine();
=======
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            String URL = scan.nextLine();
>>>>>>> 4d23c41499c3c7dc800f08bba80db8ac0bfbb77a
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
<<<<<<< HEAD
                for (Element e : hQdates)
                    for(DataNode node: e.dataNodes())
                    {
                        //System.out.println(node.getWholeData());
                        writer.write(node.getWholeData());
                    }

                System.out.println("------------");
                //writer.close();
                Thread.sleep(1000);

=======
               
                for(Element e : hQdates ){
                   for (DataNode node : e.dataNodes()){
                       //System.out.println(node.getWholeData());
                       writer.write(node.getWholeData());
                    }
                }
                System.out.println("------------");
                writer.close();
                Thread.sleep(1000);
>>>>>>> 4d23c41499c3c7dc800f08bba80db8ac0bfbb77a
            }
            catch (Exception e){
                e.printStackTrace();
                //System.err.println(x);
                System.exit(1);
            }
        }

    }
}

