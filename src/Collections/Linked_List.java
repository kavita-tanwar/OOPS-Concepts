package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("One");
		ll.add("Two");
		ll.add("Three");
		ll.add("Four");
		System.out.println("Elements of list are :" + ll);

		ll.addFirst("Zeroth");
		ll.addLast("Last");
		System.out.println("New Elementslist is: " + ll);

		// printing all the values of LinkedList with diff methods

		// for loop
		System.out.println("########## Using for loop ###########");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// advance for loop
		System.out.println("########## Using advance for loop ###########");
		for (String str : ll) {
			System.out.println(str);
		}

		// Using Iterator
		System.out.println("########## Using Iterator ###########");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// while loop
		System.out.println("########## Using while loop ###########");
		int n = 0;
		while (n < ll.size()) {
			System.out.println(ll.get(n));
			n++;

		}
	}
}