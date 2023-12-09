package collection.list_interface.array_list;

import java.util.ArrayList;

public class ContainsAllMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Two");
		list2.add("Three");
		
		System.out.println("List1 contains List2 Elements :"+ list1.containsAll(list2));
		
		System.out.println("List2 contains List1 Elements :"+ list2.containsAll(list1));
		
		

	}

}

//Output: 
//	List1 contains List2 Elements :true
//	List2 contains List1 Elements :false
