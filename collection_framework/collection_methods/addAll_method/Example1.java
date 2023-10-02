package collection_framework.collection_methods.addAll_method;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
    public static void main(String[] args) throws Exception {
        
        try {
            
            //creating object of List<String>
            List<String> list = new ArrayList<String>();

            //adding element to list
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("Tajmahal");

            //printing the list before operation
            System.out.println("ArrayList before operation: "+ list);

            //add the specified element to specified Collections
            //using addAll() method
            boolean b = Collections.addAll(list, "1", "2", "3");

            //printing the list after operation
            System.out.println("Result: "+b);

            //printing the list after operation
            System.out.println("List after operation"+list);


        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: "+e);
        }

    }
}
