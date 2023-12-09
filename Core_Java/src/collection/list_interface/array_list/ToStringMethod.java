package collection.list_interface.array_list;

import java.util.ArrayList;

public class ToStringMethod {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			list.add(i*2);
		}
		
		System.out.println("ArrayList: "+list);
		
		list.toString();
		
		System.out.println("StringList: "+list);
		

	}

}
//
//output:
//	ArrayList: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
//	StringList: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
