/*boolean add(Object o) : 
*This method appends the specified element to the end of this list. 
*/
package collection_framework.arrayList_methods.add_object;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist.add(15);
        arrlist.add(20);
        arrlist.add(25);

        // prints all the elements available in list
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
    }
}
