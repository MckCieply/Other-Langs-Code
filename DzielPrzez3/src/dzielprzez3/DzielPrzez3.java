
package dzielprzez3;

import java.util.Scanner;
/**
 *
 * @author Student
 */
public class DzielPrzez3 {

    public static void main(String[] args) {
        int liczba, sumCyfr;
        System.out.print("Podaj liczbe: "); liczba = (new Scanner(System.in)).nextInt();
        System.out.println(liczba);
        do
	{
            sumCyfr = 0;
            while (liczba != 0)
            {
                sumCyfr = sumCyfr + liczba % 10;
                liczba = liczba / 10;
            }
            liczba = sumCyfr;
            System.out.println(liczba);
        } while (! (liczba < 10));
        switch(liczba){
	case 0:
            System.out.println("Podzielna");
            break;
	case 3:
            System.out.println("Podzielna");
            break;
	case 6:
            System.out.println("Podzielna");
            break;
	case 9:
            System.out.println("Podzielna");
            break;
	default:
            System.out.println("Niepodzielna");
            }     
    }
    
}
