/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package liczbydoskonalewzasiegu;

import java.util.Scanner;

/**
 *
 * @author Student
 */
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

        /*int liczba, suma, i;
        i = 0;
        suma = 0;
        System.out.print("Podaj liczbe: "); liczba = (new Scanner(System.in)).nextInt();
        while (i <= liczba/2){
            if(i != 0 && liczba % i == 0)
                suma = suma + i;
            
            i = i+1;
        }
        if(suma == liczba)
            System.out.println("Jest doskonala");
        else System.out.println("Nie jest doskonala");*/
    }
    
}
