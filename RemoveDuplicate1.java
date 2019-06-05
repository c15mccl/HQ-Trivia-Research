import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class RemoveDuplicate1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RemoveDuplicate1
{
    public static void main(String[]args) throws IOException{
        File file1 = new File("MayAugQuestions.txt");
        File file2 = new File("MayAugAnswers.txt");
        File file3 = new File("MayAugCat.txt");
        File file4 = new File("MayAugSav.txt");
        Scanner in1 = new Scanner(file1);
        Scanner in2 = new Scanner(file2);
        Scanner in3 = new Scanner(file3);
        Scanner in4 = new Scanner(file4);
        ArrayList <String> questions = new ArrayList <String>();
        ArrayList <String> answers = new ArrayList <String>();
        ArrayList <String> cat = new ArrayList <String>();
        ArrayList <String> savage = new ArrayList <String>();
        try{
            File myfile2 = new File("MayAugFinal.txt");
            FileWriter fwrite2 = new FileWriter(myfile2);
            PrintWriter pwrite2 =  new PrintWriter(fwrite2);
            while (in1.hasNextLine()){
                String finder1 = in1.nextLine();
                //System.out.println("->"+finder1);
                finder1 = finder1.substring(0,(finder1.length()-2));
                finder1 = finder1 + "?";
                questions.add(finder1);
            }
            while(in2.hasNextLine()){
                String finder2 = in2.nextLine();
                answers.add(finder2);
            }
            while(in3.hasNextLine()){
                String finder3 = in3.nextLine();
                //System.out.println("->"+finder3);
                String element = "},";
                if(finder3.contains(element)){
                    System.out.println();
                }
                cat.add(finder3);
            }
            while(in4.hasNextLine()){
                String finder4 = in4.nextLine();
                //System.out.println("->"+finder4);
                savage.add(finder4);
            }
            for(int i = 0; i <questions.size() -1; i++){
                for(int j = i+1; j < questions.size(); j++){

                    if((questions.get(i)).equals(questions.get(j))){
                        questions.remove(j);
                        //System.out.println("Found one");
                        j--;
                    }
                }
                System.out.println("Questions: "+questions.get(i));
                pwrite2.println(questions.get(i));
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
            for(int i = 0; i < cat.size(); i++){
                System.out.println("Category: "+cat.get(i));
                pwrite2.println("Category: "+cat.get(i));
            }
            for(int i = 0; i < cat.size(); i++){
                System.out.println("Savage "+savage.get(i));
                pwrite2.println("Savage "+savage.get(i));
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
