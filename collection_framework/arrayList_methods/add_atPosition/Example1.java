// void add(int index, Object element) : 
//This method inserts the specified element E at the specified position in this list.
//It shifts the element currently at that position (if any) and any subsequent elements to the right 
package collection_framework.arrayList_methods.add_atPosition;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {

        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist.add(10);
        arrlist.add(22);
        arrlist.add(30);
        arrlist.add(40);

        // adding element 35 at fourth position
        arrlist.add(3, 35);

        // let us print all the elements available in list
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
    }
}
