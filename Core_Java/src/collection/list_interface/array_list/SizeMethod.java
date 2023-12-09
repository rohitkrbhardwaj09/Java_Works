package collection.list_interface.array_list;

import java.util.ArrayList;

public class SizeMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			list.add(i*3);
		}
		
		

		System.out.println(list.size());
	}

}

//Output: 5