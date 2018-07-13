package Mainmethod_overloading;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("inside main method-1");

		// jvm will only understand the main method with the above syntax only i.e it
		// will check for main(String[] args)
		// we can also execute below main methods as shown below:
		main(10);
		main('C');
		main("Tom");
		// we can call all other main methods directly as they are static in nature

	}

	public static void main(int i) {
		System.out.println("inside main method-2");
	}

	public static void main(char i) {
		System.out.println("inside main method-3");
	}

	public static void main(String i) {
		System.out.println("inside main method-4");
	}

}
