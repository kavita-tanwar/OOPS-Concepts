package Basic_Concepts;

public class finalize_concept {

	
	public void finalize() {
		System.out.println("finalize concept");
		
		
		
	}
	public static void main(String[] args) {
		
		finalize_concept f1= new finalize_concept();
		finalize_concept f2= new finalize_concept();
		f1	= null;
		f2 = null;//here objects without any refrence in memory
		
		System.gc(); //garbage collector function
		
		//here we are not calling the finalize() method but its automatically called before garbage collector to do some cleanup;
		
		//definition:finalize() method In Java:		
		//finalize() method is a protected and non-static method of java.lang.Object class. This method will be available in all objects you 
		//create in java. This method is used to perform some final operations or clean up operations on an object before it is removed
		//from the memory.  you can override the finalize() method to keep those operations you want to perform before an object is destroyed. 
		//Here is the general form of finalize() method.
	}

}
