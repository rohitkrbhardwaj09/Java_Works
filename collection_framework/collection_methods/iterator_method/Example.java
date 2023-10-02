package collection_framework.collection_methods.iterator_method;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        
        //Creating an arrayList class object
        //Declaring object of integer type
        ArrayList<Integer> arr_list = new ArrayList<Integer>();

        //Itterating over the list
        for (int i = 0; i < 10; i++) {
            arr_list.add(i);
        }

        //printing the elements in the list
        System.out.println(arr_list);

        //At the beginning it(curcor) will point to
        //index just before the first element in arr_list
        Iterator<Integer> itr = arr_list.iterator();

        //checking the next element where
        //condition holds true till there is single element
        //in the List using hasNext() method
        while(itr.hasNext()){
            //moving cursor to next element
            int i = itr.next();

            //getting elements one by one
            System.out.print(i+", ");

            //removing odd elements
            if(i%2 != 0){
                itr.remove();
            }
        }
        //command for next line
            System.out.println();

            //printing the elements inside the object
            System.out.println(arr_list);
    }   
}
