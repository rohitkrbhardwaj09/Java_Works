package collection.list_interface.array_list;

import java.util.ArrayList;

public class ReplaceAllMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();

		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");

		System.out.println("Before: " + list);
		
		list.replaceAll(e -> e.toUpperCase());
		
		System.out.println("After: "+ list);

	}

}

//Output: 
//	Before: [One, Two, Three, Four, Five]
//	After: [ONE, TWO, THREE, FOUR, FIVE]
