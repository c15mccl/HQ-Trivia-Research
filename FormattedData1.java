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
            String patternMatch = "";
            while (scan.hasNext()){

                //System.out.println("***QUESTIONS***");    
                Pattern p1 = Pattern.compile("\"text\":\"((\\w+\\s){1,})\\?");
                Matcher m1 = p1.matcher(scan.nextLine());
                while (m1.find()){
                    System.out.print("Question " +(a++)+":");
                    patternMatch = m1.group();
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);

                    System.out.println("--------------------------------");
                }
            }
            while (scan.hasNext()){           
                Pattern p2 = Pattern.compile("\"category\"(.{1,10})\"\\,{9}");
                Matcher m2 = p2.matcher(scan.nextLine());

                while (m2.find()){

                    patternMatch = m2.group();
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);
                    System.out.println("--------------------------------");
                }
            }
            while (scan.hasNext()){  
                Pattern p3 = Pattern.compile("\"answers\"(.{200})\"");
                Matcher m3 = p3.matcher(scan.nextLine());
                while (m3.find()){
                    System.out.print("Answer " +(b++)+"-"+(b+1)+":");
                    patternMatch = m3.group();
                    System.out.println(patternMatch);
                    pwrite.println("--------------------------------");
                    pwrite.println(patternMatch);
                    pwrite.println("--------------------------------");
                    System.out.println("--------------------------------");
                }

            }
            while (scan.hasNext()){
                Pattern p4 = Pattern.compile("\"savage\":(\\w++)");
                Matcher m4 = p4.matcher(scan.nextLine());
                while (m4.find()){
                    patternMatch = m4.group();
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

