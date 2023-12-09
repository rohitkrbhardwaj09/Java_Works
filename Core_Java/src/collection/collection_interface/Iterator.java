package collection.collection_interface;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			list.add(i*10);
		}
		
		java.util.Iterator<Integer> iterator = list.iterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

////Output:
//10
//20
//30
//40
//50
//60
//70
//80
//90
//100
