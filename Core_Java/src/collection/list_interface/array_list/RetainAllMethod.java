package collection.list_interface.array_list;

import java.util.ArrayList;

public class RetainAllMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("JavaScript");
		list1.add("Pyhton");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("PHP");
		list2.add("Java");
		list2.add("JavaScript");
		
		list1.retainAll(list2);
		
		System.out.println("Common elements: "+ list1);

	}

}

//Output: Common elements: [Java, JavaScript]