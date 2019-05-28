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
public class FormattedData2
{
    public static void main (String[]args) throws FileNotFoundException {
        File file = new File("MayAugQuestions.txt");
        Scanner scan = new Scanner(file);
        System.out.println("START");
        int a = 1;
        int b = 1;
        try{
            File myfile = new File("SepDecList.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            //String firstQues = "Which of these is a common kind";
            String patternMatch = "";
            //String ques = scan.nextLine();
            while (scan.hasNextLine()){
                //Pattern p1 = Pattern.compile("\"((\\w+\\s){1,})\\?");
                //Matcher m1 = p1.matcher(scan.nextLine());
                Pattern p1 = Pattern.compile("\"text\":\"((\\w+\\s){1,})\\?");
                Matcher m1 = p1.matcher(scan.nextLine());
                //Pattern p3 = Pattern.compile("\"answers\":[{\"(\\w++)\"}]");
                //Matcher m3 = p3.matcher(scan.nextLine());
                //Pattern p4 = Pattern.compile("\"savage\":(\\w++)");
                //Matcher m4 = p4.matcher(scan.nextLine());
                //Pattern p5 = Pattern.compile("\"savage\":(\\w++)");
                //Matcher m5 = p5.matcher(scan.nextLine());
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
