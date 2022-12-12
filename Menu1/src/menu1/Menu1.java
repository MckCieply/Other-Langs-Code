
package menu1;
import java.util.Arrays;
import java.util.Scanner;
public class Menu1 {
    static String[] tworzTab(){
        System.out.println("Podaj tekst: ");
        return new Scanner(System.in).nextLine().split(" +");

    }
    static void piszTab(String arr[]){
        System.out.println("Tablica");
            for(String str: arr)
                System.out.println(str + " ");
    }
    
    static void menu(String tab[]){
        Scanner scann = new Scanner(System.in);
        
        System.out.print("Wybierz 0-4: ");
        int nr = scann.nextInt();
        if (nr == 1){
            System.out.println("WYBRANO 1");
            tab = tworzTab();
            menu(tab);
        }
        else if (nr == 2){
            System.out.println("WYBRANO 2");
            piszTab(tab);
            menu(tab);
        }
        else if (nr == 3){
            System.out.println("WYBRANO 3");
            Arrays.sort(tab);
            menu(tab);
        }     
        else if (nr == 4){
            System.out.println("WYBRANO 4");
            menu(tab);
        }
        else if(nr == 0){
            System.out.println("WYBRANO 0 \n KONIEC");
        }
        else{
            menu(tab);
        }
    }
    public static void main(String[] args) {
    System.out.println("MENU\n-------------------------------\n1. Pozycja 1 \n2. Pozycja 2 \n3. Pozycja 3\n4. Pozycja 4\n0. Pozycja 0");
    String tab[] = null;
    menu(tab);
    }
    
}
