//Java program to remove a specific element from a Collection
package collection_framework.collection_methods.remove_method;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        
        //Creating a array list
        List<Integer> list = new ArrayList<Integer>();

        //Inserting % elements to it
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1);
        list.add(2);

        // if element set is larger use
        //ieration in loops to insert element

        //Display arraylist after iteration
        System.out.println("Original ArrayList: "+ list);

        
    }
}
