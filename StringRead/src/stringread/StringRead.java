
package stringread;
import java.util.Scanner;
import java.util.Random;
public class StringRead {

    public static void main(String[] args) {
        Scanner scann = new Scanner( System.in );

        char[] tabChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' ,'I', 'J', 'K', 'L', 'M', 
                            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
 
        String text = scann.nextLine();
        //counters innit
        int[] counters = new int[ 128 ];
        for( int nr = 0; nr < counters.length; nr++) counters[ nr ] = 0;
        
        int len = text.length();
        
        for (int i=0; i<len; i++){
            counters[text.charAt(i)] += 1;
        }
        // Write out
        for( int i = 0; i < counters.length; i++ )
               if( counters[ i ] > 0 )
                  System.out.println((char)i + ": " + counters[i] + " " );
    } 
}
