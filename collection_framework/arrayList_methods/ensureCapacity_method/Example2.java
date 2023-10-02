// Java program to demonstrate
// ensureCapacity() method for String value
package collection_framework.arrayList_methods.ensureCapacity_method;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] argv)
            throws Exception {

        try {

            // Creating object of ArrayList<Integer>
            ArrayList<String> arrlist = new ArrayList<String>();

            // adding element to arrlist
            arrlist.add("A");
            arrlist.add("B");
            arrlist.add("C");
            arrlist.add("D");

            // Print the ArrayList
            System.out.println("ArrayList: "
                    + arrlist);

            // ensure that the ArrayList
            // can hold upto 400 elements
            // using ensureCapacity() method
            arrlist.ensureCapacity(400);

            // Print
            System.out.println("ArrayList can now"
                    + " surely store upto"
                    + " 400 elements.");
        }

        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
