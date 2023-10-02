package collection_framework.arrayList_methods.indexOf_method;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {

        // creating an Empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(10);

        // using add() to initialize dice values
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(5);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(6);
        arr.add(4);

        // using IndexOf() to find first index of 6
        int pos1 = arr.indexOf(6);

        // using lastIndexOf() to find last index of 6
        int pos2 = arr.lastIndexOf(6);

        // to balance 0 based indexing
        pos1 = pos1 + 1;
        pos2 = pos2 + 1;

        // printing first index of 6
        System.out.println("The first occurrence of 6 is  : " + pos1);

        // printing last index of 6
        System.out.println("The last occurrence of 6 is  : " + pos2);

    }
}
