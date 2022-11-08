
package numof1;
import java.util.Scanner;

public class NumOf1 {

    public static void main(String[] args) {
        System.out.print("Wprowadz liczbe: ");
        Scanner input = new Scanner(System.in);
        
        int number, bit;
        int sum = 0;
        number = input.nextInt();
        
        for(int bitNo = 0; bitNo < 32; bitNo++){
            bit = number & (0x80000000 >>> bitNo);
            
            if(bit != 0){
                sum += 1;
                System.out.print(1);
            }
            else 
                System.out.print(0);
        }
    System.out.println("\n" + sum);
    }
    
}
