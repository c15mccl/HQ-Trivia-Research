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
        int a = 1;
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
                for(int j = i+1; j < questions.size(); j++){

                    if((questions.get(i)).equals(questions.get(j))){
                        questions.remove(j);
                        //System.out.println("Found one");
                        j--;
                    }
                }
                System.out.println("Count: "+a+questions.get(i));
                a++;
                pwrite2.println(questions.get(i));
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
