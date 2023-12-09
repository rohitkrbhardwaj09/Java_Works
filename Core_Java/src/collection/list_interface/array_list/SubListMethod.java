package collection.list_interface.array_list;

import java.util.ArrayList;

public class SubListMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			list.add(i*2);
		}

		System.out.println(list.subList(3, 7)); //[8, 10, 12, 14]

	}

}
