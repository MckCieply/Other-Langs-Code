
package kolokwium;
import java.io.*;
import java.util.Scanner;
public class Kolokwium {

    public static void main(String[] args) throws IOException{
        Scanner scann = new Scanner(System.in); //plik nazwa dane
        String plik = scann.nextLine();     //Pobieranie nazwy pliku z konsoli zeby potem dodac .txt
        BufferedReader reader = new BufferedReader(new FileReader(plik +".TXT"));
        BufferedWriter oplacalne = new BufferedWriter(new FileWriter(plik+".Oplacalne.TXT"));
        BufferedWriter nieoplacalne = new BufferedWriter(new FileWriter(plik+".Nieoplacalne.TXT"));
        
        String row;
        while((row = reader.readLine()) != null){
            String[] elements = row.split(" +");
            //[0] == nazwa [1] == kondygnacje [2] == ocieplone [3] == cena [4] == polozenie
            String nazwa = elements[0];
            int kondygnacje = Integer.parseInt(elements[1]);
            int ocieplone = Integer.parseInt(elements[2]);
            double cena = Double.parseDouble(elements[3]);
            String polozenie = elements[4];
            if(ocieplone == 1 ){
                cena = cena * 0.80;
            }
            if(polozenie.equals("miasto") && kondygnacje > 3){
                cena = cena * 1.10;
            }
            
            
            if(cena < 200){
                //System.out.print(nazwa+": "+cena);
                oplacalne.write(nazwa+": "+cena+"\n");
            }
            if(cena >= 500){
                //System.out.print(nazwa+": "+cena);
                nieoplacalne.write(nazwa+": "+cena+"\n");
            }
        }
        reader.close();
        oplacalne.close();
        nieoplacalne.close();
    }
    
}
