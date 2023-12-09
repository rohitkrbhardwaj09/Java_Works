package collection.list_interface.array_list;

import java.util.ArrayList;

public class IsEmptyMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//adding values
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		System.out.println(list.isEmpty()); //false

	}

}
