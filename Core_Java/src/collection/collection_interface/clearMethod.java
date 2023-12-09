package collection.collection_interface;
import java.util.Collection;
import java.util.LinkedList;

public class clearMethod {

	public static void main(String[] args) {
		
		Collection<String> list = new LinkedList<String>();

		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		System.out.println("List before: "+ list);

		list.clear();
		
		System.out.println("List after: "+ list);

	}

}

//Output: 
//List before: [One, Two, Three, Four]
//List after: []
