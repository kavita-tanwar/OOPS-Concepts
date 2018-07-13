package Basic_Concepts;

public class this_constructor {

	//Global Variables
	String name;
	int age;
	
	public this_constructor(String name,int age) { //Local variables/arguments
		
		this.name=name;//assigning the global variable to local variable check the blue and brown color of local and global variables
		this.age=age;
		
		System.out.println("Name is "+ name);
		System.out.println("Age is " + age);
		
	}
	
	
	public static void main(String[] args) {
		
		this_constructor obj= new this_constructor("Tom", 25); //here the local variables(name and age) are called
		//but if we want to assign the local variable values to global variables ,we need to use "this" keyword

	}

}
