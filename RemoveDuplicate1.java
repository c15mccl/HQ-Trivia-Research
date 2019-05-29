import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class RemoveDuplicate1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RemoveDuplicate1
{
    public static void main(String[]args) throws IOException{
        File myfile2 = new File("MayAugList.txt");
        Scanner in = new Scanner(myfile2);
        try{
            FileWriter fwrite2 = new FileWriter(myfile2);
            PrintWriter pwrite2 =  new PrintWriter(fwrite2);
            String finder = in.nextLine();
            ArrayList <String> questions = new ArrayList <String>();
            while (in.hasNextLine()){
                questions.add(finder);
                for(int i = 0; i < questions.size() -1; i++){
                    for(int j = 0; j < i; j++){
                        System.out.println(questions.get(i));
                        if(questions.get(i).equals(questions.get(j))){
                            questions.remove(questions.get(i));
                        }
                    }
                    System.out.println(questions);
                    pwrite2.println(questions);
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
