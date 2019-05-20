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
        //SEPTEMBER URL'S
        String sep01 = "https://hqbuff.com/us/game/2018-09-01/1";
        
        String sep02 = "https://hqbuff.com/us/game/2018-09-02/1";
        
        String sep03 = "https://hqbuff.com/us/game/2018-09-03/1";
        String sep03t2 = "https://hqbuff.com/us/game/2018-09-03/2";
        
        String sep04 = "https://hqbuff.com/us/game/2018-09-04/1";
        String sep04t2 = "https://hqbuff.com/us/game/2018-09-04/2";
        
        String sep05 = "https://hqbuff.com/us/game/2018-09-05/1";
        String sep05t2 = "https://hqbuff.com/us/game/2018-09-05/2";
        String sep05t3 = "https://hqbuff.com/us/game/2018-09-05/3";
        
        String sep06 = "https://hqbuff.com/us/game/2018-09-06/1";
        String sep06t2 = "https://hqbuff.com/us/game/2018-09-06/2";
        
        String sep07 = "https://hqbuff.com/us/game/2018-09-07/1";
        
        String sep08 = "https://hqbuff.com/us/game/2018-09-08/1";
        
        String sep09 = "https://hqbuff.com/us/game/2018-09-09/1";
        String sep09t2 = "https://hqbuff.com/us/game/2018-09-09/2";
        
        String sep10 = "https://hqbuff.com/us/game/2018-09-10/1";
        String sep10t2 = "https://hqbuff.com/us/game/2018-09-10/2";
        
        String sep11 = "https://hqbuff.com/us/game/2018-09-11/1";
        String sep11t2 = "https://hqbuff.com/us/game/2018-09-11/2";
        
        String sep12 = "https://hqbuff.com/us/game/2018-09-12/1";
        String sep12t2 = "https://hqbuff.com/us/game/2018-09-12/2";
        
        String sep13 = "https://hqbuff.com/us/game/2018-09-13/1";
        
        String sep14 = "https://hqbuff.com/us/game/2018-09-14/1";
        
        String sep15 = "https://hqbuff.com/us/game/2018-09-15/1";
        
        String sep16 = "https://hqbuff.com/us/game/2018-09-16/1";
        
        String sep17 = "https://hqbuff.com/us/game/2018-09-17/1";
        String sep17t2 = "https://hqbuff.com/us/game/2018-09-17/2";
        
        String sep18 = "https://hqbuff.com/us/game/2018-09-18/1";
        String sep18t2 = "https://hqbuff.com/us/game/2018-09-18/2";
        
        String sep19 = "https://hqbuff.com/us/game/2018-09-19/1";
        String sep19t2 = "https://hqbuff.com/us/game/2018-09-19/2";
        
        String sep20 = "https://hqbuff.com/us/game/2018-09-20/1";
        String sep20t2 = "https://hqbuff.com/us/game/2018-09-20/2";
        
        String sep21 = "https://hqbuff.com/us/game/2018-09-21/1";
        
        String sep22 = "https://hqbuff.com/us/game/2018-09-22/1";
        
        String sep23 = "https://hqbuff.com/us/game/2018-09-23/1";
        
        String sep24 = "https://hqbuff.com/us/game/2018-09-24/1";
        String sep24t2 = "https://hqbuff.com/us/game/2018-09-24/2";
        
        String sep25 = "https://hqbuff.com/us/game/2018-09-25/1";
        String sep25t2 = "https://hqbuff.com/us/game/2018-09-25/2";
        
        String sep26 = "https://hqbuff.com/us/game/2018-09-26/1";
        String sep26t2 = "https://hqbuff.com/us/game/2018-09-26/2";
        
        String sep27 = "https://hqbuff.com/us/game/2018-09-27/1";
        String sep27t2 = "https://hqbuff.com/us/game/2018-09-27/2";
        
        String sep28 = "https://hqbuff.com/us/game/2018-09-28/1";
        
        String sep29 = "https://hqbuff.com/us/game/2018-09-29/1";
        
        String sep30 = "https://hqbuff.com/us/game/2018-09-30/1";
        
        //OCTOBER URL'S
        String oct01 = "https://hqbuff.com/us/game/2018-10-01/1";
        String oct01t2 = "https://hqbuff.com/us/game/2018-10-01/2";
        
        String oct02 ="https://hqbuff.com/us/game/2018-10-02/1";
        String oct02t2 ="https://hqbuff.com/us/game/2018-10-02/2";
        
        String oct03 = "https://hqbuff.com/us/game/2018-10-03/1";
        String oct03t2 = "https://hqbuff.com/us/game/2018-10-03/2";
        
        String oct04 = "https://hqbuff.com/us/game/2018-10-04/1";
        String oct04t2 = "https://hqbuff.com/us/game/2018-10-04/2";
        
        String oct05 = "https://hqbuff.com/us/game/2018-10-05/1";
        
        String oct06 = "https://hqbuff.com/us/game/2018-10-06/1";
        
        String oct07 ="https://hqbuff.com/us/game/2018-10-07/1";
        
        String oct08 = "https://hqbuff.com/us/game/2018-10-08/1";
        String oct08t2 = "https://hqbuff.com/us/game/2018-10-08/2";
        
        String oct09 = "https://hqbuff.com/us/game/2018-10-09/1";
        String oct09t2 = "https://hqbuff.com/us/game/2018-10-09/2";
        
        String oct10 = "https://hqbuff.com/us/game/2018-10-10/1";
        String oct10t2 = "https://hqbuff.com/us/game/2018-10-10/2";
        
        String oct11= "https://hqbuff.com/us/game/2018-10-11/1";
        String oct11t2= "https://hqbuff.com/us/game/2018-10-11/2";
        
        String oct12 = "https://hqbuff.com/us/game/2018-10-12/1";
        
        String oct13 = "https://hqbuff.com/us/game/2018-10-13/1";
        
        String oct14 = "https://hqbuff.com/us/game/2018-10-14/1";
        
        String oct15 = "https://hqbuff.com/us/game/2018-10-15/1";
        String oct15t2 = "https://hqbuff.com/us/game/2018-10-15/2";
        
        String oct16 = "https://hqbuff.com/us/game/2018-10-16/1";
        String oct16t2 = "https://hqbuff.com/us/game/2018-10-16/2";
        
        String oct17 = "https://hqbuff.com/us/game/2018-10-17/1";
        String oct17t2 = "https://hqbuff.com/us/game/2018-10-17/2";
        
        String oct18 = "https://hqbuff.com/us/game/2018-10-18/1";
        String oct18t2 = "https://hqbuff.com/us/game/2018-10-18/2";
        
        String oct19 = "https://hqbuff.com/us/game/2018-10-19/1";
        
        String oct20 = "https://hqbuff.com/us/game/2018-10-20/1";
        
        String oct21 = "https://hqbuff.com/us/game/2018-10-21/1";
        
        String oct22 = "https://hqbuff.com/us/game/2018-10-22/1";
        
        String oct23= "https://hqbuff.com/us/game/2018-10-23/1";
        String oct23t2= "https://hqbuff.com/us/game/2018-10-23/2";
        String oct23t3= "https://hqbuff.com/us/game/2018-10-23/3";
        
        String oct24 = "https://hqbuff.com/us/game/2018-10-24/1";
        
        String oct25 = "https://hqbuff.com/us/game/2018-10-25/1";
        String oct25t2 = "https://hqbuff.com/us/game/2018-10-25/2";
        
        String oct26 = "https://hqbuff.com/us/game/2018-10-26/1";
        
        String oct27 = "https://hqbuff.com/us/game/2018-10-27/1";
        
        String oct28 = "https://hqbuff.com/us/game/2018-10-28/1";
        
        String oct29 = "https://hqbuff.com/us/game/2018-10-29/1";
        String oct29t2 = "https://hqbuff.com/us/game/2018-10-29/1";
        
        String oct30 = "https://hqbuff.com/us/game/2018-10-30/1";
        String oct30t2 = "https://hqbuff.com/us/game/2018-10-30/2";
        
        String oct31 = "https://hqbuff.com/us/game/2018-10-31/1";
        String oct31t2 = "https://hqbuff.com/us/game/2018-10-31/2";
        
        //NOVEMBER URL'S
        
        String nov01 = "https://hqbuff.com/us/game/2018-11-01/1";
        String nov01t2 = "https://hqbuff.com/us/game/2018-11-01/2";
        
        String nov02 = "https://hqbuff.com/us/game/2018-11-02/1";
        
        String nov03 = "https://hqbuff.com/us/game/2018-11-03/1";
        
        String nov04 = "https://hqbuff.com/us/game/2018-11-04/1";
        
        String nov05 = "https://hqbuff.com/us/game/2018-11-05/1";
        String nov05t2 = "https://hqbuff.com/us/game/2018-11-05/2";
        
        String nov06 = "https://hqbuff.com/us/game/2018-11-06/1";
        String nov06t2 = "https://hqbuff.com/us/game/2018-11-06/2";
        
        String nov07 = "https://hqbuff.com/us/game/2018-11-07/1";
        String nov07t2 = "https://hqbuff.com/us/game/2018-11-07/2";
        
        String nov08 = "https://hqbuff.com/us/game/2018-11-08/1";
        String nov08t2 = "https://hqbuff.com/us/game/2018-11-08/1";
        
        String nov09 = "https://hqbuff.com/us/game/2018-11-09/1";
        
        String nov10 = "https://hqbuff.com/us/game/2018-11-10/1";
        
        String nov11 = "https://hqbuff.com/us/game/2018-11-11/1";
        
        String nov12 = "https://hqbuff.com/us/game/2018-11-12/1";
        String nov12t2 = "https://hqbuff.com/us/game/2018-11-12/2";
        
        String nov13 = "https://hqbuff.com/us/game/2018-11-13/1";
        String nov13t2 = "https://hqbuff.com/us/game/2018-11-13/2";
        
        String nov14 = "https://hqbuff.com/us/game/2018-11-14/1";
        String nov14t2 = "https://hqbuff.com/us/game/2018-11-14/2";
        
        String nov15 = "https://hqbuff.com/us/game/2018-11-15/1";
        String nov15t2 = "https://hqbuff.com/us/game/2018-11-15/2";
        
        String nov16 = "https://hqbuff.com/us/game/2018-11-16/1";
        
        String nov17 = "https://hqbuff.com/us/game/2018-11-17/1";
        
        String nov18 = "https://hqbuff.com/us/game/2018-11-18/1";
        
        String nov19 = "https://hqbuff.com/us/game/2018-11-19/1";
        String nov19t2 = "https://hqbuff.com/us/game/2018-11-19/2";
        
        String nov20 = "https://hqbuff.com/us/game/2018-11-20/1";
        String nov20t2 = "https://hqbuff.com/us/game/2018-11-20/2";
        
        String nov21 = "https://hqbuff.com/us/game/2018-11-21/1";
        
        String nov22 = "https://hqbuff.com/us/game/2018-11-22/1";
        String nov22t2 = "https://hqbuff.com/us/game/2018-11-22/2";
        
        String nov23 = "https://hqbuff.com/us/game/2018-11-23/1";
        
        String nov24 = "https://hqbuff.com/us/game/2018-11-24/1";
        
        String nov25 = "https://hqbuff.com/us/game/2018-11-25/1";
        
        String nov26 = "https://hqbuff.com/us/game/2018-11-26/1";
        String nov26t2 = "https://hqbuff.com/us/game/2018-11-26/2";
        
        String nov27 = "https://hqbuff.com/us/game/2018-11-27/1";
        String nov27t2 = "https://hqbuff.com/us/game/2018-11-27/2";
        
        String nov28 = "https://hqbuff.com/us/game/2018-11-28/1";
        String nov28t2 = "https://hqbuff.com/us/game/2018-11-28/2";
        
        String nov29 = "https://hqbuff.com/us/game/2018-11-29/1";
        String nov29t2 = "https://hqbuff.com/us/game/2018-11-29/2";
        //t3 was an hq word
        
        //t1 was an hq word
        String nov30t2 = "https://hqbuff.com/us/game/2018-11-30/2";
        
        //DECEMBER URL'S
        
        String dec01 = "https://hqbuff.com/us/game/2018-12-01/1";
        
        String dec02 = "https://hqbuff.com/us/game/2018-12-02/1";
        //t2 was an hq word
        
        //dec 3 only had one time and it was an hq word
        
        String dec04 = "https://hqbuff.com/us/game/2018-12-04/2";
        String dec04t2 = "https://hqbuff.com/us/game/2018-12-04/3";
        //t1 was an hq word
        
        String dec05 = "https://hqbuff.com/us/game/2018-12-05/2";
        String dec05t2 = "https://hqbuff.com/us/game/2018-12-05/3";
        //t1 was an hq word
        
        String dec06 = "https://hqbuff.com/us/game/2018-12-06/2";
        String dec06t2 = "https://hqbuff.com/us/game/2018-12-06/3";
        //t1 and t4 both were hq word
        
        String dec07 = "https://hqbuff.com/us/game/2018-12-07/2";
        //t1 was an hq word
        
        String dec08 = "https://hqbuff.com/us/game/2018-12-08/1";
        
        String dec09 = "https://hqbuff.com/us/game/2018-12-09/1";
        //t2 was an hq word
        
        String dec10 = "https://hqbuff.com/us/game/2018-12-10/2";
        String dec10t2 = "https://hqbuff.com/us/game/2018-12-10/3";
        //t1 was an hq word
        
        String dec11 = "https://hqbuff.com/us/game/2018-12-11/2";
        String dec11t2 = "https://hqbuff.com/us/game/2018-12-11/3";
        //t1 was an hq word
        
        String dec12 = "https://hqbuff.com/us/game/2018-12-12/2";
        String dec12t2 = "https://hqbuff.com/us/game/2018-12-12/3";
        //t1 and t4 both hq word
        
        String dec13 = "https://hqbuff.com/us/game/2018-12-13/2";
        String dec13t2 = "https://hqbuff.com/us/game/2018-12-13/3";
        //t1 was an hq word
        
        String dec14 = "https://hqbuff.com/us/game/2018-12-14/2";
        String dec14t2 = "https://hqbuff.com/us/game/2018-12-14/3";
        //t1 was an hq word
        
        String dec15 = "https://hqbuff.com/us/game/2018-12-15/1";
        
        //DEC16 NO DATA RECORDED
        
        String dec17 = "https://hqbuff.com/us/game/2018-12-17/1";
        //T2 WAS AN HQ WORD
        
        String dec18 = "https://hqbuff.com/us/game/2018-12-18/1";
        String dec18t2 = "https://hqbuff.com/us/game/2018-12-18/2";
        //t3 was an hq word
        
        String dec19 = "https://hqbuff.com/us/game/2018-12-19/1";
        String dec19t2 = "https://hqbuff.com/us/game/2018-12-19/2";
        //t3 was an hq word
        
        String dec20 = "https://hqbuff.com/us/game/2018-12-20/1";
        String dec20t2 = "https://hqbuff.com/us/game/2018-12-20/2";
        //t3 was an hq word
        
        String dec21 = "https://hqbuff.com/us/game/2018-12-21/1";
        String dec21t2 = "https://hqbuff.com/us/game/2018-12-21/2";
        //t3 was an hq word
        
        String dec22 = "https://hqbuff.com/us/game/2018-12-22/1";
        //t2 was an hq word
        
        String dec23 = "https://hqbuff.com/us/game/2018-12-23/1";
        //t2 was an hq word
        
        String dec24 = "https://hqbuff.com/us/game/2018-12-24/1";
        
        String dec25 = "https://hqbuff.com/us/game/2018-12-25/1";
        String dec25t2 = "https://hqbuff.com/us/game/2018-12-25/2";
        String dec25t3 = "https://hqbuff.com/us/game/2018-12-25/3";
        //t4 was an hq word
        
        String dec26 = "https://hqbuff.com/us/game/2018-12-26/1";
        //t2 was an hq word
        
        String dec27 = "https://hqbuff.com/us/game/2018-12-27/1";
        String dec27t2 = "https://hqbuff.com/us/game/2018-12-27/2";
        //t3 was an hq word
        
        String dec28 = "https://hqbuff.com/us/game/2018-12-28/1";
        //t2 was an hq word
        
        String dec29 = "https://hqbuff.com/us/game/2018-12-29/1";
        //t2 was an hq word
        
        String dec30 = "https://hqbuff.com/us/game/2018-12-30/1";
        //t2 was an hq word
        
        String dec31 = "https://hqbuff.com/us/game/2018-12-31/1";
        String dec31t2 = "https://hqbuff.com/us/game/2018-12-31/2";
        //t3 was an hq word
        
        
        
        
        
    }
}
