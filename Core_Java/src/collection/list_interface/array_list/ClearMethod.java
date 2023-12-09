package collection.list_interface.array_list;

import java.util.ArrayList;

public class ClearMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> table = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			table.add(i*5);
		}
		
		System.out.println("Before: "+table);
		
		//removing elements from arrayList()
		table.clear();
		
		System.out.println("After: "+table);
	}

}

//Output: Before: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
//		After: []
