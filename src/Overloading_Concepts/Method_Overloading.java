package Overloading_Concepts;

public class Method_Overloading {

	//public static void main(String[] args) {
		// When the method name is same but the number of arguments or input parameters are different in the same class is called method-overloading
		//Same method ,with same number of arguments but different data types are allowed.
		
		public void sum() {
			System.out.println("Sum with 0 input param");
		}
		

		public void sum(int i) {					// here we are overloading sum method.here the name of the method is same but here its having 1 input and above its having 0 param
			System.out.println("Sum with 1 int param " + i);
		}

}
