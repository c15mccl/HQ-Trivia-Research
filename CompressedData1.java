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
        try{
            FileWriter fwrite =  new FileWriter("MayAugQuestions");
            BufferedWriter writer = new BufferedWriter(fwrite);
            while(scan.hasNextLine()){
                String URL = scan.nextLine();
                //System.out.println(URL);
                String parse1 = URL.substring(27,37);
                String parse2 = URL.substring(38);
                String parse3 = "-";
                String parse4 = parse1 + parse3 + parse2;
                String filename = parse4 + ".txt";
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
                        writer.write(patternMatch);
                        System.out.println("--------------------------------");
                    }
                }
            }
            writer.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
        
    }
}
