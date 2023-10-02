//Java code to illustate boolean contains() method using ArrayDeque()
package collection_framework.collection_methods.contains_method;

import java.util.ArrayDeque;
import java.util.Collection;

public class Example2 {
    public static void main(String[] args) {
        // Creating an empty array deque
        Collection<String> arr_deque = new ArrayDeque<String>();

        // use add() method to add elements into deque
        arr_deque.add("Welcome");
        arr_deque.add("to");
        arr_deque.add("Geeks");
        arr_deque.add("for");
        arr_deque.add("Geeks");

        // Displaying te ArrayDeque
        System.out.println("ArrayDeque: " + arr_deque);

        // checking the presence of geeks
        // using contains() method
        boolean result = arr_deque.contains("Geeks");

        // printing the result
        System.out.println("Is Geeks present in the list: " + result);

    }
}
