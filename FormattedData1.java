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
        try{
            File myfile = new File("MayAugList.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);

            while (scan.hasNextLine()){

                //Pattern p1 = Pattern.compile("\"((\\w+\\s){1,})\\?");
                //Matcher m1 = p1.matcher(scan.nextLine());

                //Pattern p2 = Pattern.compile("\"category\"(.{1,10})\"\\,{9}");
                //Matcher m2 = p2.matcher(scan.nextLine());
                //System.out.println("***ANSWERS***");
                Pattern p3 = Pattern.compile("\"answers\"(.{200})\"");
                Matcher m3 = p3.matcher(scan.nextLine());
                //Pattern p4 = Pattern.compile("\"savage\":(\\w++)");
                //Matcher m4 = p4.matcher(scan.nextLine());
                //Pattern p5 = Pattern.compile("\"savage\":(\\w++)");
                //Matcher m5 = p5.matcher(scan.nextLine());
                String str;
                //Matcher m = p.matcher(str = scan.nextLine());
                //System.out.println("->" + str + "<-");
                String patternMatch = "";
                //System.out.println("***QUESTIONS***");                    
                /*while (m1.find()){

                    patternMatch = m1.group();
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);
                    System.out.println("--------------------------------");
                }
                System.out.println("***CATEGORIES***");
                while (m2.find()){

                    patternMatch = m2.group();
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);
                    System.out.println("--------------------------------");
                }
                
                */
                while (m3.find()){
                    patternMatch = m3.group();
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);
                    System.out.println("--------------------------------");
                }
                /*
                while (m4.find()){
                    patternMatch = m4.group();
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);
                    System.out.println("--------------------------------");
                }
                while (m5.find()){
                    patternMatch = m5.group();
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);
                    System.out.println("--------------------------------");
                }*/
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
