//Java program to demonstrate
//max() method for NoSuchElementException
package collection_framework.collection_methods.max_method;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Example3_NoSuchElementException {
    
    public static void main(String[] args) throws Exception{
        try {
            
            //Creating object of LinkedList
            List<Integer> list = new LinkedList<Integer>();

            //printing the max value
            //using the max() method
            System.out.println("Trying to get the max from empty list ");
            System.out.println("Max value is: "+Collections.max(list));

            //printing the max value using max() method
            System.out.println("Max value is: "+ Collections.max(list));
        } catch (ClassCastException e) {
            System.out.println("Exception thrown: "+e);
        }
        catch (NoSuchElementException e) {
            System.out.println("Exception thrown: "+e);
        }
    }
}

//output: 
/*Trying to get the max from empty list 
Exception thrown: java.util.NoSuchElementException */