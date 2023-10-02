//Java code to illustrate boolean add() method
package collection_framework.collection_methods.add_method;

import java.util.Collection;
import java.util.LinkedList;

class LinkedListClass{
    public static void main(String[] args) {
        
        //creating an empty LinkedList
        Collection<String> list = new LinkedList<String>();

        //use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        //Output the present list
        System.out.println("The list is: "+list);

        //Adding new elements to the end
        list.add("Last");
        list.add("Element");

        //priniting the new list
        System.out.println("The new list is: "+list);
    }
}