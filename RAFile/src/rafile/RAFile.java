
package rafile;

import java.io.*;

public class RAFile {

    public static void main(String[] args) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("data.txt", "rw");
        int counter = 1;
        for(float i=0; i<=10;i+=0.5){
            if(counter == 2){
                raf.writeFloat(i/2);
                System.out.print((i/2)+ " "); 
                counter = 1;
            }
            else{
                raf.writeFloat(i);
                System.out.print("("+i+ ") ");
                counter +=1;
            }
        }
        raf.close();
    }
    
}
