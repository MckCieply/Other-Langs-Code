/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sigma;
import java.util.Scanner;
public class Sigma {
    public static void main(String[] args) {
        int n;
        double a, x, p;
        System.out.print("Podaj x: "); x = (new Scanner(System.in)).nextDouble();
        System.out.print("Podaj n: "); n = (new Scanner(System.in)).nextInt();
        p = 0;
        for(n = n; n > 0; n--){
            System.out.print("Podaj a: "); a = (new Scanner(System.in)).nextDouble();
            p = (p+a)*x;
        }
        System.out.print("Podaj ostatnie a: "); a = (new Scanner(System.in)).nextDouble();
        p = p + a;
        System.out.print("Wynik to: "+p+"\n");
    }
    
}
