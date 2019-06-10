import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * Write a description of class XMLOrganize3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class XMLOrganize3
{
    public static void main(String[] args) throws FileNotFoundException,IOException{
        File ansFile = new File("XMLAnswersJanMay.txt");
        Scanner ansScan = new Scanner(ansFile);
        XMLOrganize3 tester = new XMLOrganize3();
        ArrayList<String> answers = new ArrayList<String>();
        int ansIndex = 0;
        //tester.makeSpace(answers);
        while(ansScan.hasNextLine()){
            String line = ansScan.nextLine();
            answers.set(ansIndex, line);
            ansIndex++;
        }
        //XMLOrganize3 tester = new XMLOrganize3();

        File dateFile = new File("XMLDatesJanMay.txt");
        Scanner dateScan = new Scanner(dateFile);
        ArrayList<String> dates = new ArrayList<String>();
        while(dateScan.hasNextLine()){
            String line = dateScan.nextLine();
            dates.add(line);            
        }

        File catFile = new File("JanMayCat.txt");
        Scanner catScan = new Scanner(catFile);
        ArrayList<String> cats = new ArrayList<String>();
        while(catScan.hasNextLine()){
            String line = catScan.nextLine();
            cats.add(line);
        }

        File questionFile = new File("questionsJanMay.txt");
        Scanner questScan = new Scanner(questionFile);
        ArrayList<String> questions = new ArrayList<String>();
        while(questScan.hasNextLine()){
            String line = questScan.nextLine();
            questions.add(line);
        }

        File savFile = new File("JanMaySav.txt");
        Scanner savScan = new Scanner(savFile);
        ArrayList<String> savs = new ArrayList<String>();
        while(savScan.hasNextLine()){
            String line = savScan.nextLine();
            savs.add(line);
        }

        int questCount = 0;
        int ansCount = 0;
ArrayList<String> finalFileArray = new ArrayList<String>();


        tester.print(answers);
        tester.print(questions);
        tester.print(dates);
        tester.print(savs);
        tester.print(cats);
        //   try{
        //       File neatFile = new File("XMLPrep.txt");

    }

    public void print(ArrayList<String> listIn){
        int count = 0; 
        for(int i = 0; i < listIn.size(); i++){
            //System.out.println(listIn.get(i));
            count++;
        }
        System.out.println("List Size: " + count);
    }

}

