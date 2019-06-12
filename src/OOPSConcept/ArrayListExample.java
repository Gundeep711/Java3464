package OOPSConcept;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExample {

	public static void main(String[] args) {
		// 1. Create a new List
		ArrayList<String> names = new ArrayList<String>();
		
		// 1. Add 2 people to the list
		names.add("Jenelle");
		names.add("Peter");
		names.add("Emad");
		
		
		// 2. Output total number of people in list
		System.out.println("Before removing "+names.size());
		
		// 3. Delete someone from the list
		names.remove(2);
		System.out.println("After removing "+names.size());
		
		// 4. Output all people in the list
		
		System.out.println(names.toString());
		//or
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		// 5. Get one person out of the list
			System.out.println(names.get(1));
		// 6. Change the name of the person
			names.set(1, "Cryston");
			System.out.println("After changing "+names.get(1));
		// 7. Delete everyone from list
		names.removeAll(names);
		System.out.println("Removing All "+names.toString());
		// 8. Loop through every item in the list and output:
		// HELLO _______ (where ___ is the name)
		int count=0;
		for(int i=0;i<5;i++)
		{
			names.add(String.valueOf(count));
			count++;
		}
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
	}
}
