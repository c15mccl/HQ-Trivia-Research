
import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class SavageLearning1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavageLearning1
{
    public static void main (String[]args) throws FileNotFoundException{
        File myfile = new File("xmlForm1.txt");
        Scanner in = new Scanner(myfile);
        ArrayList <String> alldata = new ArrayList <String>();
        ArrayList <String> countString = new ArrayList <String>();
        ArrayList <Integer> countInt = new ArrayList <Integer>();
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int prevAcount = 0;
        int prevBcount = 0;
        int prevCcount = 0;
        int total = 0;
        String patternMatch = "";
        String helperString1  = "";
        int helperNum1 = 0;
        String helperString2  = "";
        String helperString3  = "";
        while(in.hasNextLine()){
            String line = in.nextLine();
            if(line.contains("<answer")){
                alldata.add(line);
            }
            for(int i = 0; i < alldata.size(); i++){
                Pattern p = Pattern.compile("count\":\"([0-9,]+)");
                Matcher match = p.matcher(alldata.get(i));

                while(match.find()){
                    patternMatch = match.group();
                    countString.add(patternMatch);

                }
                for(int j = 0; j < countString.size(); j++){
                    helperString1 = countString.get(j);
                    helperString2 = helperString1.substring(0,9);
                    helperNum1 = Integer.valueOf(helperString1);
                    countInt.add(helperNum1);
                }
                for(int k = 0; k < countInt.size(); k++){
                    for(int l = 0; l < k; l+=3){
                        for(int m = 1; m < l; m++){
                            for(int n = 2; n < m; n++){
                                count1 = countInt.get(l);
                                count2 = countInt.get(m);
                                count3 = countInt.get(n);
                                total = count1 + count2 + count3;
                                if(count1 < (total/3)){
                                    if((alldata.get(i)).contains("correct = true")){
                                        aCount++;
                                    }

                                    //||(count3 < (total/3))){

                                }
                                else if(count2 < (total/3)){
                                    if((alldata.get(i)+1).contains("correct = true")){
                                        bCount++;
                                    }
                                }
                                else{
                                    cCount++; 
                                }
                            }
                        }
                    }                
                }
            }

        }
    }

}
