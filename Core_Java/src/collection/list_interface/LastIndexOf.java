package collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);

		int result = list.lastIndexOf(2);
		System.out.println("First occurance of 2 is: " + result);
	}

}


//Output: First occurance of 2 is: 3