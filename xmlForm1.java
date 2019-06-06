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
            int ansCount = 0;                
            while(scan.hasNextLine()){
                String line = scan.nextLine();

                if(ansCount >= 3) ansCount = 0;
                String day = "";
                String month = "";
                String year = "";
                if(line.contains("Dates: ")){
                    day = line.substring(15,17);
                    month = line.substring(12,14);
                    year = line.substring(7,11);
                    line = line.replace("Dates:","<Dates>");
                    line = line + " </Dates>";
                    System.out.println("<Game>");
                    System.out.println("\t<Dates>");
                    System.out.println("\t\t<month> "+month+" </month>");
                    System.out.println("\t\t<day> "+day+" </day>");
                    System.out.println("\t\t<year> "+year+" </year>");
                    System.out.println("\t</Dates>");
                    pwrite.println("<Game>");
                    pwrite.println("\t<Dates>");
                    pwrite.println("\t\t<month> "+month+" </month>");
                    pwrite.println("\t\t<day> "+day+" </day>");
                    pwrite.println("\t\t<year> "+year+" </year>");
                    pwrite.println("\t</Dates>");
                }
                if(line.contains("\"text\":")){
                    line = line.replace("\"text\":","<Question> ");
                    line = line + " </Question>";
                    System.out.println(line);
                    pwrite.println(line);
                }
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
                            line = line.replace("Answers:", "<answerB correct = false");
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
                    System.out.println(line);
                    pwrite.println(line);

                }

                if(line.contains("Category: \"category\":")){
                    line = line.replace("Category: \"category\":","<Category cat = ");
                    line = line + "> </Category>";
                    System.out.println(line);
                    pwrite.println(line);
                }
                if(line.contains("Savage \"savage\":")){
                    line = line.replace("Savage \"savage\":","<Savage level = ");
                    line = line + "> </Savage>";
                    System.out.println(line);
                    pwrite.println(line);
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
