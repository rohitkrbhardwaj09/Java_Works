package collection_framework.arrayList_methods.clear_method;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> animals = new ArrayList<>();

        // Add some elements to the ArrayList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");
        animals.add("Bird");

        // Print the elements of the ArrayList
        System.out.println("Animals: " + animals);

        // Clear the ArrayList using the clear() method
        animals.clear();

        // Print the elements of the ArrayList after
        // clearing it
        System.out.println("Animals after clearing: "
                + animals);
    }
}
