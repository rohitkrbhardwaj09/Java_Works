//Java code to illustate boolean contains() method using LinkedList()
package collection_framework.collection_methods.contains_method;

import java.util.Collection;
import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        
        //creating an empty linkedList
        Collection<String> list = new LinkedList<String>();

        //use add() method to add element in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        //Output the present list
        System.out.println("The list is: "+list);

        //checking the presence of geeks
        //using contains() method
        boolean result = list.contains("Geeks");

        //printing the result
        System.out.println("Is Geeks present in the list: "+result);

    }

}
