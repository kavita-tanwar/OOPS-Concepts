package Interface;

public class Test_HDFC_Bank {

	public static void main(String[] args) {
		
		HDFC_Bank b= new HDFC_Bank();
		//here we are creating the reference "b" of HDFC_Bank class by creating its object with "new" keyword [new HDFC_Bank();]
		
		// Static or Compile TimeBinding or Polymorphism or HAS-A relationship (relationship b/w class to class)
		//We use the child class object to access the parent class
	
		b.credit();
		b.debit();
		b.loan();
		b.account_type();
		b.min_balance();
	
		//Dynamic Binding-- Run time polymorphism
		//is when we create a reference variable of Parent class to access the child class methods
		
		US_Bank b1= new HDFC_Bank();
		b1.credit();
		b1.debit();
		//here we cannot access the loan() method of child class ,with parent class ref.variable
	}

}
