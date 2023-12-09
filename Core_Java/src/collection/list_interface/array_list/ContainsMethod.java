package collection.list_interface.array_list;

import java.util.ArrayList;

public class ContainsMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		boolean b = list.contains("Two");

		if(b) {
			System.out.println("This "+list+" contains 'Two': "+ b);
		}else {
			System.out.println("This "+list+" contains 'Two': "+ b);
		}
	}

}
//
//Output: 
//	This [One, Two, Three, Four] contains 'Two': true
