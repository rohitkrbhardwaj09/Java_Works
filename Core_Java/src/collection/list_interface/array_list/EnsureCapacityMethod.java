package collection.list_interface.array_list;

import java.util.ArrayList;

public class EnsureCapacityMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//setting up the capacity of the ArrayList
		list.ensureCapacity(3);
		
		//adding values
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		System.out.println(list);
		
		

	}

}
