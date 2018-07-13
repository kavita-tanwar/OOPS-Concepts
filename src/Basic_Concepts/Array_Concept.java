package Basic_Concepts;

public class Array_Concept {

	public static void main(String[] args) {

		// array are used to store same type of data variables in a array variable
		//lower bound/index=0
		//upper bound/index = n-1(n= size of array)
		//one Dimensional Array
		//Disadvantages of Array: 
		//---------------------
		//1. Size is Fixed //thats why its called static array as the size is fixed
		// To overcome this problem we use collections--ArrayList,HashTable //also called dynamic array
		//2. Stores only similar data type variables only ..ex: "int" only or "char" only at a time /storage of different data types is not allowed
		// To overcome this problem we use-- Object Array
		

		//1. integer array
		int i[] = new int[4];

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[2]);
		System.out.println(i.length); // give the length of array

		for (int j = 0; j < i.length; j++) {
			//System.out.println(j); //print the value of j
			System.out.println(i[j]); // print values of i[0], i[1]....
		}
	
		System.out.println("**********************");
		
		//2.double Array
		double d[] = new double[3];
		d[0]=1.111;
		d[1]=2.222;
		d[2]=3.333;
		
		for(int p=0;p<d.length;p++)
		System.out.println(d[p]);
		System.out.println("**********************");
		
		//3.Char Array
		char c[] = new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		
		for(int t=0;t<c.length;t++)
		System.out.println(c[t]);
		System.out.println("**********************");		
		
		//4.boolean array
		boolean b[] = new boolean[2];
		b[0]=true;
		b[1]=false;
		
		System.out.println(b[1]);
		System.out.println("**********************");
		
		//5.String array
		String s[] = new String[2];
		s[0]="start";
		s[1]="stop";
		System.out.println(s[0]);
		System.out.println("**********************");
		
		//6. Object Array: (Object is class): Its used to store different type of data variables
		Object ob[]= new Object[6];
		ob[0]="Tom";
		ob[1]=20;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='M';
		ob[5]="London";
				
		System.out.println(ob[5]);
		
	}

}
