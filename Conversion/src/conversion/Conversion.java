
package conversion;
import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);
    String wynik = "";
    
    System.out.print("Podaj liczbe: ");
    int num = scann.nextInt();
    System.out.println("Podaj podstawe liczenia (2-36)");   
    int podstawa = scann.nextInt();
    
    while (num > 0){
        int reszta = num % podstawa;
        if (reszta > 9){
            reszta = reszta - 10 + 'A';
        }
        else{
            reszta += '0';
        }
        wynik = (char)reszta + wynik;
        num /= podstawa;
    }
    System.out.println(wynik);
    }
    
}
