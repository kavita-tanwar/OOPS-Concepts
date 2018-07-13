package Basic_Concepts;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		//In hashtable the values are entered in the key<->Value pair

	Hashtable t= new Hashtable();
	
	t.put("1","Tom");
	t.put("2", "Sam");
	
	System.out.println(t.size());
	System.out.println(t.get("1"));
	
	t.put(3,100);
	t.put(4, 300);
	
	//for (int i = 0;i<t.size();i++) {
	//	System.out.println(t.get(i));
	//}

	//Imposing restriction on Hashtable
	Hashtable<Integer,Integer> t1= new Hashtable<Integer,Integer>();
	t1.put(101, 9999);
	t1.put(102, 9998);
	
	System.out.println(t1.getClass());
		
	}
}
