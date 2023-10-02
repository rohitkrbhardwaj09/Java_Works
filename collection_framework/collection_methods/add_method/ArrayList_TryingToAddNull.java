package collection_framework.collection_methods.add_method;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList_TryingToAddNull {
    public static void main(String[] args) {
        
        //creating an empty array list of String type
        Collection<String> list = new ArrayList<String>();
        
        //printing and displaying the array list
        System.out.println("The ArrayList is: "+ list);

        //Note: Here by now we have not to added any element's

        //try block to check for exception
        try {
            list.add(null);
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }
}
