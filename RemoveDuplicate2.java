import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class RemoveDuplicate2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RemoveDuplicate2
{
    public static void main(String[]args) throws IOException{
        File file = new File("SepDecQuestions.txt");
        File file2 = new File("SepDecAnswers.txt");
        File file3 = new File("SepDecCat.txt");
        File file4 = new File("SepDecSav.txt");
        File file5 = new File("SepDecDates.txt");
        Scanner in1 = new Scanner(file);
        Scanner in2 = new Scanner(file2);
        Scanner in3 = new Scanner(file3);
        Scanner in4 = new Scanner(file4);
        Scanner in5 = new Scanner(file5);
        ArrayList <String> category = new ArrayList <String>();
        ArrayList <String> questions = new ArrayList <String>();
        ArrayList <String> answers = new ArrayList <String>();
        ArrayList <String> savage = new ArrayList <String>();
        ArrayList <String> dates = new ArrayList <String>();
        int a = 1;
        try{
            File myfile2 = new File("SepDecFinal.txt");
            FileWriter fwrite2 = new FileWriter(myfile2);
            PrintWriter pwrite2 =  new PrintWriter(fwrite2);
            
            while (in1.hasNextLine()){
                String finder = in1.nextLine();
                //System.out.println(finder);
                questions.add(finder);
            }
            while (in2.hasNextLine()){
                String finder2 = in2.nextLine();
                //System.out.println(finder);
                answers.add(finder2);
                String element = "},";
                
            }
            while(in3.hasNextLine()){
                String finder3 = in3.nextLine();
                category.add(finder3);
            }
            while(in4.hasNextLine()){
                String finder4 = in4.nextLine();
                //System.out.println("->"+finder4);
                savage.add(finder4);
            }
            while(in5.hasNextLine()){
                String finder5 = in5.nextLine();
                dates.add(finder5);
            }
            for(int i = 0; i < questions.size() -1; i++){
                for(int j = i+1; j < questions.size(); j++){

                    if((questions.get(i)).equals(questions.get(j))){
                        questions.remove(i);
                        //System.out.println("Found one");
                        j--;
                    }
                }
                System.out.println("Questions" + questions.get(i));
                pwrite2.println("Questions: " + questions.get(i));
            }
            for(int i = 0; i < answers.size() -1; i++){
                for(int j = i+1; j < answers.size(); j++){

                    if((answers.get(i)).equals(answers.get(j))){
                        answers.remove(j);
                        //System.out.println("Found one");
                        j--;
                    }
                }
               
                System.out.println("Answers: "+answers.get(i));
                pwrite2.println("Answers: "+answers.get(i)); 
            }
            for(int i = 0; i < category.size() - 1; i++){
                System.out.println("Category: " + category.get(i));
                pwrite2.println("Category: " + category.get(i));
            }
            for(int i = 0; i < savage.size(); i++){
                System.out.println("Savage "+savage.get(i));
                pwrite2.println("Savage "+savage.get(i));
            }
            for(int i = 0; i < dates.size() -1; i++){
                // for(int j = i+1; j < dates.size(); j++){

                    // // if((dates.get(i)).equals(dates.get(j))){
                        // // dates.remove(j);
                        // // //System.out.println("Found one");
                        // // j--;
                    // // }
                // }
                System.out.println("Dates: "+dates.get(i));
                pwrite2.println("Dates: "+dates.get(i)); 
            }
            

            fwrite2.close();
            pwrite2.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
