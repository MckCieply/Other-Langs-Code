package splittingspring2;
import java.util.Scanner;
public class Splittingspring2 {
    static void printArr(String tab[], String tekst){
        System.out.println(tekst);
        for( String word: tab){
            System.out.println("\"" + word + "\"");
        }
    }
    
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String line = scann.nextLine().trim();
        
        String tab[] = line.split(" +");
        
        printArr(tab, "Tablica nieposortowana");
        
        for(int i = 0; i < tab.length - 1; i++){
            for(int j =i+1; j < tab.length; j++){
                if (tab[j].compareTo(tab[i]) < 0){
                    String temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        printArr(tab, "Tablica posortowana leksykograficznie");
        
        for(int i = 0; i < tab.length - 1; i++){
            for(int j = 0; j < tab.length - 1; j++){
                if (tab[j].length() > tab[j+1].length()){
                    String temp = tab[j+1];
                    tab[j+1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        printArr(tab, "Tablica posortowana dlugosci i leksykograficznie");
    }
    
        
}
    

