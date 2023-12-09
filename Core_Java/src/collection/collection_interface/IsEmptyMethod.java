package collection.collection_interface;

import java.util.Collection;
import java.util.LinkedList;

public class IsEmptyMethod {

	public static void main(String[] args) {

		Collection<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		list.clear();
		
		boolean result = list.isEmpty();
		
		if(result) {
			System.out.println("list is empty");
		}else {
			System.out.println("list is not empty");
		}

	}

}
//Output:
//list is empty

