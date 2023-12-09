package collection.collection_interface;

import java.util.Collection;
import java.util.HashSet;

public class equalsMethod {

	public static void main(String[] args) {

		Collection<Integer> collection1 = new HashSet<Integer>();
		Collection<Integer> collection2 = new HashSet<Integer>();

		collection1.add(5);
		collection2.add(6);

		boolean result = collection1.equals(collection2);

		if (result) {
			System.out.println(collection1 + " & " + collection2 + " both are equal");
		} else {
			System.out.println(collection1 + " & " + collection2 + " both are not equal");
		}
	}

}

//Output: 
//[5] & [6] both are not equal
