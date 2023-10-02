// Java program to demonstrate the error in
// working of removeRange() method
package collection_framework.arrayList_methods.removeRange_method;

import java.util.ArrayList;

public class Example2 extends ArrayList<Integer> {
    public static void main(String[] args) {

        // create an empty array list

        Example1 arr = new Example1();

        // use add() method to add values in the list
        arr.add(1);
        arr.add(2);
        arr.add(3);

        // arr.removeRange(1, 4); // error as 4 is out of range

        System.out.println("The list after using removeRange:" + arr);
    }
}
