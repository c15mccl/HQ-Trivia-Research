import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class SepDecQuestions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SepDecQuestions
{
    public static void main(String []args) throws FileNotFoundException
    {
        File file = new File("SepDecAnsCat.txt");
        Scanner in = new Scanner(file);
        //Scanner in = new Scanner(file);
        try{
            File file2 = new File("SepDecQuestions.txt");
            FileWriter fwrite2 = new FileWriter(file2);
            PrintWriter pwrite2 =  new PrintWriter(fwrite2);
            while(in.hasNextLine()){
               String line = in.nextLine();
                for(int i = line.length(); i > 0; i--){
                    if(line.contains("\"text\":")){
                        
                        int index = line.lastIndexOf("\"text\":");
                        String delete = line.substring(0,index);
                        String newLine = line.replace(delete,"");
                        System.out.println(newLine);
                        pwrite2.println(newLine);
                        line = in.nextLine();
                    }
                }
            }
            fwrite2.close();
            pwrite2.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
// //if(charAt(i).equals("\"") && charAt(i + 1).equals("t") && charAt(i + 2).equals("e") && charAt(i + 3).equals("x")
// && charAt(i + 4).equals("t") && charAt(i + 5).equals("\"") && charAt(i + 6).equals(":")){
// charRemoveAt(line,i - 1);
// 