
package sortowanie;
import java.util.Scanner;

public class Sortowanie {

    public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadz a: ");
        int a = input.nextInt();
        System.out.print("Wprowadz b: ");
        int b = input.nextInt();
        System.out.print("Wprowadz c: ");
        int c = input.nextInt();
        System.out.print("Wprowadz d: ");
        int d = input.nextInt();
        System.out.print("Wprowadz e: ");
        int e = input.nextInt();
      
        for(int i = 0; i < 5; i++){
            if (b < a){
                temp = a;
                a = b;
                b = temp;
            }
            if (c < b){
                temp = b;
                b = c;
                c = temp;
            }
            if (d < c){
                temp = c;
                c = d;
                d = temp;       
            }
            if (e < d){
                temp = d;
                d = e;
                e = temp;
            }
        }
    System.out.print(a + " " + b + " " + c + " " + d +" " + e);
    }
}
