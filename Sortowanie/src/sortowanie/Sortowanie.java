
package sortowanie;
import java.util.Scanner;

public class Sortowanie {

    public static void main(String[] args) {
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
        int s_a, s_b, s_c, s_d, s_e;
        
        for(int i = 0; i < 5; i++){
            if (b < a){
                s_a = b;
                s_b = a;
            }
            else{
                s_a = a;
                s_b = b;
            }
            if (c < b){
                s_c = b;
                s_b = c;
            }
            else{
                s_c = c;
                s_b = b;
            }

            if (d < c){
                s_d = c;
                s_c = d;       
            }
            else{
                s_d = d;
                s_c = c;
            }
            if (e < d){
                s_e = d;
                s_d = e;
            }
            else{
                s_d = d;
                s_e = e;
            }
        }
    System.out.print(s_a);
    System.out.print(s_b);
    System.out.print(s_c);
    System.out.print(s_d);
    System.out.print(s_e);
    }
}
