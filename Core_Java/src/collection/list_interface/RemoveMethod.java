package collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethod {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			list.add(i*3);
		}
		
		System.out.println("List before: "+ list);
		list.remove(3);
		System.out.println("List after: "+ list);

	}

}

//Output: 
//List before: [3, 6, 9, 12, 15]
//List after: [3, 6, 9, 15]
