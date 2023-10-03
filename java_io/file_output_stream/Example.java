package java_io.file_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C://Data//welcome.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee id: ");
        int id = sc.nextInt();

        String s2 = "Welcome "+ name + ", " + "Your empoyee id is: "+id;

        bos.write(s2.getBytes());
        
        bos.flush();
        fos.close();
        bos.close();
        sc.close();

        System.out.println("Successfully done");
    }
}
