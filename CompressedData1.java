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
        //int var = 1;
        try{
            File myfile = new File("MayAugQuestions.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            while(scan.hasNextLine()){
                String URL = scan.nextLine();
                //System.out.println(URL);
                String filename = URL.substring(27,37);
                //System.out.println(filename);
                File file2 = new File(filename);
                Scanner in = new Scanner(file2);

                while (in.hasNextLine()){
                    Pattern p = Pattern.compile("\"text\":\"(.+)\"");
                    Matcher m = p.matcher(in.nextLine());
                    String patternMatch = "";
                    while (m.find()){
                        patternMatch = m.group();
                        System.out.println(patternMatch);
                        pwrite.println(patternMatch);
                        System.out.println();
                        pwrite.println();
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
