package collection.collection_interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethod {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=5; i++) {
			list.add(i*5);
		}
		
		System.out.println("Array list: "+ list);
		
		list.remove(1);
		list.remove(2);
		
		System.out.println("Modified list: "+ list);

	}

}


//output:
//Array list: [5, 10, 15, 20, 25]
//Modified list: [5, 15, 25]
