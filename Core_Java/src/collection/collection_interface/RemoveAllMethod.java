package collection.collection_interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllMethod {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			list.add(i*4);
		}
		
		System.out.println("Original list array: "+ list);

		list.removeAll(list);
		
		System.out.println("Modified array: "+ list);
	}

}

//Original list array: [4, 8, 12, 16, 20]
//Modified array: []

