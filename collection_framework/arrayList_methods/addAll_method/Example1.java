package collection_framework.arrayList_methods.addAll_method;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        
        //create an empty array list with initial capacity as 5
        ArrayList<Integer> arrList1 = new ArrayList<Integer>(5);

        //use add() method to add elements in the list
        arrList1.add(12);
        arrList1.add(20);
        arrList1.add(45);

        //prints all the elements available in list1
        System.out.println("Printing list1: ");
        for (Integer number : arrList1) {
            System.out.println("Number = "+ number);
        }

        //create an empty array list2 with an initial capacity
        ArrayList<Integer> arrList2 = new ArrayList<Integer>(5);

        //use add() method to add elements in list2
        arrList2.add(25);
        arrList2.add(30);
        arrList2.add(31);
        arrList2.add(35);

        //let's print all the elements available in list2
        System.out.println("Printing list2: ");
        for (Integer number : arrList2) {
            System.out.println("Number: "+number);
        }

        //inserting all elements, list2 will get printed after list1
        arrList1.addAll(arrList2);

        System.out.println("Printing all elements: ");
        
        //let us print all the elements available in list1
        for (Integer number : arrList1) {
            System.out.println("Number: "+number);
        }

    }
}
