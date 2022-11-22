
package strings;
import java.util.Scanner;
public class Strings {

    public static void main(String[] args) {
        Scanner scann = new Scanner (System.in);
        System.out.println("Podaj dlugosc tablicy: ");
        int size = scann.nextInt();
        String table[] = new String[size];
        String empty = scann.nextLine();
        for(int i = 0; i < size; i++){
            System.out.print("Podaj stringa: ");
            table[i] = scann.nextLine();
        }
        //Sortowanie leksorgaficzne
        for(int i = 0; i < size - 1; i++){
            for(int j=i+1; j <size; j++){
                if (table[i].compareTo(table[j]) > 0){
                    String temp = table[i];
                    table[i] = table[j];
                    table[j] = temp;
                }             
            }
        }
        
        for (int i = 0; i < size ; i++){
            System.out.print(table[i]+" ");
        }
    System.out.print("\n---------------------------------\n");
        //Sortowanie po dlugosci
        for(int i = 0; i < size - 1; i++){
            for(int j=i+1; j <size; j++){
                if (table[i].length() > table[j].length()){
                    String temp = table[i];
                    table[i] = table[j];
                    table[j] = temp;
                }
            }
        }
        for (int i = 0; i < size ; i++){
            System.out.print(table[i]+" ");
        }
    }
}


