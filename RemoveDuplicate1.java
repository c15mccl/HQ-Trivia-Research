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
        File file = new File("MayAugList.txt");
        Scanner in = new Scanner(file);
        ArrayList <String> questions = new ArrayList <String>();
        try{
            File myfile2 = new File("MayAugFinal.txt");
            FileWriter fwrite2 = new FileWriter(myfile2);
            PrintWriter pwrite2 =  new PrintWriter(fwrite2);
            while (in.hasNextLine()){
                String finder = in.nextLine();
                //System.out.println(finder);
                questions.add(finder);
            }
            for(int i = 0; i < questions.size() -1; i++){
                for(int j = 0; j < i; j++){

                    if(questions.get(i).equals(questions.get(j))){
                        questions.remove(questions.get(i));
                    }
                }
                System.out.println(questions);
                pwrite2.println(questions);
            }

            fwrite2.close();
            pwrite2.close();

            System.out.println(questions);
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
