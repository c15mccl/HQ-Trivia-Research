import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.util.regex.*;
/**
 * Class that ggrabsthe data from hqbuff for the months of May-August of 2018. 
 *
 * @author (Cheryl McClean)
 * @version (5/20/19)
 */
public class MayAugust2018
{
    public static void main(String[]args)throws FileNotFoundException, IOException, InterruptedException {
        File myFile = new File("MAYAUG.txt");
        Scanner scan = new Scanner(myFile);
        int dayNum = 1;
        String day = "Day: ";
        while(scan.hasNextLine()){
            String URL = scan.nextLine();
            String filename = day + dayNum;
            System.out.println(filename);

            try{
                File myfile2 = new File(filename);
                FileWriter fwrite = new FileWriter(myfile2);
                PrintWriter pwrite =  new PrintWriter(fwrite);
                Document hQdata = Jsoup.connect(URL).get();
                Elements hQdates = hQdata.select("script");

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
            dayNum++;
        }
    }
    ArrayList <String> list = new ArrayList <String>();

    //in loop create new file and printwriter object 
    //

}
