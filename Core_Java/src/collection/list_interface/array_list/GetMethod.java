package collection.list_interface.array_list;

import java.util.ArrayList;

public class GetMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			list.add(i*5);
		}
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(4));

	}

}
//
//Output: 
//	5
//	15
//	25
