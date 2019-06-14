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
        ArrayList <String> countInt = new ArrayList <String>();
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
        String helperString2  = "";
        String helperString3  = "";
        while(in.hasNextLine()){
            String line = in.nextLine();
            if(line.contains("<answer")){
                alldata.add(line);
            }
            for(int i = 0; i < alldata.size(); i++){
                Pattern p = Pattern.compile("count\":\"(^[0-9,0-9,0-9]+$)");
                Matcher m = p.matcher(alldata.get(i));
                
                while(m.find()){
                    patternMatch = m.group();
                    countString.add(patternMatch);
                    
                }
            }
            for(int i = 0; i < countString.size(); i++){
                helperString1 = countString.get(i);
                helperString2 = helperString1.substring(0,9);
                helperString1 = Integer.valueOf(helperString1);
                countInt.add(helperString1);
            }
        }
    }
    
    
}
