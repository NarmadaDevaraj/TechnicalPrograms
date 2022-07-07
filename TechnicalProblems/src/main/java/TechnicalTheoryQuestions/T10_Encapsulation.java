package TechnicalTheoryQuestions;

public class T10_Encapsulation {

	
	/*
	 * it is a protective shield that prevents the data from being accessed by the code outside this shield.
	 * Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
	 * to achieve this making all class variable as private and access those through public methods
	 *Reusability: Encapsulation also improves the re-usability and is easy to change with new requirements.
	 *Testing code is easy: Encapsulated code is easy to test for unit testing.
	 *
	 */
	private int  age=40;
	public int num=60;
	 
	public void add(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
   public int getAge()
   { 
	   return age;
	   }


}
