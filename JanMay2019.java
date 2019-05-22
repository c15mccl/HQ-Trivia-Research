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
<<<<<<< HEAD
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
=======
    public static void main(String args[]){
        //begin january url's
        //wString jan01t1 = "https://hqbuff.com/us/game/2019-01-01/1";
        String jan01t2 = "https://hqbuff.com/us/game/2019-01-01/2";
        String jan01t3 = "https://hqbuff.com/us/game/2019-01-01/3";
        //wString jan01t4 = "https://hqbuff.com/us/game/2019-01-01/4";

        String jan02t1 = "https://hqbuff.com/us/game/2019-01-02/1";
        String jan02t2 = "https://hqbuff.com/us/game/2019-01-02/2";
        //wString jan02t3 = "https://hqbuff.com/us/game/2019-01-02/3";

        String jan03t1 = "https://hqbuff.com/us/game/2019-01-03/1";
        String jan03t2 = "https://hqbuff.com/us/game/2019-01-03/2";
        //wString jan03t3 = "https://hqbuff.com/us/game/2019-01-03/3";

        String jan04t1 = "https://hqbuff.com/us/game/2019-01-04/1";    
        //wString jan04t2 = "https://hqbuff.com/us/game/2019-01-04/2";   

        String jan05t1 = "https://hqbuff.com/us/game/2019-01-05/1"; 
        //wString jan05t2 = "https://hqbuff.com/us/game/2019-01-05/2";     

        String jan06t1 = "https://hqbuff.com/us/game/2019-01-06/1";
        //wString jan06t2 = "https://hqbuff.com/us/game/2019-01-06/2";

        String jan07t1 = "https://hqbuff.com/us/game/2019-01-07/1";
        String jan07t2 = "https://hqbuff.com/us/game/2019-01-07/2";
        //wString jan07t3 = "https://hqbuff.com/us/game/2019-01-07/3";

        String jan08t1 = "https://hqbuff.com/us/game/2019-01-08/1";
        String jan08t2 = "https://hqbuff.com/us/game/2019-01-08/2";
        //wString jan08t3 = "https://hqbuff.com/us/game/2019-01-08/3";

        String jan09t1 = "https://hqbuff.com/us/game/2019-01-09/1";
        String jan09t2 = "https://hqbuff.com/us/game/2019-01-09/2";
        //wString jan09t3 = "https://hqbuff.com/us/game/2019-01-09/3";

        String jan10t1 = "https://hqbuff.com/us/game/2019-01-10/1";
        //wString jan10t2= "https://hqbuff.com/us/game/2019-01-10/2";
        String jan10t3 = "https://hqbuff.com/us/game/2019-01-10/3";

        String jan11t1 = "https://hqbuff.com/us/game/2019-01-11/1";
        //wString jan11t2 = "https://hqbuff.com/us/game/2019-01-11/2";

        String jan12t1 = "https://hqbuff.com/us/game/2019-01-12/1";
        //wString jan12t2 = "https://hqbuff.com/us/game/2019-01-12/2";

        String jan13t1 = "https://hqbuff.com/us/game/2019-01-13/1";
        //wString jan13t2 = "https://hqbuff.com/us/game/2019-01-13/2";

        String jan14t1 = "https://hqbuff.com/us/game/2019-01-14/1";
        String jan14t2 = "https://hqbuff.com/us/game/2019-01-14/2";
        //wString jan14t3 = "https://hqbuff.com/us/game/2019-01-14/3";

        String jan15t1 = "https://hqbuff.com/us/game/2019-01-15/1";
        String jan15t2 = "https://hqbuff.com/us/game/2019-01-15/2";
        //wString jan15t3 = "https://hqbuff.com/us/game/2019-01-15/3";

        String jan16t1 = "https://hqbuff.com/us/game/2019-01-16/1";      
        String jan16t2 = "https://hqbuff.com/us/game/2019-01-16/2";      
        //wString jan16t3 = "https://hqbuff.com/us/game/2019-01-16/3";

        String jan17t1 = "https://hqbuff.com/us/game/2019-01-17/1";
        String jan17t2 = "https://hqbuff.com/us/game/2019-01-17/2";
        //wString jan17t3 = "https://hqbuff.com/us/game/2019-01-17/3";

        String jan18t1 = "https://hqbuff.com/us/game/2019-01-18/1";
        //wString jan18t2 = "https://hqbuff.com/us/game/2019-01-18/2";

        String jan19t1 = "https://hqbuff.com/us/game/2019-01-19/1";
        //wString jan19t2 = "https://hqbuff.com/us/game/2019-01-19/2";

        String jan20t1 = "https://hqbuff.com/us/game/2019-01-20/1";
        //wString jan20t2 = "https://hqbuff.com/us/game/2019-01-20/2";

        String jan21t1 = "https://hqbuff.com/us/game/2019-01-21/1";
        String jan21t2 = "https://hqbuff.com/us/game/2019-01-21/2";
        //wString jan21t3 = "https://hqbuff.com/us/game/2019-01-21/3";

        String jan22t1 = "https://hqbuff.com/us/game/2019-01-22/1";
        String jan22t2 = "https://hqbuff.com/us/game/2019-01-22/2";
        //wString jan22t3 = "https://hqbuff.com/us/game/2019-01-22/3";

        String jan23t1 = "https://hqbuff.com/us/game/2019-01-23/1";
        String jan23t2 = "https://hqbuff.com/us/game/2019-01-23/2";
        //wString jan23t3 = "https://hqbuff.com/us/game/2019-01-23/3";

        String jan24t1 = "https://hqbuff.com/us/game/2019-01-24/1";
        String jan24t2 = "https://hqbuff.com/us/game/2019-01-24/2";
        //wString jan24t3 = "https://hqbuff.com/us/game/2019-01-24/3";

        String jan25t1 = "https://hqbuff.com/us/game/2019-01-25/1";
        //wString jan25t2 = "https://hqbuff.com/us/game/2019-01-25/2";

        String jan26t1 = "https://hqbuff.com/us/game/2019-01-26/1";
        //wString jan26t2 = "https://hqbuff.com/us/game/2019-01-26/2";

        String jan27t1 = "https://hqbuff.com/us/game/2019-01-27/1";
        //wString jan27t2 = "https://hqbuff.com/us/game/2019-01-27/2";

        String jan28t1 = "https://hqbuff.com/us/game/2019-01-28/1";
        //wString jan28t2 = "https://hqbuff.com/us/game/2019-01-28/2";
        String jan28t3 = "https://hqbuff.com/us/game/2019-01-28/3";

        String jan29t1 = "https://hqbuff.com/us/game/2019-01-29/1";
        //wString jan29t2 = "https://hqbuff.com/us/game/2019-01-29/2";
        String jan29t3 = "https://hqbuff.com/us/game/2019-01-29/3";

        String jan30t1 = "https://hqbuff.com/us/game/2019-01-30/1";
        //wString jan30t2 = "https://hqbuff.com/us/game/2019-01-30/2";
        String jan30t3 = "https://hqbuff.com/us/game/2019-01-30/3";

        String jan31t1 = "https://hqbuff.com/us/game/2019-01-31/1";
        //wString jan31t2 = "https://hqbuff.com/us/game/2019-01-31/2";
        String jan31t3 = "https://hqbuff.com/us/game/2019-01-31/3";
        //end january url's
        //begin february url's 
        //wString feb01t1 = "https://hqbuff.com/us/game/2019-02-01/1";
        String feb01t2 = "https://hqbuff.com/us/game/2019-02-01/2";

        //wString feb02t1 = "https://hqbuff.com/us/game/2019-02-02/1";
        String feb02t2 = "https://hqbuff.com/us/game/2019-02-02/2";

        String feb03t1 = "https://hqbuff.com/us/game/2019-02-03/1";
        String feb03t2 = "https://hqbuff.com/us/game/2019-02-03/2";
        //wString feb03t3 = "https://hqbuff.com/us/game/2019-02-03/3";

        String feb04t1 = "https://hqbuff.com/us/game/2019-02-04/1";
        String feb04t2 = "https://hqbuff.com/us/game/2019-02-04/2";
        //wString feb04t3 = "https://hqbuff.com/us/game/2019-02-04/3";

        String feb05t1 = "https://hqbuff.com/us/game/2019-02-05/1";
        String feb05t2 = "https://hqbuff.com/us/game/2019-02-05/2";
        //wString feb05t3 = "https://hqbuff.com/us/game/2019-02-05/3";

        String feb06t1 = "https://hqbuff.com/us/game/2019-02-06/1";
        String feb06t2 = "https://hqbuff.com/us/game/2019-02-06/2";
        //wString feb06t3 = "https://hqbuff.com/us/game/2019-02-06/3";

        String feb07t1 = "https://hqbuff.com/us/game/2019-02-07/1";
        String feb07t2 = "https://hqbuff.com/us/game/2019-02-07/2";
        //wString feb07t3 = "https://hqbuff.com/us/game/2019-02-07/3";

        String feb08t1 = "https://hqbuff.com/us/game/2019-02-08/1";
        //wString feb08t2 = "https://hqbuff.com/us/game/2019-02-08/2";

        //wString feb09t1 = "https://hqbuff.com/us/game/2019-02-09/1";
        String feb09t2 = "https://hqbuff.com/us/game/2019-02-09/2";
        //wString feb09t3 = "https://hqbuff.com/us/game/2019-02-09/3";

        String feb10t1 = "https://hqbuff.com/us/game/2019-02-10/1";
        //wString feb10t2 = "https://hqbuff.com/us/game/2019-02-10/2";

        String feb11t1 = "https://hqbuff.com/us/game/2019-02-11/1";
        String feb11t2 = "https://hqbuff.com/us/game/2019-02-11/2";
        //wString feb11t3 = "https://hqbuff.com/us/game/2019-02-11/3";

        String feb12t1 = "https://hqbuff.com/us/game/2019-02-12/1";
        String feb12t2 = "https://hqbuff.com/us/game/2019-02-12/2";
        //wString feb12t3 = "https://hqbuff.com/us/game/2019-02-12/3";

        String feb13t1 = "https://hqbuff.com/us/game/2019-02-13/1";
        String feb13t2 = "https://hqbuff.com/us/game/2019-02-13/2";
        //wString feb13t3 = "https://hqbuff.com/us/game/2019-02-13/3";

        String feb14t1 = "https://hqbuff.com/us/game/2019-02-14/1";
        String feb14t2 = "https://hqbuff.com/us/game/2019-02-14/2";
        //wString feb14t3 = "https://hqbuff.com/us/game/2019-02-14/3";

        String feb15t1 = "https://hqbuff.com/us/game/2019-02-15/1";
        //wString feb15t2 = "https://hqbuff.com/us/game/2019-02-15/2";

        //w String feb16t1 = "https://hqbuff.com/us/game/2019-02-16/1";
        String feb16t2 = "https://hqbuff.com/us/game/2019-02-16/2";
        //wString feb16t3 = "https://hqbuff.com/us/game/2019-02-16/3";

        String feb17t1 = "https://hqbuff.com/us/game/2019-02-17/1";
        String feb17t2 = "https://hqbuff.com/us/game/2019-02-17/2";
        //wString feb17t3 = "https://hqbuff.com/us/game/2019-02-17/3";

        String feb18t1 = "https://hqbuff.com/us/game/2019-02-18/1";
        String feb18t2 = "https://hqbuff.com/us/game/2019-02-18/2";
        //wString feb18t3 = "https://hqbuff.com/us/game/2019-02-18/3";

        String feb19t1 = "https://hqbuff.com/us/game/2019-02-19/1";
        String feb19t2 = "https://hqbuff.com/us/game/2019-02-19/2";
        //wString feb19t3 = "https://hqbuff.com/us/game/2019-02-19/3";

        String feb20t1 = "https://hqbuff.com/us/game/2019-02-20/1";
        String feb20t2 = "https://hqbuff.com/us/game/2019-02-20/2";
        //wString feb20t3 = "https://hqbuff.com/us/game/2019-02-20/3";

        String feb21t1 = "https://hqbuff.com/us/game/2019-02-21/1";
        String feb21t2 = "https://hqbuff.com/us/game/2019-02-21/2";
        //wString feb21t3 = "https://hqbuff.com/us/game/2019-02-21/3";

        String feb22t1 = "https://hqbuff.com/us/game/2019-02-22/1";
        //w String feb22t2 = "https://hqbuff.com/us/game/2019-02-22/2";

        //wString feb23t1 = "https://hqbuff.com/us/game/2019-02-23/1";
        String feb23t2 = "https://hqbuff.com/us/game/2019-02-23/2";
        //wString feb23t3 = "https://hqbuff.com/us/game/2019-02-23/3";

        String feb24t1 = "https://hqbuff.com/us/game/2019-02-24/1";
        //wString feb24t2 = "https://hqbuff.com/us/game/2019-02-24/2";

        String feb25t1 = "https://hqbuff.com/us/game/2019-02-25/1";
        String feb25t2 = "https://hqbuff.com/us/game/2019-02-25/2";
        //wString feb25t3 = "https://hqbuff.com/us/game/2019-02-25/3";

        String feb26t1 = "https://hqbuff.com/us/game/2019-02-26/1";
        String feb26t2 = "https://hqbuff.com/us/game/2019-02-26/2";
        //wString feb26t3 = "https://hqbuff.com/us/game/2019-02-26/3";

        String feb27t1 = "https://hqbuff.com/us/game/2019-02-27/1";
        String feb27t2 = "https://hqbuff.com/us/game/2019-02-27/2";
        //wString feb27t3 = "https://hqbuff.com/us/game/2019-02-27/3";

        String feb28t1 = "https://hqbuff.com/us/game/2019-02-28/1";
        String feb28t2 = "https://hqbuff.com/us/game/2019-02-28/2";
        //wString feb28t3 = "https://hqbuff.com/us/game/2019-02-28/3";
        //end february url's 
        //begin march url's 
        String march01t1 = "https://hqbuff.com/us/game/2019-03-01/1";
        //wString march01t2 = "https://hqbuff.com/us/game/2019-03-01/2";

        //wString march02t1 = "https://hqbuff.com/us/game/2019-03-02/1";
        String march02t2 = "https://hqbuff.com/us/game/2019-03-02/2";
        //wString march02t3 = "https://hqbuff.com/us/game/2019-03-02/3";

        String march03t1 = "https://hqbuff.com/us/game/2019-03-03/1";
        //wString march03t2 = "https://hqbuff.com/us/game/2019-03-03/2";

        String march04t1 = "https://hqbuff.com/us/game/2019-03-04/1";
        String march04t2 = "https://hqbuff.com/us/game/2019-03-04/2";
        //wString march04t3 = "https://hqbuff.com/us/game/2019-03-04/3";

        String march05t1 = "https://hqbuff.com/us/game/2019-03-05/1";
        String march05t2 = "https://hqbuff.com/us/game/2019-03-05/2";
        //wString march05t3 = "https://hqbuff.com/us/game/2019-03-05/3";

        String march06t1 = "https://hqbuff.com/us/game/2019-03-06/1";
        String march06t2 = "https://hqbuff.com/us/game/2019-03-06/2";
        //wString march06t3 = "https://hqbuff.com/us/game/2019-03-06/3";

        String march07t1 = "https://hqbuff.com/us/game/2019-03-07/1";
        String march07t2 = "https://hqbuff.com/us/game/2019-03-07/2";
        //wString march07t3 = "https://hqbuff.com/us/game/2019-03-07/3";

        String march08t1 = "https://hqbuff.com/us/game/2019-03-08/1";
        //wString march08t2 = "https://hqbuff.com/us/game/2019-03-08/2";

        String march09t1 = "https://hqbuff.com/us/game/2019-03-09/1";
        //wString march09t2 = "https://hqbuff.com/us/game/2019-03-09/2";

        String march10t1 = "https://hqbuff.com/us/game/2019-03-10/1";
        String march10t2 = "https://hqbuff.com/us/game/2019-03-10/2";
        //wString march10t3 = "https://hqbuff.com/us/game/2019-03-10/3";

        String march11t1 = "https://hqbuff.com/us/game/2019-03-11/1";
        String march11t2 = "https://hqbuff.com/us/game/2019-03-11/2";
        //wString march11t3 = "https://hqbuff.com/us/game/2019-03-11/3";

        String march12t1 = "https://hqbuff.com/us/game/2019-03-12/1";
        String march12t2 = "https://hqbuff.com/us/game/2019-03-12/2";
        //wString march12t3 = "https://hqbuff.com/us/game/2019-03-12/3";

        String march13t1 = "https://hqbuff.com/us/game/2019-03-13/1";
        String march13t2 = "https://hqbuff.com/us/game/2019-03-13/2";
        String march13t3 = "https://hqbuff.com/us/game/2019-03-13/3";
        //wString march13t4 = "https://hqbuff.com/us/game/2019-03-13/4";

        String march14t1 = "https://hqbuff.com/us/game/2019-03-14/1";
        String march14t2 = "https://hqbuff.com/us/game/2019-03-14/2";
        //wString march14t3 = "https://hqbuff.com/us/game/2019-03-14/3";

        String march15t1 = "https://hqbuff.com/us/game/2019-03-15/1";
        //wString march15t2 = "https://hqbuff.com/us/game/2019-03-15/2";

        String march16t1 = "https://hqbuff.com/us/game/2019-03-16/1";
        //wString march16t2 = "https://hqbuff.com/us/game/2019-03-16/2";

        String march17t1 = "https://hqbuff.com/us/game/2019-03-17/1";
        //wString march17t2 = "https://hqbuff.com/us/game/2019-03-17/2";

        //page not found between march 18/19th 

        String march20t1 = "https://hqbuff.com/us/game/2019-03-20/1";
        //wString march20t2 = "https://hqbuff.com/us/game/2019-03-20/2";
        String march20t3 = "https://hqbuff.com/us/game/2019-03-20/3";

        String march21t1 = "https://hqbuff.com/us/game/2019-03-21/1";
        String march21t2 = "https://hqbuff.com/us/game/2019-03-21/2";
        String march21t3 = "https://hqbuff.com/us/game/2019-03-21/3";
        //wString march21t4 = "https://hqbuff.com/us/game/2019-03-21/4";

        String march22t1 = "https://hqbuff.com/us/game/2019-03-22/1";
        //wString march22t2 = "https://hqbuff.com/us/game/2019-03-22/2";

        String march23t1 = "https://hqbuff.com/us/game/2019-03-23/1";
        //wString march23t2 = "https://hqbuff.com/us/game/2019-03-23/2";

        String march24t1 = "https://hqbuff.com/us/game/2019-03-24/1";
        //wString march24t2 = "https://hqbuff.com/us/game/2019-03-24/2";

        String march25t1 = "https://hqbuff.com/us/game/2019-03-25/1";
        String march25t2 = "https://hqbuff.com/us/game/2019-03-25/2";
        //wString march25t3 = "https://hqbuff.com/us/game/2019-03-25/3";

        String march26t1 = "https://hqbuff.com/us/game/2019-03-26/1";
        String march26t2 = "https://hqbuff.com/us/game/2019-03-26/2";
        //wString march26t3 = "https://hqbuff.com/us/game/2019-03-26/3";

        String march27t1 = "https://hqbuff.com/us/game/2019-03-27/1";
        String march27t2 = "https://hqbuff.com/us/game/2019-03-27/2";
        //wString march27t3 = "https://hqbuff.com/us/game/2019-03-27/3";

        String march28t1 = "https://hqbuff.com/us/game/2019-03-27/1";
        String march28t2 = "https://hqbuff.com/us/game/2019-03-27/2";
        //t3 w
        String march29t1 = "https://hqbuff.com/us/game/2019-03-29/1";
        //t2 w
        String march30t1 = "https://hqbuff.com/us/game/2019-03-30/1";
        //t2 w
        String march31t1 = "https://hqbuff.com/us/game/2019-03-31/1";
        //t2 w 

        //begin april url's
        String april01t1 = "https://hqbuff.com/us/game/2019-04-01/1";
        String april01t2 = "https://hqbuff.com/us/game/2019-04-01/2";
        String april01t3 = "https://hqbuff.com/us/game/2019-04-01/3";
        //t4 w 
        String april02t1 = "https://hqbuff.com/us/game/2019-04-02/1";
        //t2 w 
        String april03t1 = "https://hqbuff.com/us/game/2019-04-03/1";
        String april03t2 = "https://hqbuff.com/us/game/2019-04-03/2";
        //t3 w

        String april04t1 = "https://hqbuff.com/us/game/2019-04-04/1";
        String april04t2 = "https://hqbuff.com/us/game/2019-04-04/2";
        //t3 w

        String april05t1 = "https://hqbuff.com/us/game/2019-04-05/1";
        //t2 w 
        String april06t1 = "https://hqbuff.com/us/game/2019-04-06/1";
        //t2 w 

        String april07t1 = "https://hqbuff.com/us/game/2019-04-07/1";
        //t2 w 

        String april08t1 = "https://hqbuff.com/us/game/2019-04-08/1";
        String april08t2 = "https://hqbuff.com/us/game/2019-04-08/2";
        //t3 w

        String april09t1 = "https://hqbuff.com/us/game/2019-04-09/1";
        String april09t2 = "https://hqbuff.com/us/game/2019-04-09/2";
        //t3 w

        String april10t1 = "https://hqbuff.com/us/game/2019-04-10/1";
        String april10t2 = "https://hqbuff.com/us/game/2019-04-10/2";
        //t3 w
        String april11t1 = "https://hqbuff.com/us/game/2019-04-11/1";
        String april11t2 = "https://hqbuff.com/us/game/2019-04-11/2";
        //t3 w

        String april12t1 = "https://hqbuff.com/us/game/2019-04-12/1";
        //t2 w 

        String april13t1 = "https://hqbuff.com/us/game/2019-04-13/1";
        //t2 w 

        String april14t1 = "https://hqbuff.com/us/game/2019-04-14/1";
        //t2 w 

        String april15t1 = "https://hqbuff.com/us/game/2019-04-15/1";
        String april15t2 = "https://hqbuff.com/us/game/2019-04-15/2";
        //t3 w

        String april16t1 = "https://hqbuff.com/us/game/2019-04-16/1";
        String april16t2 = "https://hqbuff.com/us/game/2019-04-16/2";
        //t3 w

        String april17t1 = "https://hqbuff.com/us/game/2019-04-17/1";
        String april17t2 = "https://hqbuff.com/us/game/2019-04-17/2";
        //t3 w

        String april18t1 = "https://hqbuff.com/us/game/2019-04-18/1";
        String april18t2 = "https://hqbuff.com/us/game/2019-04-18/2";
        //t3 w

        String april19t1 = "https://hqbuff.com/us/game/2019-04-19/1";
        //t2 w 

        String april20t1 = "https://hqbuff.com/us/game/2019-04-20/1";
        //t2 w 

        String april21t1 = "https://hqbuff.com/us/game/2019-04-21/1";
        String april21t2 = "https://hqbuff.com/us/game/2019-04-21/2";
        //t3 w

        String april22t1 = "https://hqbuff.com/us/game/2019-04-22/1";
        String april22t2 = "https://hqbuff.com/us/game/2019-04-22/2";
        //t3 w

        String april23t1 = "https://hqbuff.com/us/game/2019-04-23/1";
        String april23t2 = "https://hqbuff.com/us/game/2019-04-23/2";
        //t3 w

        String april24t1 = "https://hqbuff.com/us/game/2019-04-24/1";
        String april24t2 = "https://hqbuff.com/us/game/2019-04-24/2";
        //t3 w

        String april25t1 = "https://hqbuff.com/us/game/2019-04-25/1";
        String april25t2 = "https://hqbuff.com/us/game/2019-04-25/2";
        //t3 w

        String april26t1 = "https://hqbuff.com/us/game/2019-04-26/1";
        //t2 w 

        String april27t1 = "https://hqbuff.com/us/game/2019-04-27/1";
        //t2 w 

        String april28t1 = "https://hqbuff.com/us/game/2019-04-28/1";
        //t2 w 

        String april29t1 = "https://hqbuff.com/us/game/2019-04-29/1";
        String april29t2 = "https://hqbuff.com/us/game/2019-04-29/2";
        //t3 w

        String april30t1 = "https://hqbuff.com/us/game/2019-04-30/1";
        String april30t2 = "https://hqbuff.com/us/game/2019-04-30/2";
        //t3 w

        //end april url's 
        //begin may url's 
        String may01t1 = "https://hqbuff.com/us/game/2019-05-01/1";
        String may01t2 = "https://hqbuff.com/us/game/2019-05-01/2";
        //t3 w 
        String may01t4 = "https://hqbuff.com/us/game/2019-05-01/4";

        String may02t1 = "https://hqbuff.com/us/game/2019-05-02/1";
        String may02t2 = "https://hqbuff.com/us/game/2019-05-02/2";
        //t3 w

        String may03t1 = "https://hqbuff.com/us/game/2019-05-03/1";
        //t2 w 

        String may04t1 = "https://hqbuff.com/us/game/2019-05-04/1";
        String may04t2 = "https://hqbuff.com/us/game/2019-05-04/2";
        //t3 w

        String may05t1 = "https://hqbuff.com/us/game/2019-05-05/1";
        //t2 w 

        String may06t1 = "https://hqbuff.com/us/game/2019-05-06/1";
        String may06t2 = "https://hqbuff.com/us/game/2019-05-06/2";
        //t3 w

        String may07t1 = "https://hqbuff.com/us/game/2019-05-07/1";
        String may07t2 = "https://hqbuff.com/us/game/2019-05-07/2";
        String may07t3 = "https://hqbuff.com/us/game/2019-05-07/3";
        //t4 w 

        String may08t1 = "https://hqbuff.com/us/game/2019-05-08/1";
        String may08t2 = "https://hqbuff.com/us/game/2019-05-08/2";
        //t3 w

        String may09t1 = "https://hqbuff.com/us/game/2019-05-09/1";
        String may09t2 = "https://hqbuff.com/us/game/2019-05-09/2";
        //t3 w

        String may10t1 = "https://hqbuff.com/us/game/2019-05-10/1";
        //t2 w 

        String may11t1 = "https://hqbuff.com/us/game/2019-05-11/1";
        //t2 w 

        String may12t1 = "https://hqbuff.com/us/game/2019-05-12/1";
        //t2 w 

        String may13t1 = "https://hqbuff.com/us/game/2019-05-13/1";
        String may13t2 = "https://hqbuff.com/us/game/2019-05-13/2";
        //t3 w

        String may14t1 = "https://hqbuff.com/us/game/2019-05-14/1";
        String may14t2 = "https://hqbuff.com/us/game/2019-05-14/2";
        //t3 w

        String may15t1 = "https://hqbuff.com/us/game/2019-05-15/1";
        String may15t2 = "https://hqbuff.com/us/game/2019-05-15/2";
        //t3 w

        String may16t1 = "https://hqbuff.com/us/game/2019-05-16/1";
        String may16t2 = "https://hqbuff.com/us/game/2019-05-16/2";
        //t3, t4 w

        String may17t1 = "https://hqbuff.com/us/game/2019-05-17/1";
        //t2 w 

        String may18t1 = "https://hqbuff.com/us/game/2019-05-18/1";
        String may18t2 = "https://hqbuff.com/us/game/2019-05-18/2";
        //t3 w

        String may19t1 = "https://hqbuff.com/us/game/2019-05-19/1";
        String may19t2 = "https://hqbuff.com/us/game/2019-05-19/2";
        //t3 w

        String may20t1 = "";
        
        
>>>>>>> 4bc27a9c10830cd8b1e40c46ffa367303aa4b30e
    }
}
