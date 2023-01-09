
package txtzamowienie;

import java.io.*;

public class TXTzamowienie {

    public static void main(String[] args) throws IOException {
        float cenaCalkowita = 0;
        String listaProduktow = "";
        String file ="zamowienie.txt";
        BufferedReader in = null;
        String row;
        try{
            in = new BufferedReader(new FileReader(file));
            
            while((row = in.readLine())!= null){
                String elements[] = row.split(",");
                String produkt = elements[0];
                int ilosc = Integer.parseInt(elements[1]);
                float cena = Float.parseFloat(elements[2]);
                cenaCalkowita += cena * ilosc;
                listaProduktow += (produkt + " ");
            }
            System.out.print("Twoja lista zakupow zawiera: \n");
            System.out.print(listaProduktow);
            System.out.printf("\n%.2f zl \n", cenaCalkowita);
        } 
        finally{
            if(in != null) 
                in.close();
        }
    }
}
