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
        File file1 = new File("MayAugQuestions.txt");
        File file2 = new File("MayAugAnswers.txt");
        File file3 = new File("MayAugCat.txt");
        Scanner in1 = new Scanner(file1);
        Scanner in2 = new Scanner(file2);
        Scanner in3 = new Scanner(file3);
        ArrayList <String> allData = new ArrayList <String>();
        ArrayList <String> cat = new ArrayList <String>();
        try{
            File myfile2 = new File("MayAugFinal.txt");
            FileWriter fwrite2 = new FileWriter(myfile2);
            PrintWriter pwrite2 =  new PrintWriter(fwrite2);
            while (in1.hasNextLine()){
                String finder1 = in1.nextLine();
                //System.out.println("->"+finder1);
                finder1 = finder1.substring(0,(finder1.length()-2));
                finder1 = finder1 + "?";
                allData.add(finder1);
            }
            while(in2.hasNextLine()){
                String finder2 = in2.nextLine();
                //System.out.println("->"+finder2);
                allData.add(finder2);
            }
            while(in3.hasNextLine()){
                String finder3 = in3.nextLine();
                //System.out.println("->"+finder2);
                allData.add(finder3);
            }
            for(int i = 0; i <allData.size() -1; i++){
                for(int j = i+1; j < allData.size(); j++){

                    if((allData.get(i)).equals(allData.get(j))){
                        allData.remove(j);
                        //System.out.println("Found one");
                        j--;
                    }
                }
                System.out.println(allData.get(i));
                pwrite2.println(allData.get(i));
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
