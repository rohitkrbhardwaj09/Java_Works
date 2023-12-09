package collection.collection_interface;

import java.util.ArrayList;
import java.util.Collection;

public class SizeMethod {

	public static void main(String[] args) {
		
		Collection<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<5; i++) {
			list.add(i*5);
		}
		
		int result = list.size();
		
		System.out.println("Size of the list is : "+result);

	}

}


//Output
//Size of the list is : 4
