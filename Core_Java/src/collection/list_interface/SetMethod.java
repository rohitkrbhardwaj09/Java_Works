package collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class SetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Three");
		list.set(1, "Two");
		
		System.out.println(list);
	}

}


//Output: 
//	[One, Two]
