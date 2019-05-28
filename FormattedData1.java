import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class FormattedData1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FormattedData1
{
    public static void main (String[]args) throws FileNotFoundException {
        File file = new File("MayAugQuestions.txt");
        Scanner scan = new Scanner(file);
        System.out.println("START");
        int a = 1;
        int b = 1;
        try{
            File myfile = new File("MayAugList.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            String firstQues = "Which of these is a common kind";
            String patternMatch = "";
            String ques = scan.nextLine();   
            while (scan.hasNextLine()){

                //System.out.println("***QUESTIONS***");    
                Pattern p1 = Pattern.compile("\"text\":\"((\\w+\\s){1,})\\?");
                Matcher m1 = p1.matcher(scan.nextLine());
                while (m1.find()){
                    System.out.print("Question " +(a++)+":");
                    patternMatch = m1.group();
                    //pwrite.println("Question " +(a++)+":");
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);

                    System.out.println("--------------------------------");
                }
            }

            fwrite.close();
            pwrite.close();
        }

        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

    }
}

