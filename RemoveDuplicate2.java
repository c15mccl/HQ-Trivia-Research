import org.jsoup.nodes.*;
import org.jsoup.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 * Write a description of class RemoveDuplicate2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RemoveDuplicate2
{
    public static void main(String[]args) throws IOException{
        File file = new File("SepDecQuestions.txt");
        File file2 = new File("SepDecAnswers.txt");
        File file3 = new File("SepDecCat.txt");
        Scanner in1 = new Scanner(file);
        Scanner in2 = new Scanner(file2);
        Scanner in3 = new Scanner(file3);
        ArrayList <String> category = new ArrayList <String>();
        ArrayList <String> allData = new ArrayList <String>();
        int a = 1;
        try{
            File myfile2 = new File("SepDecFinal.txt");
            FileWriter fwrite2 = new FileWriter(myfile2);
            PrintWriter pwrite2 =  new PrintWriter(fwrite2);
            
            while (in1.hasNextLine()){
                String finder = in1.nextLine();
                //System.out.println(finder);
                allData.add(finder);
            }
            while (in2.hasNextLine()){
                String finder2 = in2.nextLine();
                //System.out.println(finder);
                allData.add(finder2);
            }
            while(in3.hasNextLine()){
                String finder3 = in3.nextLine();
                allData.add(finder3);
            }
            for(int i = 0; i < allData.size() -1; i++){
                for(int j = i+1; j < allData.size(); j++){

                    if((allData.get(i)).equals(allData.get(j))){
                        allData.remove(j);
                        //System.out.println("Found one");
                        j--;
                    }
                }
                System.out.println(allData.get(i));
                a++;
                pwrite2.println(allData.get(i));
            }
            
            // for(int i = 0; i < category.size() - 1; i++){
                // System.out.println(category.get(i));
                // pwrite2.println(category.get(i));
            // }
            

            fwrite2.close();
            pwrite2.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
