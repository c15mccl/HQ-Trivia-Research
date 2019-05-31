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
        File file = new File("SepDecQuestions.txt");
        Scanner scan = new Scanner(file);
        Scanner in1 = new Scanner(file);
        Scanner in2 = new Scanner(file);
        Scanner in3 = new Scanner(file);
        System.out.println("START");
        try{
            File myfile = new File("SepDecList.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            String patternMatch = "";
            while (scan.hasNextLine()){

                //System.out.println("***QUESTIONS***");    
                Pattern p1 = Pattern.compile("\"text\":\"((\\w+\\s){1,})\\?");
                Matcher m1 = p1.matcher(scan.nextLine());
                Pattern p2 = Pattern.compile("\"category\":\"(.{1,15})\"");
                Matcher m2 = p2.matcher(in1.nextLine());
                Pattern p3 = Pattern.compile("\"answers\":\\[[^]]*\\]");
                Matcher m3 = p3.matcher(in2.nextLine());
                Pattern p4 = Pattern.compile("\"direct_link\":(.{22})");
                Matcher m4 = p4.matcher(in3.nextLine());
                while (m1.find() && m2.find() && m3.find() && m4.find()){
                    patternMatch = m1.group() + m2.group() + m3.group() + m4.group();
                    String question = patternMatch.replaceAll("text","Question");                   
                    System.out.println(question);
                    pwrite.println(question);
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
