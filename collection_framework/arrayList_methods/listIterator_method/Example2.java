// Java program to demonstrate
// listIterator() method
// for String value

// listIterator(int index)
package collection_framework.arrayList_methods.listIterator_method;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example2 {
    public static void main(String[] argv) throws Exception {
        try {

            // Creating object of ArrayList<Integer>
            ArrayList<String> arrlist = new ArrayList<String>();

            // adding element to arrlist
            arrlist.add("A");
            arrlist.add("B");
            arrlist.add("C");
            arrlist.add("D");

            // print arrlist
            System.out.println("ArrayList: "
                    + arrlist);

            // getting iterated value starting from index 2
            // using listIterator() method
            ListIterator<String> iterator = arrlist.listIterator(2);

            // Printing the iterated value
            System.out.println("\nUsing ListIterator"
                    + " from Index 2:\n");
            while (iterator.hasNext()) {
                System.out.println("Value is : "
                        + iterator.next());
            }
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
