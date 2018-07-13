package Basic_Concepts;

public class final_concept {  //parent class
	//final keyword is used in different contexts. First of all, final is a non-access modifier applicable only to a variable,
	//a method or a class.Following are different contexts where final is used.
	//Final Variable --> to create constant variable
	//Final Methods -->Prevent Method Over-riding
	//Final Classes	--> Prevent Inheritence
	
	public void A() {
		int j = 20;
		j=30;
		
		System.out.println("value of j is : "+ j);
		
		final int i=10; //now we cannot modify the value of i 
		//i=20;  //not allowed as i is having final key-word
		
		System.out.println("Inside A class ");
	}

	public void B() {
		System.out.println("inside B class");
	}

}
