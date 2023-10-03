package java_io.file_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example2 {
   public static void main(String[] args) {
     FileOutputStream fileOutput = null;
    BufferedOutputStream bufferOutput = null;

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter employee id: ");
    int empId = sc.nextInt();
    System.out.print("Enter employee name: ");
    String empName = sc.next();

    String finalValue = "Welcome "+empName+", Your employee id is: "+empId;

    sc.close();
    try {
        fileOutput = new FileOutputStream("C://Data//welcome.txt");
        bufferOutput = new BufferedOutputStream(fileOutput);
        bufferOutput.write(finalValue.getBytes());
        System.out.println("Data is written into the file");
    } catch (Exception e) {
        System.out.println("IOException thrown: "+e);
        
    }finally{
        try {
            bufferOutput.flush();
            bufferOutput.close();
            fileOutput.close();
        } catch (IOException e) {
            System.out.println("IOException thrown: "+e);
        }
    }
    }
}
