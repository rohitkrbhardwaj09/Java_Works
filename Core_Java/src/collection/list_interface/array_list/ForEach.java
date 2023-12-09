package collection.list_interface.array_list;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			list.add(i*5);
		}

		list.forEach((e) ->{
			e = e*10;
			System.out.println(e);
		});
	}

}

//Output: 
//	50
//	100
//	150
//	200
//	250
