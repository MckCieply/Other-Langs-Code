package szyfrcezara;
import java.util.Scanner;
public class SzyfrCezara {
public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);
    char[] tablicaZnakow = {
        '0','1','2','3','4','5','6','7','8','9',
        'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ',
        };
    int size = tablicaZnakow.length;
    String wynik = "";
    System.out.println("Podaj tekst: ");
    String input = scann.nextLine();
    System.out.println("Podaj przesuniecie: ");
    int przesuniecie = scann.nextInt();
    for(int i = 0; i < input.length(); i++){
        //ity element ciagu
        //sprawdzenie indexu
        char znak = input.charAt(i);
        for(int j = 0; j<size; j++){
            if ( (char)znak == tablicaZnakow[j]){
                int index = j + przesuniecie;
                index = index%size;
                char chr = tablicaZnakow[index];
                wynik += chr;
            }
        }
    }
    System.out.println(wynik);
    
    
    }   
}
