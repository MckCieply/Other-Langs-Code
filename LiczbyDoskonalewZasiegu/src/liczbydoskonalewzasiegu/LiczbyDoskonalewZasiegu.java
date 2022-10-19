
package liczbydoskonalewzasiegu;

import java.util.Scanner;

public class LiczbyDoskonalewZasiegu {


    public static void main(String[] args) {
        int i, input, suma, j;
        suma = 0;
        System.out.print("Podaj zasieg: "); input = (new Scanner(System.in)).nextInt();
        for (i=1; i < input; i++){
            suma = 0;
            for (j=1; j <= i/2; j++){
                if(i % j == 0)
                    suma = suma + j;
            }
            if (suma == i)
                System.out.println(i);
            
        }
    }
    
}
