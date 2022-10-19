/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package liczbydoskonale;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class LiczbyDoskonale {

    public static void main(String[] args) {
        int liczba, suma, i;
        i = 0;
        suma = 0;
        System.out.print("Podaj liczbe: "); liczba = (new Scanner(System.in)).nextInt();
        while (i <= liczba/2){
            if(i != 0 && liczba % i == 0)
                suma = suma + i;
            
            i = i+1;
        }
        if(suma == liczba)
            System.out.println("Liczba "+liczba+" jest doskonala");
        else System.out.println("Liczba "+liczba+" Nie jest doskonala");
    }
    
}
