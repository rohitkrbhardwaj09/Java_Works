package collection.collection_interface;

import java.util.Collection;
import java.util.LinkedList;

public class addMethod {

	public static void main(String[] args) {
		
		Collection<String> list = new LinkedList<String>();
		
		//adding value to the list
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		System.out.println("List is: "+ list);
		
		list.add("Four");
		list.add("Five");
		
		System.out.println("Now List is: "+ list);

	}

}
