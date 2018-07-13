package Inheritence;

public class BMW_Car extends Car{ //BMW_Car is the child class of Car Class ,extends keyword is used in inheritence to access the methods of parent class
					
	public void start() 	// Method Over-riding..here the child class method start will override the parent class start method
	{
		System.out.println("BMW --------Starts");
	}
	
	public void Secutiy_Check() {
		System.out.println("BMW--- Security Features");
	}
}
