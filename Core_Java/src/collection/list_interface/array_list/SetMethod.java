package collection.list_interface.array_list;

import java.util.ArrayList;

public class SetMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("JavaScript");
		list1.add("Pyhton");
		
		list1.set(1, "PHP");
		
		System.out.println(list1);
		
	}

}

//Output: [Java, PHP, Pyhton]
