
package stringsindexing;
import java.util.Scanner;
public class StringsIndexing {
    public static void main(String[] args) {
        Scanner scann = new Scanner( System.in );

        int[] counters = new int[ 128 ];
        for( int nr = 0; nr < counters.length; nr++) counters[ nr ] = 0;
        
        System.out.print("Podaj tekst: "); 
        String base = scann.nextLine();
        
        boolean error = false;
        for(int i = 0; i < base.length();i++){
            char chr = base.charAt(i);
            if( chr >= '0' && chr <= '9' || chr >= 'A' && chr <= 'Z' || chr >= 'a' && chr <= 'z' || chr == ' '){
                counters[chr]+=1;
            }
            else{
                error = true;
                break;
            }
        }
        if(error == true){
            System.out.println("Somethings wrong");
        }
        else{
            for(int i = 0; i < counters.length; i++){
                   if( counters[i] > 0 ){
                      System.out.println((char)i + ": " + counters[ i ] + " " );
                   }
            }
        }
    }
    
}

