package collection_framework.collection_methods.clear_method;

import java.util.ArrayList;
import java.util.Collection;

public class Example3 {
    public static void main(String[] args) {
        
        //create an empty array list with an initial capacity
        Collection<Integer> arrList = new ArrayList<Integer>(5);

        //use add() method to add elements in the list
        arrList.add(15);
        arrList.add(20);
        arrList.add(25);

        //prints all the elements available in the list
        System.out.println("ArrayList: "+ arrList);

        //Clearing the arrayList
        arrList.clear();

        //prints all the elements available in the list
        System.out.println("The new ArrayList: "+ arrList);
    }
}
