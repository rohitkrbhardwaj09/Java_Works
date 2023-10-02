/*
 * boolean addAll(int index, Collection c):
 * This method inserts all of the elements in the specified collection into this list, 
 * starting at the specified position. It shifts the element currently at that position 
 * (if any) and any subsequent elements to the right (increases their indices). 
 * The new elements will appear in the list in the order that they are returned by the specified collection’s
 * iterator.
 */
package collection_framework.arrayList_methods.addAll_atPosition;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        
        //create an empty array list1 with initial capacity 5
        ArrayList<Integer> arrList1 = new ArrayList<Integer>(5);

        //using add() method to add elements in the list
        arrList1.add(12);
        arrList1.add(20);
        arrList1.add(45);

        //prints all the elements available in list1
        System.out.println("Printint list1: ");
        for (Integer number : arrList1) {
            System.out.println("Number: "+number);
        }

        //create an empty array list2 with an initial capacity
        ArrayList<Integer> arrList2 = new ArrayList<Integer>(5);

        //use add() method to add elements in list2
        arrList2.add(25);
        arrList2.add(30);
        arrList2.add(31);
        arrList2.add(35);

        //prints all the elements available in list2
        System.out.println("Printing list2: ");
        for (Integer number : arrList2) {
            System.out.println("Number: "+number);
        }

        //inserting all elements of list2 at third position
        arrList1.addAll(2, arrList2);

        System.out.println("Printing all the elements: ");

        //printing all the elements available in list1
        for (Integer number : arrList1) {
            System.out.println("Number: "+ number);
        }

    }
}
