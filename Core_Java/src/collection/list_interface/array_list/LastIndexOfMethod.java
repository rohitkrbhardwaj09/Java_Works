package collection.list_interface.array_list;

import java.util.ArrayList;

public class LastIndexOfMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//adding values
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Three");
		
		System.out.println(list.lastIndexOf("Three"));

	}

}

//Output: 4