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

    public static void main(String [] args)
    {
        ArrayList <String> list = new ArrayList<String>();
        //SEPTEMBER URL'S
        String sep01 = "https://hqbuff.com/us/game/2018-09-01/1";
        list.add(sep01);

        String sep02 = "https://hqbuff.com/us/game/2018-09-02/1";
        list.add(sep02);
        
        String sep03 = "https://hqbuff.com/us/game/2018-09-03/1";
        list.add(sep03);
        String sep03t2 = "https://hqbuff.com/us/game/2018-09-03/2";
        list.add(sep03t2);

        String sep04 = "https://hqbuff.com/us/game/2018-09-04/1";
        list.add(sep04);
        String sep04t2 = "https://hqbuff.com/us/game/2018-09-04/2";
        list.add(sep04t2);

        String sep05 = "https://hqbuff.com/us/game/2018-09-05/1";
        list.add(sep05);
        String sep05t2 = "https://hqbuff.com/us/game/2018-09-05/2";
        list.add(sep05t2);
        String sep05t3 = "https://hqbuff.com/us/game/2018-09-05/3";
        list.add(sep05t3);

        String sep06 = "https://hqbuff.com/us/game/2018-09-06/1";
        list.add(sep06);
        String sep06t2 = "https://hqbuff.com/us/game/2018-09-06/2";
        list.add(sep06t2);

        String sep07 = "https://hqbuff.com/us/game/2018-09-07/1";
        list.add(sep07);

        String sep08 = "https://hqbuff.com/us/game/2018-09-08/1";
        list.add(sep08);

        String sep09 = "https://hqbuff.com/us/game/2018-09-09/1";
        list.add(sep09);
        String sep09t2 = "https://hqbuff.com/us/game/2018-09-09/2";
        list.add(sep09t2);

        String sep10 = "https://hqbuff.com/us/game/2018-09-10/1";
        list.add(sep10);
        String sep10t2 = "https://hqbuff.com/us/game/2018-09-10/2";
        list.add(sep10t2);

        String sep11 = "https://hqbuff.com/us/game/2018-09-11/1";
        list.add(sep11);
        String sep11t2 = "https://hqbuff.com/us/game/2018-09-11/2";
        list.add(sep11t2);

        String sep12 = "https://hqbuff.com/us/game/2018-09-12/1";
        list.add(sep12);
        String sep12t2 = "https://hqbuff.com/us/game/2018-09-12/2";
        list.add(sep12t2);

        String sep13 = "https://hqbuff.com/us/game/2018-09-13/1";
        list.add(sep13);

        String sep14 = "https://hqbuff.com/us/game/2018-09-14/1";
        list.add(sep14);

        String sep15 = "https://hqbuff.com/us/game/2018-09-15/1";
        list.add(sep15);
        

        String sep16 = "https://hqbuff.com/us/game/2018-09-16/1";
        list.add(sep16);

        String sep17 = "https://hqbuff.com/us/game/2018-09-17/1";
        list.add(sep17);
        String sep17t2 = "https://hqbuff.com/us/game/2018-09-17/2";
        list.add(sep17t2);

        String sep18 = "https://hqbuff.com/us/game/2018-09-18/1";
        list.add(sep18);
        String sep18t2 = "https://hqbuff.com/us/game/2018-09-18/2";
        list.add(sep18t2);

        String sep19 = "https://hqbuff.com/us/game/2018-09-19/1";
        list.add(sep19);
        String sep19t2 = "https://hqbuff.com/us/game/2018-09-19/2";
        list.add(sep19t2);

        String sep20 = "https://hqbuff.com/us/game/2018-09-20/1";
        list.add(sep20);
        String sep20t2 = "https://hqbuff.com/us/game/2018-09-20/2";
        list.add(sep20t2);

        String sep21 = "https://hqbuff.com/us/game/2018-09-21/1";
        list.add(sep21);

        String sep22 = "https://hqbuff.com/us/game/2018-09-22/1";
        list.add(sep22);

        String sep23 = "https://hqbuff.com/us/game/2018-09-23/1";
        list.add(sep23);

        String sep24 = "https://hqbuff.com/us/game/2018-09-24/1";
        list.add(sep24);
        String sep24t2 = "https://hqbuff.com/us/game/2018-09-24/2";
        list.add(sep24t2);

        String sep25 = "https://hqbuff.com/us/game/2018-09-25/1";
        list.add(sep25);
        String sep25t2 = "https://hqbuff.com/us/game/2018-09-25/2";
        list.add(sep25t2);

        String sep26 = "https://hqbuff.com/us/game/2018-09-26/1";
        list.add(sep26);
        String sep26t2 = "https://hqbuff.com/us/game/2018-09-26/2";
        list.add(sep26t2);

        String sep27 = "https://hqbuff.com/us/game/2018-09-27/1";
        list.add(sep27);
        String sep27t2 = "https://hqbuff.com/us/game/2018-09-27/2";
        list.add(sep27t2);

        String sep28 = "https://hqbuff.com/us/game/2018-09-28/1";
        list.add(sep28);

        String sep29 = "https://hqbuff.com/us/game/2018-09-29/1";
        list.add(sep29);

        String sep30 = "https://hqbuff.com/us/game/2018-09-30/1";
        list.add(sep30);

        //OCTOBER URL'S
        String oct01 = "https://hqbuff.com/us/game/2018-10-01/1";
        list.add(oct01);
        String oct01t2 = "https://hqbuff.com/us/game/2018-10-01/2";
        list.add(oct01t2);

        String oct02 ="https://hqbuff.com/us/game/2018-10-02/1";
        list.add(oct02);
        String oct02t2 ="https://hqbuff.com/us/game/2018-10-02/2";
        list.add(oct02t2);

        String oct03 = "https://hqbuff.com/us/game/2018-10-03/1";
        list.add(oct03);
        String oct03t2 = "https://hqbuff.com/us/game/2018-10-03/2";
        list.add(oct03t2);

        String oct04 = "https://hqbuff.com/us/game/2018-10-04/1";
        list.add(oct04);
        String oct04t2 = "https://hqbuff.com/us/game/2018-10-04/2";
        list.add(oct04t2);

        String oct05 = "https://hqbuff.com/us/game/2018-10-05/1";
        list.add(oct05);

        String oct06 = "https://hqbuff.com/us/game/2018-10-06/1";
        list.add(oct06);

        String oct07 ="https://hqbuff.com/us/game/2018-10-07/1";
        list.add(oct07);

        String oct08 = "https://hqbuff.com/us/game/2018-10-08/1";
        list.add(oct08);
        String oct08t2 = "https://hqbuff.com/us/game/2018-10-08/2";
        list.add(oct08t2);

        String oct09 = "https://hqbuff.com/us/game/2018-10-09/1";
        list.add(oct09);
        String oct09t2 = "https://hqbuff.com/us/game/2018-10-09/2";
        list.add(oct09t2);

        String oct10 = "https://hqbuff.com/us/game/2018-10-10/1";
        list.add(oct10);
        String oct10t2 = "https://hqbuff.com/us/game/2018-10-10/2";
        list.add(oct10t2);

        String oct11= "https://hqbuff.com/us/game/2018-10-11/1";
        list.add(oct11);
        String oct11t2= "https://hqbuff.com/us/game/2018-10-11/2";
        list.add(oct11t2);

        String oct12 = "https://hqbuff.com/us/game/2018-10-12/1";
        list.add(oct12);

        String oct13 = "https://hqbuff.com/us/game/2018-10-13/1";
        list.add(oct13);

        String oct14 = "https://hqbuff.com/us/game/2018-10-14/1";
        list.add(oct14);

        String oct15 = "https://hqbuff.com/us/game/2018-10-15/1";
        list.add(oct15);
        String oct15t2 = "https://hqbuff.com/us/game/2018-10-15/2";
        list.add(oct15t2);

        String oct16 = "https://hqbuff.com/us/game/2018-10-16/1";
        list.add(oct16);
        String oct16t2 = "https://hqbuff.com/us/game/2018-10-16/2";
        list.add(oct16t2);

        String oct17 = "https://hqbuff.com/us/game/2018-10-17/1";
        list.add(oct17);
        String oct17t2 = "https://hqbuff.com/us/game/2018-10-17/2";
        list.add(oct17t2);

        String oct18 = "https://hqbuff.com/us/game/2018-10-18/1";
        list.add(oct18);
        String oct18t2 = "https://hqbuff.com/us/game/2018-10-18/2";
        list.add(oct18t2);

        String oct19 = "https://hqbuff.com/us/game/2018-10-19/1";
        list.add(oct19);

        String oct20 = "https://hqbuff.com/us/game/2018-10-20/1";
        list.add(oct20);

        String oct21 = "https://hqbuff.com/us/game/2018-10-21/1";
        list.add(oct21);

        String oct22 = "https://hqbuff.com/us/game/2018-10-22/1";
        list.add(oct22);

        String oct23= "https://hqbuff.com/us/game/2018-10-23/1";
        list.add(oct23);
        String oct23t2= "https://hqbuff.com/us/game/2018-10-23/2";
        list.add(oct23t2);
        String oct23t3= "https://hqbuff.com/us/game/2018-10-23/3";
        list.add(oct23t3);

        String oct24 = "https://hqbuff.com/us/game/2018-10-24/1";
        list.add(oct24);

        String oct25 = "https://hqbuff.com/us/game/2018-10-25/1";
        list.add(oct25);
        String oct25t2 = "https://hqbuff.com/us/game/2018-10-25/2";
        list.add(oct25t2);

        String oct26 = "https://hqbuff.com/us/game/2018-10-26/1";
        list.add(oct26);

        String oct27 = "https://hqbuff.com/us/game/2018-10-27/1";
        list.add(oct27);

        String oct28 = "https://hqbuff.com/us/game/2018-10-28/1";
        list.add(oct28);

        String oct29 = "https://hqbuff.com/us/game/2018-10-29/1";
        list.add(oct29);
        String oct29t2 = "https://hqbuff.com/us/game/2018-10-29/1";
        list.add(oct29t2);

        String oct30 = "https://hqbuff.com/us/game/2018-10-30/1";
        list.add(oct30);
        String oct30t2 = "https://hqbuff.com/us/game/2018-10-30/2";
        list.add(oct30t2);

        String oct31 = "https://hqbuff.com/us/game/2018-10-31/1";
        list.add(oct31);
        String oct31t2 = "https://hqbuff.com/us/game/2018-10-31/2";
        list.add(oct31t2);

        //NOVEMBER URL'S

        String nov01 = "https://hqbuff.com/us/game/2018-11-01/1";
        list.add(nov01);
        String nov01t2 = "https://hqbuff.com/us/game/2018-11-01/2";
        list.add(nov01t2);

        String nov02 = "https://hqbuff.com/us/game/2018-11-02/1";
        list.add(nov02);

        String nov03 = "https://hqbuff.com/us/game/2018-11-03/1";
        list.add(nov03);

        String nov04 = "https://hqbuff.com/us/game/2018-11-04/1";
        list.add(nov04);

        String nov05 = "https://hqbuff.com/us/game/2018-11-05/1";
        list.add(nov05);
        String nov05t2 = "https://hqbuff.com/us/game/2018-11-05/2";
        list.add(nov05t2);

        String nov06 = "https://hqbuff.com/us/game/2018-11-06/1";
        list.add(nov06);
        String nov06t2 = "https://hqbuff.com/us/game/2018-11-06/2";
        list.add(nov06t2);

        String nov07 = "https://hqbuff.com/us/game/2018-11-07/1";
        list.add(nov07);
        String nov07t2 = "https://hqbuff.com/us/game/2018-11-07/2";
        list.add(nov07t2);

        String nov08 = "https://hqbuff.com/us/game/2018-11-08/1";
        list.add(nov08);
        String nov08t2 = "https://hqbuff.com/us/game/2018-11-08/1";
        list.add(nov08t2);

        String nov09 = "https://hqbuff.com/us/game/2018-11-09/1";
        list.add(nov09);

        String nov10 = "https://hqbuff.com/us/game/2018-11-10/1";
        list.add(nov10);

        String nov11 = "https://hqbuff.com/us/game/2018-11-11/1";
        list.add(nov11);

        String nov12 = "https://hqbuff.com/us/game/2018-11-12/1";
        list.add(nov12);
        String nov12t2 = "https://hqbuff.com/us/game/2018-11-12/2";
        list.add(nov12t2);

        String nov13 = "https://hqbuff.com/us/game/2018-11-13/1";
        list.add(nov13);
        String nov13t2 = "https://hqbuff.com/us/game/2018-11-13/2";
        list.add(nov13t2);

        String nov14 = "https://hqbuff.com/us/game/2018-11-14/1";
        list.add(nov14);
        String nov14t2 = "https://hqbuff.com/us/game/2018-11-14/2";
        list.add(nov14t2);

        String nov15 = "https://hqbuff.com/us/game/2018-11-15/1";
        list.add(nov15);
        String nov15t2 = "https://hqbuff.com/us/game/2018-11-15/2";
        list.add(nov15t2);

        String nov16 = "https://hqbuff.com/us/game/2018-11-16/1";
        list.add(nov16);

        String nov17 = "https://hqbuff.com/us/game/2018-11-17/1";
        list.add(nov17);

        String nov18 = "https://hqbuff.com/us/game/2018-11-18/1";
        list.add(nov18);

        String nov19 = "https://hqbuff.com/us/game/2018-11-19/1";
        list.add(nov19);
        String nov19t2 = "https://hqbuff.com/us/game/2018-11-19/2";
        list.add(nov19t2);

        String nov20 = "https://hqbuff.com/us/game/2018-11-20/1";
        list.add(nov20);
        String nov20t2 = "https://hqbuff.com/us/game/2018-11-20/2";
        list.add(nov20t2);

        String nov21 = "https://hqbuff.com/us/game/2018-11-21/1";
        list.add(nov21);

        String nov22 = "https://hqbuff.com/us/game/2018-11-22/1";
        list.add(nov22);
        String nov22t2 = "https://hqbuff.com/us/game/2018-11-22/2";
        list.add(nov22t2);

        String nov23 = "https://hqbuff.com/us/game/2018-11-23/1";
        list.add(nov23);

        String nov24 = "https://hqbuff.com/us/game/2018-11-24/1";
        list.add(nov24);

        String nov25 = "https://hqbuff.com/us/game/2018-11-25/1";
        list.add(nov25);

        String nov26 = "https://hqbuff.com/us/game/2018-11-26/1";
        list.add(nov26);
        String nov26t2 = "https://hqbuff.com/us/game/2018-11-26/2";
        list.add(nov26t2);

        String nov27 = "https://hqbuff.com/us/game/2018-11-27/1";
        list.add(nov27);
        String nov27t2 = "https://hqbuff.com/us/game/2018-11-27/2";
        list.add(nov27t2);

        String nov28 = "https://hqbuff.com/us/game/2018-11-28/1";
        list.add(nov28);
        String nov28t2 = "https://hqbuff.com/us/game/2018-11-28/2";
        list.add(nov28t2);

        String nov29 = "https://hqbuff.com/us/game/2018-11-29/1";
        list.add(nov29);
        String nov29t2 = "https://hqbuff.com/us/game/2018-11-29/2";
        list.add(nov29t2);
        //t3 was an hq word

        //t1 was an hq word
        String nov30 = "https://hqbuff.com/us/game/2018-11-30/2";
        list.add(nov30);

        //DECEMBER URL'S

        String dec01 = "https://hqbuff.com/us/game/2018-12-01/1";
        list.add(dec01);

        String dec02 = "https://hqbuff.com/us/game/2018-12-02/1";
        list.add(dec02);
        //t2 was an hq word

        //dec 3 only had one time and it was an hq word

        String dec04 = "https://hqbuff.com/us/game/2018-12-04/2";
        list.add(dec04);
        String dec04t2 = "https://hqbuff.com/us/game/2018-12-04/3";
        list.add(dec04t2);
        //t1 was an hq word

        String dec05 = "https://hqbuff.com/us/game/2018-12-05/2";
        list.add(dec05);
        String dec05t2 = "https://hqbuff.com/us/game/2018-12-05/3";
        list.add(dec05t2);
        //t1 was an hq word

        String dec06 = "https://hqbuff.com/us/game/2018-12-06/2";
        list.add(dec06);
        String dec06t2 = "https://hqbuff.com/us/game/2018-12-06/3";
        list.add(dec06t2);
        //t1 and t4 both were hq word

        String dec07 = "https://hqbuff.com/us/game/2018-12-07/2";
        list.add(dec07);
        //t1 was an hq word

        String dec08 = "https://hqbuff.com/us/game/2018-12-08/1";
        list.add(dec08);

        String dec09 = "https://hqbuff.com/us/game/2018-12-09/1";
        list.add(dec09);
        //t2 was an hq word

        String dec10 = "https://hqbuff.com/us/game/2018-12-10/2";
        list.add(dec10);
        String dec10t2 = "https://hqbuff.com/us/game/2018-12-10/3";
        list.add(dec10t2);
        //t1 was an hq word

        String dec11 = "https://hqbuff.com/us/game/2018-12-11/2";
        list.add(dec11);
        String dec11t2 = "https://hqbuff.com/us/game/2018-12-11/3";
        list.add(dec11t2);
        //t1 was an hq word

        String dec12 = "https://hqbuff.com/us/game/2018-12-12/2";
        list.add(dec12);
        String dec12t2 = "https://hqbuff.com/us/game/2018-12-12/3";
        list.add(dec12t2);
        //t1 and t4 both hq word

        String dec13 = "https://hqbuff.com/us/game/2018-12-13/2";
        list.add(dec13);
        String dec13t2 = "https://hqbuff.com/us/game/2018-12-13/3";
        list.add(dec13t2);
        //t1 was an hq word

        String dec14 = "https://hqbuff.com/us/game/2018-12-14/2";
        list.add(dec14);
        String dec14t2 = "https://hqbuff.com/us/game/2018-12-14/3";
        list.add(dec14t2);
        //t1 was an hq word

        String dec15 = "https://hqbuff.com/us/game/2018-12-15/1";
        list.add(dec15);

        //DEC16 NO DATA RECORDED

        String dec17 = "https://hqbuff.com/us/game/2018-12-17/1";
        list.add(dec17);
        //T2 WAS AN HQ WORD

        String dec18 = "https://hqbuff.com/us/game/2018-12-18/1";
        list.add(dec18);
        String dec18t2 = "https://hqbuff.com/us/game/2018-12-18/2";
        list.add(dec18t2);
        //t3 was an hq word

        String dec19 = "https://hqbuff.com/us/game/2018-12-19/1";
        list.add(dec19);
        String dec19t2 = "https://hqbuff.com/us/game/2018-12-19/2";
        list.add(dec19t2);
        //t3 was an hq word

        String dec20 = "https://hqbuff.com/us/game/2018-12-20/1";
        list.add(dec20);
        String dec20t2 = "https://hqbuff.com/us/game/2018-12-20/2";
        list.add(dec20t2);
        //t3 was an hq word

        String dec21 = "https://hqbuff.com/us/game/2018-12-21/1";
        list.add(dec21);
        String dec21t2 = "https://hqbuff.com/us/game/2018-12-21/2";
        list.add(dec21t2);
        //t3 was an hq word

        String dec22 = "https://hqbuff.com/us/game/2018-12-22/1";
        list.add(dec22);
        //t2 was an hq word

        String dec23 = "https://hqbuff.com/us/game/2018-12-23/1";
        list.add(dec23);
        //t2 was an hq word

        String dec24 = "https://hqbuff.com/us/game/2018-12-24/1";
        list.add(dec24);

        String dec25 = "https://hqbuff.com/us/game/2018-12-25/1";
        list.add(dec25);
        String dec25t2 = "https://hqbuff.com/us/game/2018-12-25/2";
        list.add(dec25t2);
        String dec25t3 = "https://hqbuff.com/us/game/2018-12-25/3";
        list.add(dec25t3);
        //t4 was an hq word

        String dec26 = "https://hqbuff.com/us/game/2018-12-26/1";
        list.add(dec26);
        //t2 was an hq word

        String dec27 = "https://hqbuff.com/us/game/2018-12-27/1";
        list.add(dec27);
        String dec27t2 = "https://hqbuff.com/us/game/2018-12-27/2";
        list.add(dec27t2);
        //t3 was an hq word

        String dec28 = "https://hqbuff.com/us/game/2018-12-28/1";
        list.add(dec28);
        //t2 was an hq word

        String dec29 = "https://hqbuff.com/us/game/2018-12-29/1";
        list.add(dec29);
        //t2 was an hq word

        String dec30 = "https://hqbuff.com/us/game/2018-12-30/1";
        list.add(dec30);
        //t2 was an hq word

        String dec31 = "https://hqbuff.com/us/game/2018-12-31/1";
        list.add(dec31);
        String dec31t2 = "https://hqbuff.com/us/game/2018-12-31/2";
        list.add(dec31t2);
        //t3 was an hq word

        for(int element = 0; element <=list.size() - 1; element++){
            String URL = list.get(element);
            try{
               Document hQdata = Jsoup.connect(URL).get();
               Elements hQdates = hQdata.select("*");
               System.out.println(hQdata);
               
            }
            catch(Exception e){
                e.printStackTrace();
                System.exit(1);
            }
        }

        
    }
}
