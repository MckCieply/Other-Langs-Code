
package menu1;
import java.util.Scanner;
public class Menu1 {
    
    static void menu(){
        Scanner scann = new Scanner(System.in);
        System.out.print("Wybierz 0-4: ");
        int nr = scann.nextInt();
        if (nr == 1){
            System.out.println("WYBRANO 1");
        }
        else if (nr == 2){
            System.out.println("WYBRANO 2");
        }
        else if (nr == 3){
            System.out.println("WYBRANO 3");
        }     
        else if (nr == 4){
        System.out.println("WYBRANO 4");
        }
        else if(nr == 0){
            System.out.println("WYBRANO 0 \n KONIEC");        
        }
        else{
            menu();
        }
    }
    public static void main(String[] args) {
    System.out.println("1. Pozycja 1 \n2. Pozycja 2 \n3. Pozycja 3\n4. Pozycja 4\n0. Pozycja 0");
    menu();
    }
    
}
