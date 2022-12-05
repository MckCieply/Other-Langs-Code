
package stringread;
import java.util.Scanner;
public class StringRead {

    public static void main(String[] args) {
        Scanner scann = new Scanner( System.in );

        String text = scann.nextLine();
        //counters innit
        int[] counters = new int[ 128 ];
        for( int nr = 0; nr < counters.length; nr++) counters[ nr ] = 0;
        
        int len = text.length();
        // +1 for all instances of letter
        for (int i=0; i<len; i++){
            counters[text.charAt(i)] += 1;
        }
        // Write out
        for( int i = 0; i < counters.length; i++ )
               if( counters[ i ] > 0 )
                  System.out.println((char)i + ": " + counters[i] + " " );
    } 
}
