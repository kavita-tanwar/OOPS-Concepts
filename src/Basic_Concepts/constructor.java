package Basic_Concepts;

public class constructor {
	
	public constructor() { //default constructor- the one without any arguments
	  System.out.println("Default Constructor");
	}

	public constructor(int i) {// Parameterized constructor (here having 1 argument or 1 local variable)
		System.out.println("Single parametreised constructor");
		System.out.println("The value of i is  " + i);
		
	}
	public constructor(int i, int j) { // Parameterized constructor (here having 2 argument or 2 local variable)
		System.out.println("two parametreised constructor");
		System.out.println("The value of i is " + i );
		System.out.println("The value of j is " + j );
	}

	public static void main(String[] args) {
		
		//constructor obj = new constructor(); //As soon as we create the object,constructor is called no need of calling by obj.  ...
		//constructor obj1 = new constructor(10); //single parameterised constructor is called 
		constructor obj2 = new constructor(10,20);//downloaded parameterised constructor is called 
	}

}
