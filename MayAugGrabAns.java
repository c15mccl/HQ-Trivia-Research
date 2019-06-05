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
                String element1 = "]";
                String line = scan.nextLine();
                StringBuilder sb = new StringBuilder(line);

                sb.toString();
                int removeLine = line.indexOf(element1);
                sb.delete(removeLine+1, line.length());
                Scanner in = new Scanner(sb.toString());
                while(in.hasNextLine()){
                    String finder = in.nextLine();
                    String element2 = "},";
                    String answerA = "";
                    String answerB = "";
                    String answerC = "";
                    if(finder.contains(element2)){
                        int fIndex = finder.indexOf(element2);
                        int lIndex = finder.lastIndexOf(element2);
                        answerA = finder.substring(0,fIndex);
                        answerB = finder.substring((fIndex),(lIndex));
                        answerC = finder.substring((lIndex),(finder.length()));
                        answerA = answerA.replace("\"text\":","");
                        if(answerB.contains("},")){
                            answerB = answerB.replace("},{\"text\":","");
                        }
                        if(answerC.contains("},")){
                            answerC = answerC.replace("},{\"text\":","");
                        }
                    }
                    System.out.println(answerA);
                    pwrite.println(answerA);
                    System.out.println(answerB);
                    pwrite.println(answerB);
                    System.out.println(answerC);
                    pwrite.println(answerC);
                }
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
