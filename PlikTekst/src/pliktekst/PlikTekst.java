
package pliktekst;

import java.io.*;
import java.util.Scanner;

public class PlikTekst {

public static void main(String[] args) throws IOException{

    twórzPlik("file.txt");
    czytajPlik("file.txt");
}
    
public static void twórzPlik( String plik ) throws IOException{
    PrintWriter out = null;
    String l;

    System.out.println("Podaj zawartość pliku:");
    try{ 
        Scanner scann  = new Scanner( System.in );
        out = new PrintWriter(
                 new FileWriter( plik ));

        while(!(l = scann.nextLine()).equals("")){ 
            out.println(l);
            System.out.println('"'+l+'"');
        }
    }
    finally{
        if(out != null) out.close();
    }
}   

public static void czytajPlik( String plik ) throws IOException{
    BufferedReader in = null;
    String l;
    
    System.out.println("Zawartość pliku:");
    try{ 
        in = new BufferedReader( 
                new FileReader( plik ));
     
        while((l = in.readLine())!=null)
            System.out.println('"'+l+'"');
    }
    finally{
        if(in != null) in.close();  
    }
}
  
}
