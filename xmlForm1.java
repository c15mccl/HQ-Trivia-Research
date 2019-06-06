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
                String day = "";
                String month = "";
                String year = "";
                if(line.contains("Dates: ")){
                    day = line.substring(15,17);
                    month = line.substring(12,14);
                    year = line.substring(7,11);
                    line = line.replace("Dates:","<Dates>");
                    line = line + " </Dates>";
                    System.out.println("<Dates>");
                    System.out.println("\t<month> "+month+" </month>");
                    System.out.println("\t<day> "+day+" </day>");
                    System.out.println("\t<year> "+year+" </year>");
                    System.out.println("</Dates>");
                    pwrite.println("<Dates>");
                    pwrite.println("\t<month> "+month+" </month>");
                    pwrite.println("\t<day> "+day+" </day>");
                    pwrite.println("\t<year> "+year+" </year>");
                    pwrite.println("</Dates>");
                }
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
