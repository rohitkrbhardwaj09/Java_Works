// Java program to demonstrate the
// working of removeRange() method
package collection_framework.arrayList_methods.removeRange_method;

import java.util.ArrayList;

public class Example1 extends ArrayList<Integer> {
    public static void main(String[] args) {

        // create an empty array list

        Example1 arr = new Example1();

        // use add() method to add values in the list
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(12);
        arr.add(9);
        arr.add(13);

        // prints the list before removing
        System.out.println("The list before using removeRange:" + arr);

        // removing range of 1st 2 elements
        arr.removeRange(0, 2);
        System.out.println("The list after using removeRange:" + arr);
    }
}
