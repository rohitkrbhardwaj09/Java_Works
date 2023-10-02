package collection_framework.collection_methods.isEmpty_method;

import java.util.Collection;
import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        // creating an empty linked list
        Collection<String> list = new LinkedList<String>();

        // use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        // output the present list
        System.out.println("The list is: " + list);

        // clearing the linked list
        list.clear();

        // printing the new list
        System.out.println("The new list is: " + list);

        //check if list is empty
        //using isEmpty() method
        System.out.println("Is the LinkedList empty: "+ list.isEmpty());
    }
}
