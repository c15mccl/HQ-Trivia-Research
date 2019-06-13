import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class StatsLearning1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StatsLearning1
{
    public static void main (String[]args) throws FileNotFoundException{
        File myfile = new File("xmlForm1.txt");
        Scanner in = new Scanner(myfile);
        ArrayList <String> alldata = new ArrayList <String>();
        ArrayList <String> correctA = new ArrayList <String>();
        ArrayList <String> correctB = new ArrayList <String>();
        ArrayList <String> correctC = new ArrayList <String>();
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int prevAcount = 0;
        int prevBcount = 0;
        int prevCcount = 0;
        int total = 0;
        while(in.hasNextLine()){
            String line = in.nextLine();
            if(line.contains("correct = true")){
                alldata.add(line);
            }
            if(line.contains("<answerA")){
                if(line.contains("correct = true")){
                    correctA.add(line);
                }
            }
            if(line.contains("<answerB")){
                if(line.contains("correct = true")){
                    correctB.add(line);
                }
            }
            if(line.contains("<answerC")){
                if(line.contains("correct = true")){
                    correctC.add(line);
                }
            }
        }
        for(int i = 0; i < correctA.size(); i++){
            aCount = correctA.size();
        }
        for(int i = 0; i < correctB.size(); i++){
            bCount = correctB.size();
        }
        for(int i = 0; i < correctC.size(); i++){
            cCount = correctC.size();
        }
        for(int i = 0; i < alldata.size()-1; i++){
            if((alldata.get(i)).contains("<answerA")){
                if((alldata.get(i+1)).contains("<answerA")){
                    prevAcount+=1;
                }
            }
            if((alldata.get(i)).contains("<answerB")){
                if((alldata.get(i+1)).contains("<answerB")){
                    prevBcount+=1;
                }
            }
            if((alldata.get(i)).contains("<answerC")){
                if((alldata.get(i+1)).contains("<answerC")){
                    prevCcount+=1;
                }
            }
        }
        total = alldata.size();
        System.out.println("Correct answer was \"A\" "+ aCount +" times out of "+total+".");
        System.out.println("Correct answer was \"B\" "+ bCount +" times out of "+total+".");
        System.out.println("Correct answer was \"C\" "+ cCount +" times out of "+total+".");
        System.out.println("The amount of time A was correct consecutively is "+prevAcount+" times.");
        System.out.println("The amount of time B was correct consecutively is "+prevBcount+" times.");
        System.out.println("The amount of time C was correct consecutively is "+prevCcount+" times.");
    }
}

