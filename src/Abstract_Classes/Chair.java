package Abstract_Classes;

public class Chair extends Furniture{
	
	//all the abstract  methods define in the parent class must be provided with the body in the child class

	@Override
	public void wood() {
		System.out.println("Furniture made up of Wood");
		
	}

	@Override
	public void plastic() {
		System.out.println("Furniture made up of plastic");
		
	}
	

}
