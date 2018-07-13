package Inheritence;

public class Test_Car {  //Test Method must have the main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW_Car b = new BMW_Car();  // Compile time Binding...here we make the reference variable of child class to access the parent and child methods.
									
		b.start();  //method inside BMW_Car will be called
		b.stop();  
		b.Secutiy_Check();
		
		System.out.println("**********************");
		
		Car c= new BMW_Car();//Dynamic Binding or Top Casting... here we hav created the parent class reference (c) to access the methods
							//Note: By this : only the parent class methods can be accessed.Child class methods cannot be accessed.
		c.start();  //method inside Car will be called
		c.stop();
		
	}

}
