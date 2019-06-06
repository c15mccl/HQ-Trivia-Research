import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class xmlForm1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class xmlForm1
{
    public static void main (String[]args) throws FileNotFoundException{
        File file = new File("MayAugFinal.txt");
        Scanner scan = new Scanner(file);
        try{
            File myfile = new File("xmlForm1.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                if(line.contains("\"text\":")){
                    line = line.replace("\"text\":","<Question> ");
                }
                if(line.contains("?")){
                    line = line + " </Question>";
                }
                if(line.contains("Answers:")){
                    line = line.replace("Answers:","<Answer>");
                    line = line + " </Answer>";
                }
                if(line.contains("Category: \"category\":")){
                    line = line.replace("Category: \"category\":","<Category cat = ");
                    line = line + "> </Category>";
                }
                if(line.contains("Savage \"savage\":")){
                    line = line.replace("Savage \"savage\":","<Savage level = ");
                    line = line + "> </Savage>";
                }
                System.out.println(line);
                pwrite.println(line);
            }

            pwrite.close();
            fwrite.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }

}
