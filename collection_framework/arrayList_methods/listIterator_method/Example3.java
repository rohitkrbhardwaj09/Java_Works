// Java program to demonstrate
// listIterator() method
// for IndexOutOfBoundsException
package collection_framework.arrayList_methods.listIterator_method;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example3 {
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
            System.out.println("Size of ArrayList: "
                    + arrlist.size());

            // Get ListIterator from index 7
            // using listIterator() method
            System.out.println("Trying to getListIterator"
                    + " from index 7\n");
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
