
package tablice;
import java.util.Scanner;
public class Tablice {


    public static void main(String[] args) {
        // Size tablicy
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadz rozmiar tablicy: ");
        int size = input.nextInt();
        // Maks i min generowane liczby
        System.out.print("Wprowadz max jaka liczbe wygenerowac: ");
        int max = input.nextInt();
        System.out.print("Wprowadz min jaka liczbe wygenerowac: ");
        int min = input.nextInt();
        int[] table = new int[size];
        
        for (int i = 0; i < table.length; i++){
            table[i] = (int)(Math.random() * (max - min + 1) + min) ;
        }
        System.out.println("Lista przed odwroceniem: ");
        for (int i = 0; i < table.length; i++){
            System.out.print(table[i]+", ");
        }
        System.out.println("\nLista po odwroceniu: ");
        
        for (int i = table.length - 1; i >= 0; i--){
           System.out.print(table[i]+", ");
       }
        
        int temp;
        boolean repeat = false;
        for (int i = 0; i < table.length - 1; i++){
            for (int j = i + 1; j < table.length; j++){
                if (table[i] > table[j]){
                    temp = table[i];
                    table[i] = table[j];
                    table[j] = temp; 
                }
                if (table[i] == table[j]){
                    repeat = true;
                }
            }
        }
        double mediana;
        System.out.println("\nLista po posortowaniu: ");
        for (int i = 0; i < table.length; i++){
            System.out.print(table[i]+", ");
        }
        if(table.length % 2 != 0){
            System.out.println("\nMediana zbioru \n" + table[table.length/2]);
        }
        else{
            mediana = (table[table.length/2] + table[table.length/2 - 1])/2.0 ;
            System.out.println("\nMediana zbioru \n" + mediana);
        }
        if (repeat == true){
            System.out.println("\nSa dane powtarzajace sie");
        }
            
    }
}
