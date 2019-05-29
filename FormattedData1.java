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
        Scanner in1 = new Scanner(file);
        Scanner in2 = new Scanner(file);
        Scanner in3 = new Scanner(file);
        System.out.println("START");
        int a = 1;
        int b = 1;
        try{
            File myfile = new File("MayAugList.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            String patternMatch = "";
            /*while (scan.hasNextLine()){

                //System.out.println("***QUESTIONS***");    
                Pattern p1 = Pattern.compile("\"text\":\"((\\w+\\s){1,})\\?");
                Matcher m1 = p1.matcher(scan.nextLine());
                while (m1.find()){
                    System.out.println("Question " +(a)+": "+patternMatch);
                    patternMatch = m1.group();
                    pwrite.println("Question " +(a)+": "+patternMatch);
                    System.out.println("--------------------------------");
                    a++;
                }
            }
            while(in1.hasNextLine()){
                Pattern p2 = Pattern.compile("\"category\":\"(.{1,15})\"");
                Matcher m2 = p2.matcher(in1.nextLine());
                while (m2.find()){
                    patternMatch = m2.group();
                    System.out.println(m2.groupCount());
                    pwrite.println(b+": "+patternMatch);
                    System.out.println(b+": "+patternMatch);
                    System.out.println("--------------------------------");
                    b++;
                }
            }
            */
            while(in2.hasNextLine()){
                Pattern p3 = Pattern.compile("\"answers\":(.{200}),");
                Matcher m3 = p3.matcher(in2.nextLine());
                while (m3.find()){
                    patternMatch = m3.group();
                    System.out.println(m3.groupCount());
                    pwrite.println(b+": "+patternMatch);
                    System.out.println(b+": "+patternMatch);
                    System.out.println("--------------------------------");
                    b++;
                }

                fwrite.close();
                pwrite.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }

    }
}

