import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
/**
 * Class that ggrabsthe data from hqbuff for the months of May-August of 2018. 
 *
 * @author (Cheryl McClean)
 * @version (5/20/19)
 */
public class MayAugust2018
{
    public static void main(String[]args)throws FileNotFoundException{
        //May
        File myFile = new File("MAYAUG.txt");
        Scanner scan = new Scanner(myFile);
        while(scan.hasNextLine()){
            String URL = scan.nextLine();
            
            
            
            try{
                File outFile = new File(URL + ".txt");
                PrintWriter output = new PrintWriter(outFile);
                Document hQdata = Jsoup.connect(URL).get();
                Elements hQdates = hQdata.select("script");
               
                for(Element e : hQdates ){
                   for (DataNode node : e.dataNodes()){
                       System.out.println(node.getWholeData());
                       output.println(node.getWholeData());
                    }
                }
                System.out.println("------------");
                output.close();
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
                System.exit(1);
            }
        }
        ArrayList <String> list = new ArrayList <String>();

        //in loop create new file and printwriter object 
        //
        
        
        

        
        
    }
}
