//java code to illustrate add() method

package collection_framework.collection_methods.add_method;

import java.util.ArrayList;
import java.util.Collection;

class ArrayListClass{
    public static void main(String[] args) {
        
        //create an empty array list with an initial capacity
        Collection<Integer> arr_list = new ArrayList<Integer>(5);
    
        //use add() method to add elements in the list
        arr_list.add(15);
        arr_list.add(20);
        arr_list.add(25);

        //printing in array
        System.out.println(arr_list);

        //prints all the elements available in list
        for (Integer integer : arr_list) {
            System.out.println("Numbers: "+integer);
        }
    }
}