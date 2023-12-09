package collection.collection_interface;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class containsMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Collection<String> list = new LinkedList<String>();

		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		System.out.println("List before: "+ list);
		
		System.out.println("Enter String to be search in list: ");
		String input = sc.nextLine();
		
		boolean b = list.contains(input);
				
		System.out.println("List contains "+input+"? :"+b);
		
		sc.close();
	}

}


//Output:
//List before: [One, Two, Three, Four]
//Enter String to be search in list: 

