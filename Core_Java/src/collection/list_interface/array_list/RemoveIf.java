package collection.list_interface.array_list;

import java.util.ArrayList;

public class RemoveIf {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		
		System.out.println("Before: "+list);

		list.removeIf(e -> e%2 == 0);
		System.out.println("After: "+list);
	}

}

//Output: 
//	Before: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//	After: [1, 3, 5, 7, 9]
