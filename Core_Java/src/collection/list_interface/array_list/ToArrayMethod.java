package collection.list_interface.array_list;

import java.util.ArrayList;

public class ToArrayMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			list.add(i*2);
		}
		
		list.toArray();
		
		for(Integer newList : list){
			System.out.println(newList * 2);
		}

	}

}

//output: 
//	4
//	8
//	12
//	16
//	20
//	24
//	28
//	32
//	36
//	40
