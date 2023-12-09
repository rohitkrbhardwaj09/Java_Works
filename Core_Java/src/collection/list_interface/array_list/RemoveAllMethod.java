package collection.list_interface.array_list;

import java.util.ArrayList;

public class RemoveAllMethod {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		//adding values
		list.add("One");
		list.add("Two");
		list.add("Three");
		
	   System.out.println(list);
		
		boolean b = list.removeAll(list);
		

		if(b) {
			System.out.println("All list removed: "+b); //true
		}else {
			System.out.println("All list removed: "+b); //false
		}
		
		System.out.println(list);
	}

}
//
//Output: [One, Two, Three]
//		All list removed: true
//		[]
