//Java Program to demonstrate max() method for Integer value
package collection_framework.collection_methods.max_method_withParameters;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Example1 {
    public static void main(String[] args) throws Exception {
        try {
            // Creating object of LinkedList
            List<Integer> list = new LinkedList<>();

            // adding element to list
            list.add(-1);
            list.add(4);
            list.add(-5);
            list.add(1);

            // printing the max value
            // using max() method
            System.out.println("Max value is: " + Collections.max(list, Collections.reverseOrder()));

        } catch (ClassCastException e) {
            System.out.println("Exception thrown: " + e);
        } catch (NoSuchElementException e) {
            System.out.println("Exception thrown: " + e);
        }

    }
}
