//Java program to demonstrate max() method for ClassCastException
package collection_framework.collection_methods.max_method_withParameters;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Example2_ClassCastException {
     public static void main(String[] args) throws Exception{
        try {
            
            //Creating object of LinkedList
            List<String> list = new LinkedList<String>();

            //creating varibale for object type
            Object i = Integer.valueOf(42);

            //adding element to list
            list.add("Hello");
            list.add((String)i);

            //printing the max value using max() method
            System.out.println("Max value is: "+ Collections.max(list, Collections.reverseOrder()));
        } catch (ClassCastException e) {
            System.out.println("Exception thrown: "+e);
        }
        catch (NoSuchElementException e) {
            System.out.println("Exception thrown: "+e);
        }
    }
}
