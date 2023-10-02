// Java code to demonstrate the working of
// contains() method in ArrayList of string

package collection_framework.arrayList_methods.contains_method;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        // creating an Empty String ArrayList
        ArrayList<String> arr = new ArrayList<String>(4);

        // using add() to initialize values
        // ["geeks", "for",
        // "geeks"]
        arr.add("geeks");
        arr.add("for");
        arr.add("geeks");

        // use contains() to check if the element
        // "geeks" exits or not
        boolean ans = arr.contains("geeks");

        if (ans)
            System.out.println("The list contains geeks");
        else
            System.out.println(
                    "The list does not contains geeks");

        // use contains() to check if the element
        // "coding" exits or not
        ans = arr.contains("coding");

        if (ans)
            System.out.println("The list contains coding");
        else
            System.out.println(
                    "The list does not contains coding");
    }
}
