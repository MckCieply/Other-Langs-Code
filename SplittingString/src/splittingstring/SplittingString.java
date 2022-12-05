
package splittingstring;
import java.util.Scanner;

public class SplittingString {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String text = scann.nextLine();
        char spacja = ' ';
        text = text.trim();
        
        for(int i = 0; i + 1 <= text.length() ; i++){
            char temp = text.charAt(i);
            if(temp == spacja ){
                String wynik = text.substring(0, i);
                text = text.substring(i);
                text = text.trim();
                System.out.println("\""+ wynik + "\"");
                i = 0;
            }
            if(i + 1 == text.length()){
                System.out.println("\""+ text + "\"");
            }
        }
    }
    
}
