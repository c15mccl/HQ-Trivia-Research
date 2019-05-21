import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
/**
 * Write a description of class SepDec2018 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SepDec2018
{

    public static void main(String [] args) throws FileNotFoundException
    {
        ArrayList <String> list = new ArrayList<String>();
        //SEPTEMBER URL'S
        File file = new File("SEPDEC_URLS.rtf");
        Scanner in = new Scanner(file);
        while(in.hasNext()){
            String a = in.nextLine();
            int i = 0;
            while(i < a.length()){
                try{
                    Document hQdata = Jsoup.connect(a).get();
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
}
