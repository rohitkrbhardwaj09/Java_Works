package collection.list_interface.array_list;

import java.util.ArrayList;

public class TrimToSizeMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			list.add(i*2);
		}
		
		System.out.println("Before :"+list.size()); //5
		list.trimToSize();
		System.out.println("After :"+list.size()); //5
		
	}

}
