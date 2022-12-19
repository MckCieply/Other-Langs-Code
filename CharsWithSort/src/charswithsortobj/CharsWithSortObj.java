package charswithsortobj;

import java.util.Scanner;
import java.io.*;

class Znak{
    
    char znak;
    int  licznik;
    
    Znak( char zn, int licz){
        znak    = zn;
        licznik = licz;
    }
}

public class CharsWithSortObj {

    public static void main(String[] args) throws IOException{
        
        Scanner input = new Scanner( System.in );
        
        Znak[] liczniki = new Znak[256];
        
        for( int i = 0; i < liczniki.length; i++ )
            liczniki[ i ] = new Znak((char)i, 0);       
        
        //System.out.print("Podaj tekst: ");
        String tekst = czytajPlik("plik.txt");                // HERE
        
        for( int i=0; i<tekst.length(); i++)
            liczniki[ tekst.charAt(i) ].licznik++;
        
        
        for( int i = 0; i < liczniki.length - 1; i++)
            for( int j = i + 1; j < liczniki.length; j++)
                if( liczniki[ i ].licznik < liczniki[ j ].licznik){
                  Znak aux1 = liczniki[ i ];
                  liczniki[ i ] = liczniki[ j ];
                  liczniki[ j ] = aux1;
                }  

        for( Znak zn: liczniki ) 
            if( zn.licznik > 0 )
               System.out.println( zn.znak + ":" + zn.licznik );
        
    }
    
    public static String czytajPlik( String plik ) throws IOException{
        BufferedReader in = null;
        String l;
        String output = "";

        try{ 
            in = new BufferedReader( new FileReader( plik ));
            
            while((l = in.readLine())!=null){
                output += l;
            }
                
            return output;
        }
        finally{
            
            if(in != null) in.close();  
        }
    }
}
