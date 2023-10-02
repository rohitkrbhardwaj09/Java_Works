/*
 * ListIterator
 * 
 * It is only aplicable for List collection implemented class like ArrayList, LinkedList, etc.
 * It provides bi-directional iteration.
 */
package collection_framework.collection_methods.listIterator_method;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example1 {
    public static void main(String[] args) {
        
        //Creating an object of ArrayList Class
        ArrayList<Integer> arr_list = new ArrayList<Integer>();

        //Itrating over ArrayList Object
        for (int i = 0; i < 10; i++) {
            
            //adding elements to the arrayList object
            arr_list.add(i);
        
        }

        //print and display all elements inside object
        System.out.println(arr_list);

        ListIterator itr = arr_list.listIterator();

        //checking the next element availability
        while(itr.hasNext()){

            //moving cursor to next element
            int i = (Integer)itr.next();

            //getting all elements one by one
            System.out.print(i+", ");

            //changing even numbers to odd and
            //ading modified number again in
            //iterator
            if(i%2==0){
                i++;

                //set method to change value
                //it replaces
                itr.set(i);

                //to add
                itr.add(i);
            }

        }

        //print and display elements
        System.out.println();
        System.out.println(arr_list);
    }
}
