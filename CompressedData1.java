import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class CompressedData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompressedData1
{
    public static void main (String[]args) throws FileNotFoundException {
        File file = new File("MAYAUG.txt");
        Scanner scan = new Scanner(file);
        int dayNum = 1;
        String day = "Day: ";
        try{
            File myfile = new File("MayAugScript.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            while(scan.hasNextLine()){
                String filename = day + dayNum;
                File file2 = new File(filename);
                Scanner in = new Scanner(file2);
                dayNum++;
                while (in.hasNextLine()){
                    Pattern p = Pattern.compile("\"text\":\"(.+)\"");
                    String input;
                    Matcher m = p.matcher(input = in.nextLine());
                    System.out.println("-->" + input);
                    String patternMatch = "";
                    while (m.find()){
                        patternMatch = m.group();
                        String question = patternMatch.replaceAll("\\?"," ?");
                        System.out.println(question);
                        pwrite.print(question);
                        System.out.println();
                        //pwrite.print();
                        System.out.println("--------------------------------");
                    }

                }
                //pwrite.println(); 
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
