import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class MayAugGrabAns here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MayAugGrabAns
{
    public static void main(String[]args)throws FileNotFoundException{
        File file = new File("MayAugAnsCat1.txt");
        Scanner scan = new Scanner(file);
        try{
            File myfile = new File("MayAugAnswers.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            //System.out.println(line);
            while (scan.hasNextLine()){
                String element = "]";
                String line = scan.nextLine();
                StringBuilder sb = new StringBuilder(line);

                sb.toString();
                int removeLine = line.indexOf(element);
                sb.delete(removeLine+1, line.length());
                String divider = "---------------------------------------------------------------------------------------------------";
                System.out.println(sb.toString());
                pwrite.println(sb.toString());
                System.out.println(divider);
                pwrite.println(divider);
            }
            pwrite.close();
            fwrite.close();
        }
        catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
