// Java Program to Demonstrate Error Generated
// while using get() method in ArrayList
package collection_framework.arrayList_methods.get_method;

import java.util.ArrayList;

public class Example2 {
    // Main driver method
    public static void main(String[] args) {
        // Creating an Empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(4);

        // Using add() method to insert elements
        // and adding custom values
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        // Getting element at index 2
        int element = arr.get(5);

        // Print all the elements of ArrayList
        System.out.println("the element at index 2 is "
                + element);
    }
}
