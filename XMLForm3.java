import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class XMLForm3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class XMLForm3
{
        public static void main (String[]args) throws FileNotFoundException{
        File file = new File("MayAugFinal.txt");
        Scanner scan1 = new Scanner(file);
        Scanner scan2 = new Scanner(file);
        Scanner scan3 = new Scanner(file);
        Scanner scan4 = new Scanner(file);
        ArrayList <String> questions = new ArrayList <String>();
        ArrayList <String> answers = new ArrayList <String>();
        ArrayList <String> dates = new ArrayList <String>();
        String day = "";
        String month = "";
        String year = "";
        String gameNumber = "";
        try{
            File myfile = new File("xmlForm1.txt");
            FileWriter fwrite = new FileWriter(myfile);
            PrintWriter pwrite =  new PrintWriter(fwrite);
            int ansCount = 0;    
            while(scan1.hasNextLine()){
                String line1 = scan1.nextLine();
                if(line1.contains("Dates: ")){
                    day = line1.substring(15,17);
                    month = line1.substring(12,14);
                    year = line1.substring(7,11);
                    gameNumber = line1.substring(18,19);
                    line1 = line1.replace("Dates:","<Dates>");
                    line1 = line1 + " </Dates>";
                    String lineA = "<Game>\n";
                    String lineB = "\t<Dates>\n";
                    String lineC = "\t\t<month> "+month+" </month>\n";
                    String lineD = "\t\t<day> "+day+" </day>\n";
                    String lineE = "\t\t<year> "+year+" </year>\n";
                    String lineF = "\t</Dates>\n";
                    line1 = lineA + lineB + lineC + lineD + lineE + lineF;
                    //System.out.println(line1);
                    //pwrite.println(line1);
                    dates.add(line1);
                }
            }
            while(scan2.hasNextLine()){
                String line2 = scan2.nextLine();
                if(line2.contains("\"text\":")){
                    line2 = line2.replace("\"text\":","\t<Question> ");
                    line2 = line2 + " </Question>";
                    //System.out.println(line2);
                    //pwrite.println(line2);
                    questions.add(line2);
                }
            }
            while(scan3.hasNextLine()){
                String line3 = scan3.nextLine();
                if(line3.contains("Answers:")){
                    if(ansCount >= 3) ansCount = 0;
                    ansCount++;
                    if(ansCount == 1){
                        if(line3.contains("true")){ 
                            line3 = line3.replace("Answers:", "\t\t<answerA correct = true");
                            line3 = line3 + "> </answerA>";
                        }
                        if(line3.contains("false")){
                            line3 = line3.replace("Answers:", "\t\t<answerA correct = false");
                            line3 = line3 + "> </answerA>";
                        }
                    }
                    else if(ansCount == 2){
                        if(line3.contains("true")){ 
                            line3 = line3.replace("Answers:", "\t\t<answerB correct = true");
                            line3 = line3 + "> </answerB>";
                        }
                        if(line3.contains("false")){
                            line3 = line3.replace("Answers:", "\t\t<answerB correct = false");
                            line3 = line3 + "> </answerB>";
                        }
                    } 
                    else if(ansCount == 3){
                        if(line3.contains("true")){ 
                            line3 = line3.replace("Answers:", "\t\t<answerC correct = true");
                            line3 = line3 + "> </answerC>";
                        }
                        if(line3.contains("false")){
                            line3 = line3.replace("Answers:", "\t\t<answerC correct = false");
                            line3 = line3 + "> </answerC>";
                        }
                    }
                    answers.add(line3);
                }
            }
            int var1 = 0;
            int var2 = 0;
            int var3 = 0;
            while(var1<1000){
                System.out.println(dates.get(var1));
                System.out.println(questions.get(var1));
                System.out.println(answers.get(var2));
                System.out.println(answers.get(var2+1));
                System.out.println(answers.get(var2+2));
                pwrite.println(dates.get(var1));
                pwrite.println(questions.get(var1));
                pwrite.println(answers.get(var2));
                pwrite.println(answers.get(var2+1));
                pwrite.println(answers.get(var2+2));
                System.out.println("\t</Question>");
                pwrite.println("\t</Question>");
                System.out.println("</Game>\n");
                pwrite.println("</Game>");
                var1++;
                var2+=3;
                //var+=12;
            }
            /*while(scan4.hasNextLine()){
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
            }*/

            pwrite.close();
            fwrite.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}

