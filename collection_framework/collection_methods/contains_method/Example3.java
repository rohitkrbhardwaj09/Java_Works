//Java code to illustate boolean contains() method using ArrayList()
package collection_framework.collection_methods.contains_method;

import java.util.ArrayList;
import java.util.Collection;

public class Example3 {
    public static void main(String[] args) {
        // create an empty array list with an initial capacity
        Collection<Integer> arr_list = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arr_list.add(15);
        arr_list.add(20);
        arr_list.add(25);

        // printing in array
        System.out.println(arr_list);

                // checking the presence of geeks
        // using contains() method
        boolean result = arr_list.contains(20);

        // printing the result
        System.out.println("Is Geeks present in the list: " + result);

    }
}
