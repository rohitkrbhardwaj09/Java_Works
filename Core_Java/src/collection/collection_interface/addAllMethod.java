package collection.collection_interface;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class addAllMethod {

	public static void main(String[] args) {
		

		Collection<String> list = new LinkedList<String>();

		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		System.out.println("List before: "+ list);
		
		boolean b = Collections.addAll(list, "1", "2", "3", "4", "5");
				
		System.out.println("Result: "+b);
		
		System.out.println("List after: "+ list);
		
	}

}
