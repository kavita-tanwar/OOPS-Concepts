package Interface;

//we use "implement" keyword to access interface methods in the child class
// Its mandatory for the child class to write the body of the abstract methods defined in the interface
// A child must have all the methods of parent class(interface) + Also can have its own methods 

public class HDFC_Bank implements US_Bank,Canada_Bank {

	@Override
	public void credit() {
		System.out.println("HDFC_Bank credit--------statement ");
	}

	@Override
	public void debit() {
		System.out.println("HDFC_Bank debit--------statement ");
	}

	public void loan() {
		System.out.println("HDFC_Bank loan conditions");
	}

	@Override
	public void min_balance() {
		System.out.println("Canada_Bank : Minimum Bal Quote");
		
	}

	@Override
	public void account_type() {
		System.out.println(" Canada_Bank: Account type: Salaried");
		
	}
}
