package collection_framework.collection_methods.clear_method;

import java.util.ArrayDeque;
import java.util.Collection;

class Example2{

    public static void main(String[] args) {
        
        //Creating an empty ArrayDeque
        Collection<String> de_que = new ArrayDeque<>();

        //Use add() method to add elements into the deque
        de_que.add("Welcome");
        de_que.add("to");
        de_que.add("Geeks");
        de_que.add("for");
        de_que.add("Geeks");

        //Displaying the arrayDeque
        System.out.println("Array Deque: "+ de_que);

        //clearing the ArrayDeque
        de_que.clear();

        //printing the new ArrayDeque
        System.out.println("The new ArrayDeque is: "+de_que);

    }
}