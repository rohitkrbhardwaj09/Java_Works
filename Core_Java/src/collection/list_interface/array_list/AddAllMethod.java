package collection.list_interface.array_list;

import java.util.ArrayList;

public class AddAllMethod {

	public static void main(String[] args) {
		
		//creating arrayList()
		ArrayList<String> languages = new ArrayList<String>();
		
		
		//adding value into arrayList()
		languages.add("Core Java");
		languages.add("JavaScript");
		languages.add("Pyhton");
		
		System.out.println("Languages before: "+ languages);
		
		
		ArrayList<String> progLang = new ArrayList<String>();
		boolean allLanguages = progLang.addAll(languages);

		if(allLanguages)
			System.out.println("Programming languages: "+languages);
		else
			System.out.println("Languages before: "+languages);
	}

}


//output:
//	Languages before: [Core Java, JavaScript, Pyhton]
//	Programming languages: [Core Java, JavaScript, Pyhton]
