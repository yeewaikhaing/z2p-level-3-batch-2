package day14;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_1 {

	public static void main(String[] args) {
		var set1 = new TreeSet<String>();
		
		set1.add("Orange");
		set1.add("Apple");
		//set1.add(null);
		set1.add("Mango");
		set1.add("Strawberry");
		
		Iterator<String> itr = set1.iterator();
		itr.forEachRemaining(str -> System.out.print(str +","));
		
		var set2 = set1.descendingSet();
		System.out.println("\n" + set2);
	}
}
