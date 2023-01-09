
package words;
import java.io.*;
public class Words {

    public static void main(String[] args) throws IOException{
        BufferedReader in = null;
        String plik = "template.txt";
        String row;
        int allWords = 0;
        int allSigns = 0;
        int allSignsWOspaces = 0;
        try{ 
            in = new BufferedReader( 
                       new FileReader( plik ));
     
            while((row = in.readLine())!=null){
                row = row.trim();
                String[] words = row.split(" +");
                allWords += words.length;
                
                allSigns += row.length();
                for (String x :words){
                    allSignsWOspaces += x.length();
                }
                
            }
        }
        finally{
            if(in != null) 
                in.close();
            }
        System.out.print("Liczba slow to: " + allWords +"\n"
                + "Liczba znaków to: " + allSigns + "(w tym "+ (allSigns - allSignsWOspaces )+" spacji)\n");
    }   
}
