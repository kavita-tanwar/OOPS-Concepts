package Basic_Concepts;

public class finally_concept {

	public static void test1() { // if we define a method static we can call it directly in main block without
									// creating its object
		int i = 10;

		try {
			System.out.println("test1 try block");
			int k = 10 / 0; // here arithmatic exception is called and is

		} catch (ArithmeticException e) {
			System.out.println("test1 catch block");// catched in catch block
		} finally {
			System.out.println("finally in test1 block");
		}
	}

	// The finally block always executes immediately after try-catch block exits.
	// The finally block is executed incase even if an unexpected exception occurs.
	// The main usage of finally block is to do clean up job. ... The runtime system
	// always executes the code within the finally block regardless of what happens
	// in the try block
	public static void test2() {
		int i2 = 10;

		try {
			System.out.println("test2 try block");
			int k = 10 / 0;

		} catch (NullPointerException e) {
			System.out.println("test2 catch block"); //here wrong exception is given,so the exception is not catch but the finally statement is executed
		} finally {
			System.out.println("finally in test2 block");
		}
	}

	public static void main(String args[]) {
		// test1();
		test2();
	}

}
