
package liczbydoskonalewzasiegu;

import java.util.Scanner;

public class LiczbyDoskonalewZasiegu {


    public static void main(String[] args) {
        int liczba, zasieg, suma, dzielnik;
        suma = 0;
        System.out.print("Podaj zasieg: "); zasieg = (new Scanner(System.in)).nextInt();
        for (liczba = 1; liczba < zasieg; liczba++){
            suma = 0;
            for (dzielnik=1; dzielnik <= liczba/2; dzielnik++){
                if(liczba % dzielnik == 0)
                    suma = suma + dzielnik;
            }
            if (suma == liczba)
                System.out.println(liczba);
            
        }
    }
    
}
