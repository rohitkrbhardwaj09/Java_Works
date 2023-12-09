package collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class GetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=5; i++) {
			list.add(i*9);
		}
		
	System.out.println(list.get(0));
	System.out.println(list.get(2));
	System.out.println(list.get(3));
	System.out.println(list.get(4));
	System.out.println(list.get(1));
	}

}
//
//Output: 
//	9
//	27
//	36
//	45
//	18
