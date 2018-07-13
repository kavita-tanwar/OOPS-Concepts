package Interface;

public interface US_Bank {

	//Interface is used to achieve 100% abstraction.Abstraction means: hiding the implementation details
	//By default the methods defined inside the interface are abstract in nature.
	//no -need of writing the abstract keyword explicitly in front of methods(interface means abstract methods by default
	//here only the methods name is defined and no method body is allowed
	//we cannot create object of abstract methods (or the methods defined under the interface)
	
	public void credit();
	public void debit();
	
}
