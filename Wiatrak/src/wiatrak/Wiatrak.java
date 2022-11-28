
package wiatrak;
import static java.lang.Thread.sleep;


public class Wiatrak {

    public static void main(String[] args) throws Exception{
        for(int i=0; i<500; i++){
            System.out.print((char)13 + "-" );
            sleep(200);
            System.out.print((char)13 + "/" );
            sleep(200);
            System.out.print((char)13 + "|" );
            sleep(200);
            System.out.print((char)13 + "\\" );
            sleep(200);
        }
    }
    
}
