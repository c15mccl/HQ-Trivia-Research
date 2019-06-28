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
        File myfile1 = new File("xmlForm1.txt");
        File myfile2 = new File("xmlForm2.txt");
        File myfile3 = new File("XMLForm3.txt");
        Scanner in1 = new Scanner(myfile1);
        Scanner in2 = new Scanner(myfile2);
        Scanner in3 = new Scanner(myfile3);
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
        String tempString = "";
        String patternMatch = "";
        String helperString1  = "";
        int helperNum1 = 0;
        String helperString2  = "";
        String helperString3  = "";
        CharSequence comma = ",";
        while(in1.hasNextLine()){
            String line = in1.nextLine();
            if(line.contains("<answer")){
                alldata.add(line);
            }
        }
        while(in2.hasNextLine()){
            String line = in2.nextLine();
            if(line.contains("<answer")){
                alldata.add(line);
            }
        }
        while(in3.hasNextLine()){
            String line = in3.nextLine();
            if(line.contains("<answer")){
                alldata.add(line);
            }
        }
        for(int i = 0; i < alldata.size(); i++){
            Pattern p = Pattern.compile("count\":\"([0-9,]+)");
            Matcher match = p.matcher(alldata.get(i));

            while(match.find()){
                patternMatch = match.group();
                //patternMatch = patternMatch.substring(8,(patternMatch.length()));
                StringBuilder sb = new StringBuilder(patternMatch);
                sb.delete(0,8);
                String regex = "(?<=[\\d])(,)(?=[\\d])";
                Pattern q = Pattern.compile(regex);
                Matcher m = q.matcher(sb);
                tempString = m.replaceAll("");
                countString.add(tempString);
            }
        }
        for(int j = 0; j < countString.size(); j++){
            helperString1 = countString.get(j);
            helperNum1 = Integer.valueOf(helperString1);
            countInt.add(helperNum1);
        }
        for(int i = 0; i < alldata.size(); i+=3){
            count1 = countInt.get(i);
            count2 = countInt.get(i+1);
            count3 = countInt.get(i+2);
            total = count1 + count2 + count3;
            if(count1 < (total/3)){
                if((alldata.get(i)).contains("correct = true")){
                    aCount++;
                }
            }
            else if(count2 < (total/3)){
                if((alldata.get(i+1)).contains("correct = true")){
                    bCount++;
                }
            }
            else if (count3 < (total/3)){
                cCount++; 
            }
        }
        System.out.println("A was the correct answer for a savage question "+aCount+" out of "+total+" times.");
        System.out.println("B was the correct answer for a savage question "+bCount+" out of "+total+" times.");
        System.out.println("C was the correct answer for a savage question "+cCount+" out of "+total+" times.");
    }
}

