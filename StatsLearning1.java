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
        ArrayList <String> correct = new ArrayList <String>();
        ArrayList <String> incorrect = new ArrayList <String>();
        int aCount = 0;
        int prevAcount = 0;
        while(in.hasNextLine()){
            String line = in.nextLine();
            if(line.contains("<answerA")){
                alldata.add(line);
            }
            if(line.contains("correct = true")){
                correct.add(line);
            }
            if(line.contains("correct = false")){
                incorrect.add(line);
            }
            while(!correct.isEmpty()){
                for(int i = 0; i < correct.size(); i++){
                    System.out.println(correct.get(i));
                    if((correct.get(i)).contains("<answerA")){
                        aCount++;
                    }
                }
            }
            while(!alldata.isEmpty()){
                for(int i = 0; i < alldata.size(); i++){
                    System.out.println(alldata.get(i));
                    if((alldata.get(i)).contains("correct = true")){
                        if((alldata.get(i+1)).contains("correct = true")){
                            prevAcount++;
                        }
                    }
                }
            }
        }
        System.out.println("Correct answer was \"A\" "+ aCount +" times.");
            System.out.println("The amount of time A was correct consecutively is "+prevAcount+" times.");
    }
}
