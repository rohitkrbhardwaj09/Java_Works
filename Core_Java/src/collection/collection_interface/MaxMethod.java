package collection.collection_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MaxMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> list = new ArrayList<Integer>();
		
		for(int i=3; i<=5; i++) {
			list.add(i*3);
		}
		
		int result = Collections.max(list);
		System.out.println("Max value is "+result);
		
	}

}


//output:
//Max value is 15
