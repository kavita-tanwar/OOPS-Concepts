package Super_keyword;

public class B extends A{

	public B() {
		System.out.println("child class-B constructor");
	}
	
	public static void main(String[] args) {
	B obj = new B();
	//Note: When we run this program: it will go to class B() and check that it has parent class and call the default constructor of paren
	// and then b class out put is printed

	}

}
