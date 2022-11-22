
package odbiciemacierza;
import java.util.Scanner;
import java.util.Random;
public class OdbicieMacierza {
    
    //Wypisywanie macierza
static void printTable(int size,int table[][]){
    for(int i = 0; i < size; i++){
        for(int j = 0; j < size; j++){
            System.out.format("%4d", table[i][j]);
            }
        System.out.print("\n");
        }
}
    
    
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Podaj ilosc kolumn: ");
        int size = scann.nextInt();
        int table[][] = new int[size][size];
        
        //uzupelnianie macierza
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                int rnd = rand.nextInt(10);
                table[i][j] = rnd;
            }
        }
        //wypisaywanie macierza i ew. randomwowe liczby
        printTable(size, table);
        
        int przekatna_a = 0;
        int przekatna_b = 0;
        for(int i = 0; i<size; i++){
            przekatna_a += table[i][i];
            przekatna_b += table[size-1-i][i];
        }
        System.out.println("--------------------------------------");
        System.out.println("Przekatna z lewego gornego do prawego dolnego rogu: " + przekatna_a);
        System.out.println("Przekatna z prawego gornego do lewego dolnego rogu: " + przekatna_b);
        System.out.println("--------------------------------------");
        for(int i = 0; i < size; i++){
            for(int j = i; j < size; j++){
                int temp = table[i][j];
                table[i][j] = table [j][i];
                table[j][i] = temp;
            }
        } 
        printTable(size, table);
    }
    
}
