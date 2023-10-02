// Program Demonstrate retainAll() method With
// Collection different than ArrayList as a parameter of the method
package collection_framework.arrayList_methods.retainAll_method;

import java.util.ArrayList;
import java.util.HashSet;

public class Example2 {
    public static void main(String[] args) {

        // Creating an empty array list
        HashSet<String> bags = new HashSet<String>();

        // Add values in the bags Set.
        bags.add("pen");
        bags.add("ink");
        bags.add("paper");

        // Creating another empty array list
        ArrayList<String> boxes = new ArrayList<String>();

        // Add values in the boxes list.
        boxes.add("pen");
        boxes.add("paper");
        boxes.add("books");
        boxes.add("rubber");
        boxes.add("ink");

        // Before Applying method print both list and set.
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);

        // Apply retainAll() method to boxes passing bags as parameter
        boxes.retainAll(bags);

        // Displaying both the lists after operation
        System.out.println("\nAfter Applying retainAll()" +
                " method to Boxes\n");
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);
    }
}
