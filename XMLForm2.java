import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class XMLForm2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class XMLForm2
{
    public static void main(String [] args) throws FileNotFoundException
    {
        File file = new File("SepDecFinal.txt");
        Scanner scan = new Scanner(file);
        ArrayList <String> answers = new ArrayList <String> ();
        ArrayList <String> questions = new ArrayList <String> ();
        try{
            File myfile = new File("xmlForm2.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                // String day = "";
                // String month = "";
                // String year = "";
                // if(line.contains("Dates: ")){
                    // day = line.substring(15,17);
                    // month = line.substring(12,14);
                    // year = line.substring(7,11);
                    // line = line.replace("Dates:","<Dates>");
                    // line = line + " </Dates>";
                    // System.out.println("<Game>");
                    // System.out.println("\t<Dates>");
                    // System.out.println("\t\t<month> "+month+" </month>");
                    // System.out.println("\t\t<day> "+day+" </day>");
                    // System.out.println("\t\t<year> "+year+" </year>");
                    // System.out.println("\t</Dates>");
                    // pwrite.println("<Game>");
                    // pwrite.println("\t<Dates>");
                    // pwrite.println("\t\t<month> "+month+" </month>");
                    // pwrite.println("\t\t<day> "+day+" </day>");
                    // pwrite.println("\t\t<year> "+year+" </year>");
                    // pwrite.println("\t</Dates>");
                // }
                if(line.contains("\"text\":")){
                    line = line.replace("\"text\":","<Question> ");
                }
                if(line.contains("?")){
                    line = line + " </Question>";
                    questions.add(line);
                }
                int ansCount = 0;
                if(line.contains("Answers:")){
                    ansCount++;
                    if(ansCount == 1){
                        if(line.contains("true")){ 
                            line = line.replace("Answers:", "<answerA correct = true");
                            line = line + "> </answerA>";
                        }
                        if(line.contains("false")){
                            line = line.replace("Answers:", "<answerA correct = false");
                            line = line + "> </answerA>";
                        }
                    }
                    else if(ansCount == 2){
                        if(line.contains("true")){ 
                            line = line.replace("Answers:", "<answerB correct = true");
                            line = line + "> </answerB>";
                        }
                        if(line.contains("false")){
                            line= line.replace("Answers:", "<answerB correct = false");
                            line = line + "> </answerB>";
                        }
                    } 
                    else if(ansCount == 3){
                        if(line.contains("true")){ 
                            line = line.replace("Answers:", "<answerC correct = true");
                            line = line + "> </answerC>";
                        }
                        if(line.contains("false")){
                            line = line.replace("Answers:", "<answerC correct = false");
                            line = line + "> </answerC>";
                        }
                    }

                }
                // if(line.contains("Category: \"category\":")){
                    // line = line.replace("Category: \"category\":","<Category cat = ");
                    // line = line + "> </Category>";
                // }
                // if(line.contains("Savage \"savage\":")){
                    // line = line.replace("Savage \"savage\":","<Savage level = ");
                    // line = line + "> </Savage>";
                // }
                
            }
            int i = 0;
            while(i < answers.size())
            {
                System.out.println(questions.get(i));
                System.out.println(answers.get(i));
                i++;
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
