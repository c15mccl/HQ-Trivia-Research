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
        Scanner scan1 = new Scanner(file);
        Scanner scan2 = new Scanner(file);
        Scanner scan3 = new Scanner(file);
        Scanner scan4 = new Scanner(file);
        try{
            File myfile = new File("xmlForm1.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            int ansCount = 0;                
            while(scan1.hasNextLine()){
                String line1 = scan1.nextLine();
                if(ansCount >= 3) ansCount = 0;
                String day = "";
                String month = "";
                String year = "";
                if(line1.contains("Dates: ")){
                    day = line1.substring(15,17);
                    month = line1.substring(12,14);
                    year = line1.substring(7,11);
                    line1 = line1.replace("Dates:","<Dates>");
                    line1 = line1 + " </Dates>";
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
            }
            while(scan2.hasNextLine()){
                String line2 = scan2.nextLine();
                if(line2.contains("\"text\":")){
                    line2 = line2.replace("\"text\":","<Question> ");
                    line2 = line2 + " </Question>";
                    System.out.println(line2);
                    pwrite.println(line2);
                }
            }
            while(scan3.hasNextLine()){
                String line3 = scan3.nextLine();
                if(line3.contains("Answers:")){
                    ansCount++;
                    if(ansCount == 1){
                        if(line3.contains("true")){ 
                            line3 = line3.replace("Answers:", "<answerA correct = true");
                            line3 = line3 + "> </answerA>";
                        }
                        if(line3.contains("false")){
                            line3 = line3.replace("Answers:", "<answerA correct = false");
                            line3 = line3 + "> </answerA>";
                        }
                    }
                    else if(ansCount == 2){
                        if(line3.contains("true")){ 
                            line3 = line3.replace("Answers:", "<answerB correct = true");
                            line3 = line3 + "> </answerB>";
                        }
                        if(line3.contains("false")){
                            line3 = line3.replace("Answers:", "<answerB correct = false");
                            line3 = line3 + "> </answerB>";
                        }
                    } 
                    else if(ansCount == 3){
                        if(line3.contains("true")){ 
                            line3 = line3.replace("Answers:", "<answerC correct = true");
                            line3 = line3 + "> </answerC>";
                        }
                        if(line3.contains("false")){
                            line3 = line3.replace("Answers:", "<answerC correct = false");
                            line3 = line3 + "> </answerC>";
                        }
                    }

                }
            }
            while(scan4.hasNextLine()){
                String line4 = scan4.nextLine();
                if(line4.contains("Category: \"category\":")){
                    line4 = line4.replace("Category: \"category\":","<Category cat = ");
                    line4 = line4 + "> </Category>";

                }
                if(line4.contains("Savage \"savage\":")){
                    line4 = line4.replace("Savage \"savage\":","<Savage level = ");
                    line4 = line4 + "> </Savage>";

                }
                System.out.println(line4);
                pwrite.println(line4);
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

