package java_io.buffer_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C://Data//welcome.txt");
        BufferedReader br = new BufferedReader(fr);

        String s1 = br.readLine();

        while (s1 != null) {
            System.out.println(s1);
            s1 = br.readLine();
        }
        br.close();
        fr.close();
    }
}
