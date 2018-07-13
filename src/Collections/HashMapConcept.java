package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1, "Tom");
		hm.put(2, "Peter");
		hm.put(3, "England");
		
		System.out.println(hm.get(1));
		
		for(Entry e : hm.entrySet()) {
			
		}
	}

}
