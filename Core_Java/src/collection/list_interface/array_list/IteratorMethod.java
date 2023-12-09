package collection.list_interface.array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethod {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		//adding values
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
//
//Output: 
//	One
//	Two
//	Three
