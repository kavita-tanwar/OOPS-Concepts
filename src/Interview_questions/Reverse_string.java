package Interview_questions;

public class Reverse_string {

	public static void main(String[] args) {
		
		String s= "Selenium";//length is 8
		
		int len= s.length();
		String rev= " ";
		
		for(int i=len-1; i>=0;i--) { //starting at 7 , 7>=0 condition satisfy ,  print the char & after that i=7-1=>6
		rev=rev + s.charAt(i);
		}
			System.out.println("Reverse string of 'Selenium' is: " + rev);
		//System.out.println(rev);
		
	}

}
