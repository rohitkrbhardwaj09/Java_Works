//java program to demonstrate fileInputStream example using try catch
package java_io.file_input_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        StringBuffer content = null;
        FileInputStream fis = null;

        int ch;

        try {
            content = new StringBuffer();
            fis = new FileInputStream("C://Data//data.txt");

            while((ch = fis.read())!=-1){
                content.append((char)ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception thrown: "+e);
        } catch (IOException e){
            System.out.println("Exception thrown: "+e);
        }finally{
            try {
                System.out.println(content);
                fis.close();
            } catch (IOException e) {
                System.out.println("Exception thrown: "+e);
            }
        }
    }
}
