package Mainmethod_overloading;

public class B {

	public static void main(String[] args) {
		System.out.println("B--Method");
		//A.main(args);
		// if we call A method from B class and vise -versa..it will result in an infinte loop and will result in stack -overloading...
		//means no memory is left..or .. all memory is utilized
	}

}
