package Basic_Concepts;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();

		// Standard Java arrays are of a fixed length. After arrays are created, they
		// cannot grow or shrink, which means that you must know
		// in advance how many elements an array will hold.

		// Array lists are created with an initial size. When this size is exceeded, the
		// collection is automatically enlarged. When objects
		// are removed, the array may be shrunk.

		ar.add(100); // it will add the value 100 into the list
		ar.add(200);
		ar.add("A");
		ar.add(10.5);
		ar.add('A');

		System.out.println(ar.get(1)); // index value start from 0, so here we are printing 2nd number

		
		for (int i = 0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		// If we want to impose restriction to array, ex: if we want to add only integer
		// value so put that data type in <>.Ex:
		
		//Integer Restriction
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(3);
		System.out.println(ar1.size());
		System.out.println(ar1.get(0));
	
	
		//String Restriction
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
		ar2.add("Peter");
		System.out.println(ar2.size());
		System.out.println(ar2.get(1));
	}

}