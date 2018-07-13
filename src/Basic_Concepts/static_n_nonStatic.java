package Basic_Concepts;

public class static_n_nonStatic {

	//Global Variables
	int age= 10;
	static String name="Harry";
	
	//main method
	public static void main(String[] args) {
		//following are the 2 ways of calling static method
		//1.directly by method name
		//2.by classname.methodname
		
		test();
		//static_n_nonStatic.test();
		
		static_n_nonStatic obj = new static_n_nonStatic();
		obj.test1();
		System.out.println(obj.age);
		//can I access static method by using object6 refrence? yes..as shown below, but its not the right way
		obj.test();//warning is given
				
	}
	
	//static method
	public static void test() {
		System.out.println("Inside test method");
		System.out.println(name);
	}

	//non-static method
	public void test1() {
		System.out.println("Inside test1 method");
		System.out.println("name is :" + name);
		System.out.println("age is  :"+ age);
	}
}
