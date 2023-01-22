
package rafhomework;

import java.io.*;
import java.math.BigDecimal;

public class RAFHomework {

    public static void main(String[] args) throws IOException{
    RandomAccessFile raf = new RandomAccessFile("dane.txt","r");
    String[] elements;
    raf.seek(0);
    while(true){
        try{
            String line = raf.readLine();
            elements = line.split(" +");
            //for(String element: elements)
            //    System.out.println(element);
            String imie = elements[0];
            String nazwisko = elements[1];
            char litera = nazwisko.charAt(0);
            if(!(litera >= 65 && litera<= 90)){
                nazwisko = nazwisko.replace(nazwisko.charAt(0), (char)(litera-32));
            }
            double koszt = Double.parseDouble(elements[elements.length-1]);
            koszt *= 1.25;
            int rok = Integer.parseInt(elements[elements.length-2]);
            String nazwa = "";
            for(int i=2; i<elements.length-2; i++){
                elements[i].strip();
                nazwa += (elements[i]+ " ");
            }
            System.out.print(imie +" "+ nazwisko+": "+nazwa+" "+koszt+" "+rok+"\n" );
            
        }
        catch(EOFException | NullPointerException e){
            break;
        }
    }
    raf.close();
    }
    
}
