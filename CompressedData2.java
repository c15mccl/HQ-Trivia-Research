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
public class CompressedData2
{
    public static void main (String[]args) throws FileNotFoundException {
        File file = new File("SEPDEC_URLS.txt");
        Scanner scan = new Scanner(file);
        int day = 1;
        String game = "Game: ";
        try{
            File myfile = new File("SepDecQuestions.txt");
            FileWriter fwrite =  new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            while(scan.hasNextLine()){
                
                //String URL = scan.nextLine();
                //System.out.println(URL);
                String filename = game + day;
                //System.out.println(filename);
                File file2 = new File(filename);
                Scanner in = new Scanner(file2);
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
                        pwrite.println(question);
                        System.out.println();
                        //pwrite.println();
                        System.out.println("--------------------------------");
                    }
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
