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
    public static void main(String[]args){
        //May
        
        String may08 = "https://hqbuff.com/us/game/2018-05-08/1";
        
        String may09t1 = "https://hqbuff.com/us/game/2018-05-09/1";
        String may09t2 = "https://hqbuff.com/us/game/2018-05-09/2";
        
        String may10t1 = "https://hqbuff.com/us/game/2018-05-10/1";
        String may10t2 = "https://hqbuff.com/us/game/2018-05-10/2";
        
        String may11t1 = "https://hqbuff.com/us/game/2018-05-11/1";
        String may11t2 = "https://hqbuff.com/us/game/2018-05-11/2";
        
        String may12 = "https://hqbuff.com/us/game/2018-05-12/1";
        
        String may13 = "https://hqbuff.com/us/game/2018-05-13/1";
        
        String may14t1 = "https://hqbuff.com/us/game/2018-05-14/1";
        String may14t2 = "https://hqbuff.com/us/game/2018-05-14/2";
        String may14t3 = "https://hqbuff.com/us/game/2018-05-14/3";
        
        String may15t1= "https://hqbuff.com/us/game/2018-05-15/1";
        String may15t2= "https://hqbuff.com/us/game/2018-05-15/2";
        
        String may16t1 = "https://hqbuff.com/us/game/2018-05-16/1";
        String may16t2 = "https://hqbuff.com/us/game/2018-05-16/2";
        
        String may17t1 = "https://hqbuff.com/us/game/2018-05-17/1";
        String may17t2 = "https://hqbuff.com/us/game/2018-05-17/2";
        
        String may18t1 = "https://hqbuff.com/us/game/2018-05-18/1";
        String may18t2 = "https://hqbuff.com/us/game/2018-05-18/2";
        
        String may19 = "https://hqbuff.com/us/game/2018-05-19/1";
        
        String may20t1 = "https://hqbuff.com/us/game/2018-05-20/1";
        String may20t2 = "https://hqbuff.com/us/game/2018-05-20/2";
        
        String may21t1 = "https://hqbuff.com/us/game/2018-05-21/1";
        String may21t2 = "https://hqbuff.com/us/game/2018-05-21/2";
        
        String may22t1 = "https://hqbuff.com/us/game/2018-05-22/1";
        String may22t2 = "https://hqbuff.com/us/game/2018-05-22/2";
        
        String may23t1 = "https://hqbuff.com/us/game/2018-05-23/1";
        String may23t2 = "https://hqbuff.com/us/game/2018-05-23/2";
        
        String may24t1 = "https://hqbuff.com/us/game/2018-05-24/1";
        String may24t2 = "https://hqbuff.com/us/game/2018-05-24/2"; 
        
        String may25t1 = "https://hqbuff.com/us/game/2018-05-25/1";
        String may25t2 = "https://hqbuff.com/us/game/2018-05-25/2";
        
        //No data recorded for May 26th
        
        String may27t1 = "https://hqbuff.com/us/game/2018-05-27/1";
        String may27t2 = "https://hqbuff.com/us/game/2018-05-27/2";
        
        String may28 = "https://hqbuff.com/us/game/2018-05-28/1";
        
        String may29t1 = "https://hqbuff.com/us/game/2018-05-29/1";
        String may29t2 = "https://hqbuff.com/us/game/2018-05-29/2";
        
        String may30t1 = "https://hqbuff.com/us/game/2018-05-30/1";
        String may30t2 = "https://hqbuff.com/us/game/2018-05-30/2";
        
        String may31t1 = "https://hqbuff.com/us/game/2018-05-31/1";
        String may31t2 = "https://hqbuff.com/us/game/2018-05-31/2";
        String may31t3 = "https://hqbuff.com/us/game/2018-05-31/3";
        
        //JUNE
        
        String june01t1 = "https://hqbuff.com/us/game/2018-06-01/1";
        String june01t2 = "https://hqbuff.com/us/game/2018-06-01/2";
        
        //No data recorded for June 2nd
        
        String june03t1 = "https://hqbuff.com/us/game/2018-06-03/1";
        String june03t2 = "https://hqbuff.com/us/game/2018-06-03/2";
        
        String june04t1 = "https://hqbuff.com/us/game/2018-06-04/1";
        String june04t2 = "https://hqbuff.com/us/game/2018-06-04/2";
        
        String june05t1 = "https://hqbuff.com/us/game/2018-06-05/1";
        String june05t2 = "https://hqbuff.com/us/game/2018-06-05/2";
        
        String june06t1 = "https://hqbuff.com/us/game/2018-06-06/1";
        String june06t2 = "https://hqbuff.com/us/game/2018-06-06/2";
        
        String june07t1 = "https://hqbuff.com/us/game/2018-06-07/1";
        String june07t2 = "https://hqbuff.com/us/game/2018-06-07/2";
        
        String june08t1 = "https://hqbuff.com/us/game/2018-06-08/1";
        String june08t2 = "https://hqbuff.com/us/game/2018-06-08/2";
        
        //No data recorded for June 9th 
        
        String june10t1 = "https://hqbuff.com/us/game/2018-06-10/1";
        String june10t2 = "https://hqbuff.com/us/game/2018-06-10/2";
        
        String june11t1 = "https://hqbuff.com/us/game/2018-06-11/1";
        String june11t2 = "https://hqbuff.com/us/game/2018-06-11/2";
        String june11t3 = "https://hqbuff.com/us/game/2018-06-11/3";
        
        String june12t1 = "https://hqbuff.com/us/game/2018-06-12/1";
        String june12t2 = "https://hqbuff.com/us/game/2018-06-12/2";
        
        String june13t1 = "https://hqbuff.com/us/game/2018-06-13/1";
        String june13t2 = "https://hqbuff.com/us/game/2018-06-13/2";
        
        String june14t1 = "https://hqbuff.com/us/game/2018-06-14/1";
        String june14t2 = "https://hqbuff.com/us/game/2018-06-14/2";
        String june14t3 = "https://hqbuff.com/us/game/2018-06-14/3";
        
        String june15t1 = "https://hqbuff.com/us/game/2018-06-15/1";
        String june15t2 = "https://hqbuff.com/us/game/2018-06-15/2";
        
        
        String june16 = "https://hqbuff.com/us/game/2018-06-16/1";
        
        String june17 = "https://hqbuff.com/us/game/2018-06-17/1";
        
        String june18t1 = "https://hqbuff.com/us/game/2018-06-18/1";
        String june18t2 = "https://hqbuff.com/us/game/2018-06-18/2";
        String june18t3 = "https://hqbuff.com/us/game/2018-06-18/3";
        
        String june19t1 = "https://hqbuff.com/us/game/2018-06-19/1";
        String june19t2 = "https://hqbuff.com/us/game/2018-06-19/2";
        
        String june20t1 = "https://hqbuff.com/us/game/2018-06-20/1";
        String june20t2 = "https://hqbuff.com/us/game/2018-06-20/2";
        
        String june21t1 = "https://hqbuff.com/us/game/2018-06-21/1";
        String june21t2 = "https://hqbuff.com/us/game/2018-06-21/2";
        
        String june22t1 = "https://hqbuff.com/us/game/2018-06-22/1";
        String june22t2 = "https://hqbuff.com/us/game/2018-06-22/2";
        String june22t3 = "https://hqbuff.com/us/game/2018-06-22/3";
        
        String june23 = "https://hqbuff.com/us/game/2018-06-23/1";
        
        String june24 = "https://hqbuff.com/us/game/2018-06-24/1";
        
        String june25t1 = "https://hqbuff.com/us/game/2018-06-25/1";
        String june25t2 = "https://hqbuff.com/us/game/2018-06-25/2";
        
        String june26t1 = "https://hqbuff.com/us/game/2018-06-26/1";
        String june26t2 = "https://hqbuff.com/us/game/2018-06-26/2";
        String june26t3 = "https://hqbuff.com/us/game/2018-06-26/3";
        String june26t4 = "https://hqbuff.com/us/game/2018-06-26/4";
        
        String june27t1 = "https://hqbuff.com/us/game/2018-06-27/1";
        String june27t2 = "https://hqbuff.com/us/game/2018-06-27/2";
        String june27t3 = "https://hqbuff.com/us/game/2018-06-27/3";
        
        String june28t1 = "https://hqbuff.com/us/game/2018-06-28/1";
        String june28t2 = "https://hqbuff.com/us/game/2018-06-28/2";
        String june28t3 = "https://hqbuff.com/us/game/2018-06-28/3";
        
        String june29t1 = "https://hqbuff.com/us/game/2018-06-29/1";
        String june29t2 = "https://hqbuff.com/us/game/2018-06-29/2";
        String june29t3 = "https://hqbuff.com/us/game/2018-06-29/3";
        String june29t4 = "https://hqbuff.com/us/game/2018-06-29/4";
        
        String june30t1 = "https://hqbuff.com/us/game/2018-06-30/1";
        String june30t2 = "https://hqbuff.com/us/game/2018-06-30/2";
        
        
    }
}
