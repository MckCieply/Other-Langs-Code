
package datafile;
import java.io.*;
public class DataFile {

    public static void main(String[] args) throws IOException {
    BufferedReader reader = null;
    String l;
    String plikWe    = "PlikWe.txt";
    String plikBin   = "PlikWy.bin";
    String plikWyTxt = "PlikWy.txt";

    DataOutputStream outBin = null; 
    String towar;
    double cena;
    int    lSztuk;
    double suma, koszt;

    try{ 
        reader = new BufferedReader( 
                   new FileReader( plikWe ));

        outBin = new DataOutputStream(
                   new BufferedOutputStream(
                     new FileOutputStream( plikBin )));
    
        while((l = reader.readLine())!=null){
            outBin.writeUTF( l );
            outBin.writeInt( Integer.parseInt(reader.readLine()));
            outBin.writeDouble( Double.parseDouble(reader.readLine()));
        }
    }
    finally{
        if(reader  != null) reader.close();  
        if(outBin != null) outBin.close();  
    }
    PrintWriter     writer = null;
    DataInputStream inBin  = null;

    suma = 0;
    try{
        inBin = new DataInputStream(
                    new BufferedInputStream(
                        new FileInputStream( plikBin )));   
        
        writer = new PrintWriter(
                  new FileWriter( plikWyTxt ));

        while (true){
            towar  = inBin.readUTF();
            lSztuk = inBin.readInt();
            cena   = inBin.readDouble(); // uwaga na kolejność danych
            koszt = lSztuk * cena;
            writer.println("Zamówiłeś " + lSztuk + " sztuk produktu " + towar + " po " + cena 
                             + " co daje " + koszt );
            suma += koszt;
        }
    }
    catch (EOFException e){ // koniec pliku
        if( inBin  != null) inBin.close();
        if( writer != null) writer.close();
        System.out.println("Zapłaciłeś " + suma);
    }   
    }
    
}
