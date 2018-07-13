package Super_keyword;

public class C extends A {

	public C() {
		super(10);
		//super keyword is used to call the parameterised constructor of parent class
		//by default if super() keyword is not used then by default "parent default constructor" is called
		System.out.println("child class-C constructor");
	}



public static void main(String[] args) {

	C obj = new C();
}
}