//Java code to illustate boolean contains() method using ArrayList() NullPointerException
package collection_framework.collection_methods.contains_method;

import java.util.ArrayList;
import java.util.Collection;

public class Example4 {
    public static void main(String[] args) {
        // creating an empty array list of String type
        Collection<String> list = new ArrayList<String>();

        // printing and displaying the array list
        System.out.println("The ArrayList is: " + list);

        // Note: Here by now we have not to added any element's

        // try block to check for exception
        try {
            list.contains(null);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
