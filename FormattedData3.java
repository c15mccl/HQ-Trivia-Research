import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class FormattedData3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FormattedData3
{
    public static void main(String args[]) throws IOException{
        File file = new File("JanMay2019Questions.txt");
        Scanner scan = new Scanner(file);
        System.out.println("Start");
        try{
            File myfile = new File("JanMayList.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);

            while (scan.hasNextLine()){
                //Pattern p1 = Pattern.compile("\"((\\w+\\s){1,})\\?");
                //Matcher m1 = p1.matcher(scan.nextLine());
                //Pattern p2 = Pattern.compile("\"category\"(.{1,10})\",");
                //Matcher m2 = p2.matcher(scan.nextLine());
                Pattern p3 = Pattern.compile("\"answers\":[{\"text\":\"(.{1})\"}]");
                Matcher m3 = p3.matcher(scan.nextLine());
                //Pattern p4 = Pattern.compile("\"savage\":(\\w++)");
                //Matcher m4 = p4.matcher(scan.nextLine());
                //Pattern p5 = Pattern.compile("\"savage\":(\\w++)");
                //Matcher m5 = p5.matcher(scan.nextLine());
                String str;
                //Matcher m = p.matcher(str = scan.nextLine());
                //System.out.println("->" + str + "<-");
                String patternMatch = "";

                /*while (m1.find()){
                    patternMatch = m1.group();
                    System.out.println(patternMatch);
                    pwrite.println(patternMatch);
                    System.out.println("--------------------------------");
                }
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
