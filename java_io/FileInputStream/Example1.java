package java_io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        
        StringBuffer content = new StringBuffer();
        FileInputStream fis = new FileInputStream("C://Data//data.txt");

        int ch;

        while((ch = fis.read()) != -1){
            content.append((char) ch);
        }

        System.out.println(content);
        fis.close();
    }
}
