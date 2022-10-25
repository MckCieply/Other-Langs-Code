
package jakitrojkat;

import java.util.Scanner;

public class JakiTrojkat {
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Podaj a: ");
        a = (new Scanner(System.in)).nextInt();
        System.out.print("Podaj b: ");
        b = (new Scanner(System.in)).nextInt();
        System.out.print("Podaj c: ");
        c = (new Scanner(System.in)).nextInt();
        
        if(a+b>= c || a+c >= b || c+b>a ){                                      //Czy to trójkąt
            if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + b*b == a*a){       //Czy jest prostokatny
                System.out.print("Trojkat jest prostokatny \n");
            }
        
            if(a==b || b==c || c==a){                                           //Czy jest rownoramienny
                System.out.print("Trojkat jest rownoramienny");
                if(a==b && b==c){                                               //Czy jest rownoramienny i rownoboczny
                    System.out.print(" i trojkat jest rownoboczny \n");
                }
                else{
                    System.out.print("\n");
                }
            }
        }
        else{
             System.out.print("Nawet nie trojkat  \n");
        }
    }
    
}
