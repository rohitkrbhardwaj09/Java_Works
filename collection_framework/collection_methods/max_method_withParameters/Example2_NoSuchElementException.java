//Java program to demonstrate
//max() method for NoSuchElementException
package collection_framework.collection_methods.max_method_withParameters;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Example2_NoSuchElementException {
        public static void main(String[] args) throws Exception{
        try {
            
            //Creating object of LinkedList
            List<Integer> list = new LinkedList<Integer>();

            //printing the max value
            //using the max() method
            System.out.println("Trying to get the max from empty list ");

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
