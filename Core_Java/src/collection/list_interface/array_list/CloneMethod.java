package collection.list_interface.array_list;

import java.util.ArrayList;

public class CloneMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			numbers.add(i*3);
		}
		
		System.out.println("Numbers: "+numbers);
		
		ArrayList<Integer> cloneNumber = (ArrayList<Integer>)numbers.clone();

		System.out.println("Clone numbers: "+ cloneNumber);
	}

}
