
package rafhomework;

import java.io.*;

public class RAFHomework {

    public static void main(String[] args) throws IOException{
    RandomAccessFile raf = new RandomAccessFile("dane.txt","r");
    char sign;
    
    for (int i=0; i<raf.length();i++){
        raf.seek(i);
        sign = (char) raf.read();
        System.out.print(sign);
    }
    raf.close();
    }
    
}
