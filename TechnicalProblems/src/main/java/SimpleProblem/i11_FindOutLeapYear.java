package SimpleProblem;

public class i11_FindOutLeapYear {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2004;
		
		if(n%400==0)
		{
			System.out.println("Leap year");
		}else if(n%100==0)
		{
			System.out.println("Not a leap year");
		}else if(n%4==0)
		{
			System.out.println("Leap year");
		}else
		{
			System.out.println("not a leap year");
		}
	}	
		
}
