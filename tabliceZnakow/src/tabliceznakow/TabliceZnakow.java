//Posortować całość
package tabliceznakow;
import java.lang.Math;

public class TabliceZnakow {
    public static void main(String[] args) {
        char[] tablicaZnakow = {
        '0','1','2','3','4','5','6','7','8','9',
        'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
        };
        
    int[] counters = new int[128];
    for(int i = 0; i < counters.length; i++){
        counters[i] = 0;
    }
    char[] chars = new char[20]; //Rozmiar generowanej tablicy
    
    for(int i=0; i<chars.length; i++){
        chars[i] = tablicaZnakow[(char)(Math.random()*62)];
        
        counters[chars[i]] += 1;
    }
    for(int i=0; i < counters.length; i++){
        if (counters[i] > 0){   
            System.out.println((char)i +": " + counters[i]);
        }
    }
    }
    
}
