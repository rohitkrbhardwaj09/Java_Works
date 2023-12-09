package collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=5; i++) {
			list.add(i*6);
		}
		
		System.out.println(list.contains(30));
	}

}

//Output: 
//	true

