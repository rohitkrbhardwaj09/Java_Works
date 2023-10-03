package java_io.buffered_input_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Data\\data.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] b1 = new byte[1024];
        String s1 = null;
        int byteRead;
        while((byteRead = bis.read(b1)) != -1 ){
            s1 = new String(b1, 0, byteRead);
            System.out.print(s1);
        }
        
        fis.close();
        bis.close();
    }
}
