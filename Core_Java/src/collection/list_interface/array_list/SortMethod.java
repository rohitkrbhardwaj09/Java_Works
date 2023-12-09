package collection.list_interface.array_list;

import java.util.ArrayList;
import java.util.Comparator;

public class SortMethod {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
	//	list.sort(Comparator.reverseOrder()); //[Two, Three, One, Four]
		list.sort(Comparator.naturalOrder()); //[Four, One, Three, Two]

		System.out.println(list);
	}

}

//Output: [Four, One, Three, Two]

