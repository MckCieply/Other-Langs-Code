
package leapyear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year, month;
        System.out.print("Input year: ");
        year = (new Scanner(System.in)).nextInt();
        System.out.print("Input month(1-12): ");
        month = (new Scanner(System.in)).nextInt();
        if(year%400 == 0 || year % 4 == 0 && year % 100 != 0){
            if(year >= 1600){
                System.out.print("This was leap-year\n");
                if(month == 2){
                    System.out.print("Month has 29 days\n");
                }
            }
            else{
                System.out.print("Not a leap-year \n");
                if(month == 2){
                    System.out.print("Month has 28 days \n");
                }
            }
        }
        else{
            System.out.print("Not a leap-year\n");
        }
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.print("Month has 31 days\n ");
        }
        else if(month != 2){
            System.out.print("Month has 30 days ");
        }
    }
    
}
