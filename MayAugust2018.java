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
        ArrayList <String> list = new ArrayList <String>();

        String may08 = "https://hqbuff.com/us/game/2018-05-08/1";
        list.add(may08);

        String may09t1 = "https://hqbuff.com/us/game/2018-05-09/1";
        list.add(may09t1);
        String may09t2 = "https://hqbuff.com/us/game/2018-05-09/2";
        list.add(may09t2);

        String may10t1 = "https://hqbuff.com/us/game/2018-05-10/1";
        list.add(may10t1);
        String may10t2 = "https://hqbuff.com/us/game/2018-05-10/2";
        list.add(may10t2);

        String may11t1 = "https://hqbuff.com/us/game/2018-05-11/1";
        list.add(may11t1);
        String may11t2 = "https://hqbuff.com/us/game/2018-05-11/2";
        list.add(may11t2);

        String may12 = "https://hqbuff.com/us/game/2018-05-12/1";
        list.add(may12);

        String may13 = "https://hqbuff.com/us/game/2018-05-13/1";
        list.add(may13);

        String may14t1 = "https://hqbuff.com/us/game/2018-05-14/1";
        list.add(may14t1);
        String may14t2 = "https://hqbuff.com/us/game/2018-05-14/2";
        list.add(may14t2);
        String may14t3 = "https://hqbuff.com/us/game/2018-05-14/3";
        list.add(may14t3);

        String may15t1= "https://hqbuff.com/us/game/2018-05-15/1";
        list.add(may15t1);
        String may15t2= "https://hqbuff.com/us/game/2018-05-15/2";
        list.add(may15t2);

        String may16t1 = "https://hqbuff.com/us/game/2018-05-16/1";
        list.add(may16t1);
        String may16t2 = "https://hqbuff.com/us/game/2018-05-16/2";
        list.add(may16t2);

        String may17t1 = "https://hqbuff.com/us/game/2018-05-17/1";
        list.add(may17t1);
        String may17t2 = "https://hqbuff.com/us/game/2018-05-17/2";
        list.add(may17t2);

        String may18t1 = "https://hqbuff.com/us/game/2018-05-18/1";
        list.add(may18t1);
        String may18t2 = "https://hqbuff.com/us/game/2018-05-18/2";
        list.add(may18t2);

        String may19 = "https://hqbuff.com/us/game/2018-05-19/1";
        list.add(may19);

        String may20t1 = "https://hqbuff.com/us/game/2018-05-20/1";
        list.add(may20t1);
        String may20t2 = "https://hqbuff.com/us/game/2018-05-20/2";
        list.add(may20t2);

        String may21t1 = "https://hqbuff.com/us/game/2018-05-21/1";
        list.add(may21t1);
        String may21t2 = "https://hqbuff.com/us/game/2018-05-21/2";
        list.add(may21t2);

        String may22t1 = "https://hqbuff.com/us/game/2018-05-22/1";
        list.add(may22t1);
        String may22t2 = "https://hqbuff.com/us/game/2018-05-22/2";
        list.add(may22t2);

        String may23t1 = "https://hqbuff.com/us/game/2018-05-23/1";
        list.add(may23t1);
        String may23t2 = "https://hqbuff.com/us/game/2018-05-23/2";
        list.add(may23t2);

        String may24t1 = "https://hqbuff.com/us/game/2018-05-24/1";
        list.add(may24t1);
        String may24t2 = "https://hqbuff.com/us/game/2018-05-24/2";
        list.add(may24t2);

        String may25t1 = "https://hqbuff.com/us/game/2018-05-25/1";
        list.add(may25t1);
        String may25t2 = "https://hqbuff.com/us/game/2018-05-25/2";
        list.add(may25t2);

        //No data recorded for May 26th

        String may27t1 = "https://hqbuff.com/us/game/2018-05-27/1";
        list.add(may27t1);
        String may27t2 = "https://hqbuff.com/us/game/2018-05-27/2";
        list.add(may27t2);

        String may28 = "https://hqbuff.com/us/game/2018-05-28/1";
        list.add(may28);

        String may29t1 = "https://hqbuff.com/us/game/2018-05-29/1";
        list.add(may29t1);
        String may29t2 = "https://hqbuff.com/us/game/2018-05-29/2";
        list.add(may29t2);

        String may30t1 = "https://hqbuff.com/us/game/2018-05-30/1";
        list.add(may30t1);
        String may30t2 = "https://hqbuff.com/us/game/2018-05-30/2";
        list.add(may30t2);

        String may31t1 = "https://hqbuff.com/us/game/2018-05-31/1";
        list.add(may31t1);
        String may31t2 = "https://hqbuff.com/us/game/2018-05-31/2";
        list.add(may31t2);
        String may31t3 = "https://hqbuff.com/us/game/2018-05-31/3";
        list.add(may31t3);

        //JUNE

        String june01t1 = "https://hqbuff.com/us/game/2018-06-01/1";
        list.add(june01t1);
        String june01t2 = "https://hqbuff.com/us/game/2018-06-01/2";
        list.add(june01t2);

        //No data recorded for June 2nd

        String june03t1 = "https://hqbuff.com/us/game/2018-06-03/1";
        list.add(june03t1);
        String june03t2 = "https://hqbuff.com/us/game/2018-06-03/2";
        list.add(june03t2);

        String june04t1 = "https://hqbuff.com/us/game/2018-06-04/1";
        list.add(june04t1);
        String june04t2 = "https://hqbuff.com/us/game/2018-06-04/2";
        list.add(june04t2);

        String june05t1 = "https://hqbuff.com/us/game/2018-06-05/1";
        list.add(june05t1);
        String june05t2 = "https://hqbuff.com/us/game/2018-06-05/2";
        list.add(june05t2);

        String june06t1 = "https://hqbuff.com/us/game/2018-06-06/1";
        list.add(june06t1);
        String june06t2 = "https://hqbuff.com/us/game/2018-06-06/2";
        list.add(june06t2);

        String june07t1 = "https://hqbuff.com/us/game/2018-06-07/1";
        list.add(june07t1);
        String june07t2 = "https://hqbuff.com/us/game/2018-06-07/2";
        list.add(june07t2);

        String june08t1 = "https://hqbuff.com/us/game/2018-06-08/1";
        list.add(june08t1);
        String june08t2 = "https://hqbuff.com/us/game/2018-06-08/2";
        list.add(june08t2);

        //No data recorded for June 9th 

        String june10t1 = "https://hqbuff.com/us/game/2018-06-10/1";
        list.add(june10t1);
        String june10t2 = "https://hqbuff.com/us/game/2018-06-10/2";
        list.add(june10t2);

        String june11t1 = "https://hqbuff.com/us/game/2018-06-11/1";
        list.add(june11t1);
        String june11t2 = "https://hqbuff.com/us/game/2018-06-11/2";
        list.add(june11t2);
        String june11t3 = "https://hqbuff.com/us/game/2018-06-11/3";
        list.add(june11t3);

        String june12t1 = "https://hqbuff.com/us/game/2018-06-12/1";
        list.add(june12t1);
        String june12t2 = "https://hqbuff.com/us/game/2018-06-12/2";
        list.add(june12t2);

        String june13t1 = "https://hqbuff.com/us/game/2018-06-13/1";
        list.add(june13t1);
        String june13t2 = "https://hqbuff.com/us/game/2018-06-13/2";
        list.add(june13t2);

        String june14t1 = "https://hqbuff.com/us/game/2018-06-14/1";
        list.add(june14t1);
        String june14t2 = "https://hqbuff.com/us/game/2018-06-14/2";
        list.add(june14t2);
        String june14t3 = "https://hqbuff.com/us/game/2018-06-14/3";
        list.add(june14t3);

        String june15t1 = "https://hqbuff.com/us/game/2018-06-15/1";
        list.add(june15t1);
        String june15t2 = "https://hqbuff.com/us/game/2018-06-15/2";
        list.add(june15t2);

        String june16 = "https://hqbuff.com/us/game/2018-06-16/1";
        list.add(june16);

        String june17 = "https://hqbuff.com/us/game/2018-06-17/1";
        list.add(june17);

        String june18t1 = "https://hqbuff.com/us/game/2018-06-18/1";
        list.add(june18t1);
        String june18t2 = "https://hqbuff.com/us/game/2018-06-18/2";
        list.add(june18t2);
        String june18t3 = "https://hqbuff.com/us/game/2018-06-18/3";
        list.add(june18t2);

        String june19t1 = "https://hqbuff.com/us/game/2018-06-19/1";
        list.add(june19t1);
        String june19t2 = "https://hqbuff.com/us/game/2018-06-19/2";
        list.add(june19t2);

        String june20t1 = "https://hqbuff.com/us/game/2018-06-20/1";
        list.add(june20t1);
        String june20t2 = "https://hqbuff.com/us/game/2018-06-20/2";
        list.add(june20t2);

        String june21t1 = "https://hqbuff.com/us/game/2018-06-21/1";
        list.add(june21t1);
        String june21t2 = "https://hqbuff.com/us/game/2018-06-21/2";
        list.add(june21t2);

        String june22t1 = "https://hqbuff.com/us/game/2018-06-22/1";
        list.add(june22t1);
        String june22t2 = "https://hqbuff.com/us/game/2018-06-22/2";
        list.add(june22t2);
        String june22t3 = "https://hqbuff.com/us/game/2018-06-22/3";
        list.add(june22t3);

        String june23 = "https://hqbuff.com/us/game/2018-06-23/1";
        list.add(june23);

        String june24 = "https://hqbuff.com/us/game/2018-06-24/1";
        list.add(june24);

        String june25t1 = "https://hqbuff.com/us/game/2018-06-25/1";
        list.add(june25t1);
        String june25t2 = "https://hqbuff.com/us/game/2018-06-25/2";
        list.add(june25t2);

        String june26t1 = "https://hqbuff.com/us/game/2018-06-26/1";
        list.add(june26t1);
        String june26t2 = "https://hqbuff.com/us/game/2018-06-26/2";
        list.add(june26t2);
        String june26t3 = "https://hqbuff.com/us/game/2018-06-26/3";
        list.add(june26t3);
        String june26t4 = "https://hqbuff.com/us/game/2018-06-26/4";
        list.add(june26t4);

        String june27t1 = "https://hqbuff.com/us/game/2018-06-27/1";
        list.add(june27t1);
        String june27t2 = "https://hqbuff.com/us/game/2018-06-27/2";
        list.add(june27t2);
        String june27t3 = "https://hqbuff.com/us/game/2018-06-27/3";
        list.add(june27t3);

        String june28t1 = "https://hqbuff.com/us/game/2018-06-28/1";
        list.add(june28t1);
        String june28t2 = "https://hqbuff.com/us/game/2018-06-28/2";
        list.add(june28t2);
        String june28t3 = "https://hqbuff.com/us/game/2018-06-28/3";
        list.add(june28t3);

        String june29t1 = "https://hqbuff.com/us/game/2018-06-29/1";
        list.add(june29t1);
        String june29t2 = "https://hqbuff.com/us/game/2018-06-29/2";
        list.add(june29t2);
        String june29t3 = "https://hqbuff.com/us/game/2018-06-29/3";
        list.add(june29t3);
        String june29t4 = "https://hqbuff.com/us/game/2018-06-29/4";
        list.add(june29t4);

        String june30t1 = "https://hqbuff.com/us/game/2018-06-30/1";
        list.add(june30t1);
        String june30t2 = "https://hqbuff.com/us/game/2018-06-30/2";
        list.add(june30t2);

        //JULY

        String july01 = "https://hqbuff.com/us/game/2018-07-01/1";
        list.add(july01);

        String july02t1 = "https://hqbuff.com/us/game/2018-07-02/1";
        list.add(july02t1);
        String july02t2 = "https://hqbuff.com/us/game/2018-07-02/2";
        list.add(july02t2);

        String july03t1 = "https://hqbuff.com/us/game/2018-07-03/1";
        list.add(july03t1);
        String july03t2 = "https://hqbuff.com/us/game/2018-07-03/2";
        list.add(july03t2);
        String july03t3 = "https://hqbuff.com/us/game/2018-07-03/3";
        list.add(july03t3);

        String july04t1 = "https://hqbuff.com/us/game/2018-07-04/1";
        list.add(july04t1);
        String july04t2 = "https://hqbuff.com/us/game/2018-07-04/2";
        list.add(july04t2);
        String july04t3 = "https://hqbuff.com/us/game/2018-07-04/3";
        list.add(july04t3);

        String july05t1 = "https://hqbuff.com/us/game/2018-07-05/1";
        list.add(july05t1);
        String july05t2 = "https://hqbuff.com/us/game/2018-07-05/2";
        list.add(july05t2);

        String july06t1 = "https://hqbuff.com/us/game/2018-07-06/1";
        list.add(july06t1);
        String july06t2 = "https://hqbuff.com/us/game/2018-07-06/2";
        list.add(july06t2);
        String july06t3 = "https://hqbuff.com/us/game/2018-07-06/3";
        list.add(july06t3);

        String july07t1 = "https://hqbuff.com/us/game/2018-07-07/1";
        list.add(july07t1);
        String july07t2 = "https://hqbuff.com/us/game/2018-07-07/2";
        list.add(july07t2);

        String july08 = "https://hqbuff.com/us/game/2018-07-08/1";
        list.add(july08);

        String july09t1 = "https://hqbuff.com/us/game/2018-07-09/1";
        list.add(july09t1);
        String july09t2 = "https://hqbuff.com/us/game/2018-07-09/2";
        list.add(july09t2);

        String july10t1 = "https://hqbuff.com/us/game/2018-07-10/1";
        list.add(july10t1);
        String july10t2 = "https://hqbuff.com/us/game/2018-07-10/2";
        list.add(july10t2);
        String july10t3 = "https://hqbuff.com/us/game/2018-07-10/3";
        list.add(july10t3);

        String july11t1 = "https://hqbuff.com/us/game/2018-07-11/1";
        list.add(july11t1);
        String july11t2 = "https://hqbuff.com/us/game/2018-07-11/2";
        list.add(july11t2);
        String july11t3 = "https://hqbuff.com/us/game/2018-07-11/3";
        list.add(july11t3);

        String july12t1 = "https://hqbuff.com/us/game/2018-07-12/1";
        list.add(july12t1);
        String july12t2 = "https://hqbuff.com/us/game/2018-07-12/2";
        list.add(july12t2);
        String july12t3 = "https://hqbuff.com/us/game/2018-07-12/3";
        list.add(july12t3);

        String july13t1 = "https://hqbuff.com/us/game/2018-07-13/1";
        list.add(july13t1);
        String july13t2 = "https://hqbuff.com/us/game/2018-07-13/2";
        list.add(july13t2);
        String july13t3 = "https://hqbuff.com/us/game/2018-07-13/3";
        list.add(july13t3);

        String july14t1 = "https://hqbuff.com/us/game/2018-07-14/1";
        list.add(july14t1);
        String july14t2 = "https://hqbuff.com/us/game/2018-07-14/2";
        list.add(july14t2);

        String july15t1 = "https://hqbuff.com/us/game/2018-07-15/1";
        list.add(july15t1);
        String july15t2 = "https://hqbuff.com/us/game/2018-07-15/2";
        list.add(july15t2);

        String july16t1 = "https://hqbuff.com/us/game/2018-07-16/1";
        list.add(july16t1);
        String july16t2 = "https://hqbuff.com/us/game/2018-07-16/2";
        list.add(july16t2);

        String july17t1 = "https://hqbuff.com/us/game/2018-07-17/1";
        list.add(july17t1);
        String july17t2 = "https://hqbuff.com/us/game/2018-07-17/2";
        list.add(july17t2);
        String july17t3 = "https://hqbuff.com/us/game/2018-07-17/3";
        list.add(july17t3);
        String july17t4 = "https://hqbuff.com/us/game/2018-07-17/4";
        list.add(july17t4);

        String july18t1 = "https://hqbuff.com/us/game/2018-07-18/1";
        list.add(july18t1);
        String july18t2 = "https://hqbuff.com/us/game/2018-07-18/2";
        list.add(july18t2);

        String july19t1 = "https://hqbuff.com/us/game/2018-07-19/1";
        list.add(july19t1);
        String july19t2 = "https://hqbuff.com/us/game/2018-07-19/2";
        list.add(july19t2);

        String july20t1 = "https://hqbuff.com/us/game/2018-07-20/1";
        list.add(july20t1);
        String july20t2 = "https://hqbuff.com/us/game/2018-07-20/2";
        list.add(july20t2);
        String july20t3 = "https://hqbuff.com/us/game/2018-07-20/3";
        list.add(july20t3);

        String july21 = "https://hqbuff.com/us/game/2018-07-21/1";
        list.add(july21);

        String july22 = "https://hqbuff.com/us/game/2018-07-22/1";
        list.add(july22);

        String july23t1 = "https://hqbuff.com/us/game/2018-07-23/1";
        list.add(july23t1);
        String july23t2 = "https://hqbuff.com/us/game/2018-07-23/2";
        list.add(july23t2);

        String july24t1 = "https://hqbuff.com/us/game/2018-07-24/1";
        list.add(july24t1);
        String july24t2 = "https://hqbuff.com/us/game/2018-07-24/2";
        list.add(july24t2);
        String july24t3 = "https://hqbuff.com/us/game/2018-07-24/3";
        list.add(july24t3);

        String july25t1 = "https://hqbuff.com/us/game/2018-07-25/1";
        list.add(july25t1);
        String july25t2 = "https://hqbuff.com/us/game/2018-07-25/2";
        list.add(july25t2);

        String july26t1 = "https://hqbuff.com/us/game/2018-07-26/1";
        list.add(july26t1);
        String july26t2 = "https://hqbuff.com/us/game/2018-07-26/2";
        list.add(july26t2);

        String july27t1 = "https://hqbuff.com/us/game/2018-07-27/1";
        list.add(july27t1);
        String july27t2 = "https://hqbuff.com/us/game/2018-07-27/2";
        list.add(july27t2);
        String july27t3 = "https://hqbuff.com/us/game/2018-07-27/3";
        list.add(july27t3);

        String july28 = "https://hqbuff.com/us/game/2018-07-28/1";
        list.add(july28);

        String july29 = "https://hqbuff.com/us/game/2018-07-29/1";
        list.add(july29);

        String july30t1 = "https://hqbuff.com/us/game/2018-07-30/1";
        list.add(july30t1);
        String july30t2 = "https://hqbuff.com/us/game/2018-07-30/2";
        list.add(july30t2);

        String july31t1 = "https://hqbuff.com/us/game/2018-07-31/1";
        list.add(july31t1);
        String july31t2 = "https://hqbuff.com/us/game/2018-07-31/2";
        list.add(july31t2);
        String july31t3 = "https://hqbuff.com/us/game/2018-07-31/3";
        list.add(july31t3);

        //AUGUST

        String aug01t1 = "https://hqbuff.com/us/game/2018-08-01/1";
        list.add(aug01t1);
        String aug01t2 = "https://hqbuff.com/us/game/2018-08-01/2";
        list.add(aug01t2);

        String aug02t1 = "https://hqbuff.com/us/game/2018-08-02/1";
        list.add(aug02t1);
        String aug02t2 = "https://hqbuff.com/us/game/2018-08-02/2";
        list.add(aug02t2);

        String aug03t1 = "https://hqbuff.com/us/game/2018-08-03/1";
        list.add(aug03t1);
        String aug03t2 = "https://hqbuff.com/us/game/2018-08-03/2";
        list.add(aug03t2);
        String aug03t3 = "https://hqbuff.com/us/game/2018-08-03/3";
        list.add(aug03t3);

        String aug04 = "https://hqbuff.com/us/game/2018-08-04/1";
        list.add(aug04);

        String aug05 = "https://hqbuff.com/us/game/2018-08-05/1";
        list.add(aug05);

        String aug06t1 = "https://hqbuff.com/us/game/2018-08-06/1";
        list.add(aug06t1);
        String aug06t2 = "https://hqbuff.com/us/game/2018-08-06/2";
        list.add(aug06t2);

        String aug07t1 = "https://hqbuff.com/us/game/2018-08-07/1";
        list.add(aug07t1);
        String aug07t2 = "https://hqbuff.com/us/game/2018-08-07/2";
        list.add(aug07t2);
        String aug07t3 = "https://hqbuff.com/us/game/2018-08-07/3";
        list.add(aug07t3);

        String aug08t1 = "https://hqbuff.com/us/game/2018-08-08/1";
        list.add(aug08t1);
        String aug08t2 = "https://hqbuff.com/us/game/2018-08-08/2";
        list.add(aug08t2);

        String aug09t1 = "https://hqbuff.com/us/game/2018-08-09/1";
        list.add(aug09t1);
        String aug09t2 = "https://hqbuff.com/us/game/2018-08-09/2";
        list.add(aug09t2);

        String aug10t1 = "https://hqbuff.com/us/game/2018-08-10/1";
        list.add(aug10t1);
        String aug10t2 = "https://hqbuff.com/us/game/2018-08-10/2";
        list.add(aug10t2);
        String aug10t3 = "https://hqbuff.com/us/game/2018-08-10/3";
        list.add(aug10t3);

        String aug11 = "https://hqbuff.com/us/game/2018-08-11/1";
        list.add(aug11);

        String aug12 = "https://hqbuff.com/us/game/2018-08-12/1";
        list.add(aug12);

        String aug13t1 = "https://hqbuff.com/us/game/2018-08-13/1";
        list.add(aug13t1);
        String aug13t2 = "https://hqbuff.com/us/game/2018-08-13/2";
        list.add(aug13t2);

        String aug14t1 = "https://hqbuff.com/us/game/2018-08-14/1";
        list.add(aug14t1);
        String aug14t2 = "https://hqbuff.com/us/game/2018-08-14/2";
        list.add(aug14t2);
        String aug14t3 = "https://hqbuff.com/us/game/2018-08-14/3";
        list.add(aug14t3);

        String aug15t1 = "https://hqbuff.com/us/game/2018-08-15/1";
        list.add(aug15t1);
        String aug15t2 = "https://hqbuff.com/us/game/2018-08-15/2";
        list.add(aug15t2);

        String aug16t1 = "https://hqbuff.com/us/game/2018-08-16/1";
        list.add(aug16t1);
        String aug16t2 = "https://hqbuff.com/us/game/2018-08-16/2";
        list.add(aug16t2);

        String aug17t1 = "https://hqbuff.com/us/game/2018-08-17/1";
        list.add(aug17t1);
        String aug17t2 = "https://hqbuff.com/us/game/2018-08-17/2";
        list.add(aug17t2);
        String aug17t3 = "https://hqbuff.com/us/game/2018-08-17/3";
        list.add(aug17t3);

        //No data recorded for August 18th
        //No data recorded for August 19th

        String aug20 = "https://hqbuff.com/us/game/2018-08-20/1"; 
        list.add(aug20);

        String aug21t1 = "https://hqbuff.com/us/game/2018-08-21/1";
        list.add(aug21t1);
        String aug21t2 = "https://hqbuff.com/us/game/2018-08-21/2";
        list.add(aug21t2);
        String aug21t3 = "https://hqbuff.com/us/game/2018-08-21/3";
        list.add(aug21t3);
        
        String aug22t1 = "https://hqbuff.com/us/game/2018-08-22/1";
        list.add(aug22t1);
        String aug22t2 = "https://hqbuff.com/us/game/2018-08-22/2";
        list.add(aug22t2);

        String aug23t1 = "https://hqbuff.com/us/game/2018-08-23/1";
        list.add(aug23t1);
        String aug23t2 = "https://hqbuff.com/us/game/2018-08-23/2";
        list.add(aug23t2);
        String aug23t3 = "https://hqbuff.com/us/game/2018-08-23/3";
        list.add(aug23t3);

        String aug24t1 = "https://hqbuff.com/us/game/2018-08-24/1";
        list.add(aug24t1);
        String aug24t2 = "https://hqbuff.com/us/game/2018-08-24/2";
        list.add(aug24t2);

        String aug25 = "https://hqbuff.com/us/game/2018-08-20/1";
        list.add(aug25);

        String aug26t1 = "https://hqbuff.com/us/game/2018-08-26/1";
        list.add(aug26t1);
        String aug26t2 = "https://hqbuff.com/us/game/2018-08-26/2";
        list.add(aug26t2);
        String aug26t3 = "https://hqbuff.com/us/game/2018-08-26/3";
        list.add(aug26t3);

        String aug27 = "https://hqbuff.com/us/game/2018-08-20/1";
        list.add(aug27);

        String aug28t1 = "https://hqbuff.com/us/game/2018-08-28/1";
        list.add(aug28t1);
        String aug28t2 = "https://hqbuff.com/us/game/2018-08-28/2";
        list.add(aug28t2);
        String aug28t3 = "https://hqbuff.com/us/game/2018-08-28/3";
        list.add(aug28t3);

        String aug29t1 = "https://hqbuff.com/us/game/2018-08-29/1";
        list.add(aug29t1);
        String aug29t2 = "https://hqbuff.com/us/game/2018-08-29/2";
        list.add(aug29t2);

        String aug30t1 = "https://hqbuff.com/us/game/2018-08-30/1";
        list.add(aug30t1);
        String aug30t2 = "https://hqbuff.com/us/game/2018-08-30/2";
        list.add(aug30t2);

        String aug31t1 = "https://hqbuff.com/us/game/2018-08-31/1";
        list.add(aug31t1);
        String aug31t2 = "https://hqbuff.com/us/game/2018-08-31/2";
        list.add(aug31t2);

        for(int element = 0; element <= list.size()-1; element++){
            String URL = list.get(element);
            try{
                Document hQdata = Jsoup.connect(URL).get();
                Elements hQdates = hQdata.select("question");
                System.out.println(hQdates);
                System.out.println();
            }
            catch (Exception e){
                e.printStackTrace();
                System.exit(1);
            }
        }

        //String URL = may08; (may08 = element)
        
        
        

        
        
    }
}
