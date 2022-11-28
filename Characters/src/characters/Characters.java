package characters;
import static java.lang.Thread.sleep;
public class Characters {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i<31; i++){
            System.out.print( i + " --> " + ((char)i) + "\t");
            sleep(1000);
        }
    }
    
}
