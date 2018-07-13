package Abstract_Classes;

public abstract class Furniture {
	// abstract classes are those classes that can have abstract and non-abstract methods.
	// Abstract methods are those- having only definition & no body
	//							-start with the abstract keyword.
	//							-We cannot create object of the abstract method
	// We can achieve partial abstraction (0-100%) with the abstract classes

	public abstract void wood();
	public abstract void plastic();
	public void metal() {
		System.out.println("Deals with Metal Furniture");
	}
	
}
