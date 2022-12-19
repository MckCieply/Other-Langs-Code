package conversion;

import javax.swing.JOptionPane;

public class Conversion {

    public static void main(String[] args) {
        
        long number = 0, number1 = 0; 
        int radix = 0;
        long digit;
        String result = "";
        boolean right = false;
        
        do{
            try{
            number = number1 = Long.parseLong(JOptionPane.showInputDialog("Podaj liczbę:"));
            right = true;
            }
            catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"To nie jest liczba !");}
        }
        while(!right);
        
        right = false;
        
        do{
            try{
            radix = Integer.parseInt(JOptionPane.showInputDialog("Podaj podstawę systemu liczenia (2-36):"));
            right = true;
            }
            catch(NumberFormatException e ){JOptionPane.showMessageDialog(null,"To nie jest liczba !");}
        }
        while(!right || radix < 2 || radix > 36);
                
        while(number > 0){
            digit = number % radix;
            if( digit > 9 ) digit = digit - 10 + 'A';
            else digit += '0';
            result = (char)digit + result;
            number /= radix;
        }
        if(result.equals("")) result = "0"; 
        
        JOptionPane.showMessageDialog(null, String.format("Liczba %d w systemie o podstawie %d to: \n%s", number1, radix, result));
    }   
}
