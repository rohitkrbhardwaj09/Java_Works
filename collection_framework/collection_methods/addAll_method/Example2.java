//For NullPointerException
package collection_framework.collection_methods.addAll_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example2 {
    public static void main(String[] args) throws Exception{

        try {

            // Creating object of List<String>
            List<String> arrList = new ArrayList<String>();

            // Adding elemet to arrList
            arrList.add("A");
            arrList.add("B");
            arrList.add("C");
            arrList.add("TajMahal");

            // printing the arrList before operation
            System.out.println("Arraylist before operation: " + arrList);

            // add the specified element to specified Collections
            // using addAll() method
            System.out.println("\nTrying to add the null value with arrList");
            boolean b = Collections.addAll(null, arrList);

            System.out.println("Result: " + b);

            // printing the arrList after operation
            System.out.println("arrList after operation: " + arrList);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown: "+e);
        }
    }
}
