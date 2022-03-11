package dxc.basic2.collectionexercise;

import java.util.*;

class TreeSetExample {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		TreeSet<String> set = new TreeSet<String>();
		set.add("ZAjay");
		set.add("Ravi");
		set.add("Vijay");
		set.add("zRavi");
		set.add("Ajay");
		
		
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}



