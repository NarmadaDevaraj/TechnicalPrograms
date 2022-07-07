package SimpleProblem;

import java.util.Scanner;

public class PrimeNumber {

	static int  numberToBeTest;
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);//to get input from user
		System.out.println("Enter a number=");
	    numberToBeTest=scanner.nextInt();
	    @SuppressWarnings("unused")
		int mid=numberToBeTest/2;
		
		if(numberToBeTest==0)
		{
			System.out.println("Its a Composite  number");
		}else if(numberToBeTest==1&&numberToBeTest==2)
		{
			System.out.println(+numberToBeTest+"=>Its a Prime Number");
		}
		else if(checkPrimeNumber(mid))
		{
			System.out.println(+numberToBeTest+"=>Its a Prime Number");
		}
		else
		{
			System.out.println(+numberToBeTest+"=>Its not a Prime Number");
		}
	}
	public static Boolean checkPrimeNumber(int mid)
	{
		for(int i=2;i<mid;i++)
		{
			if((numberToBeTest%i)==0)
			{
				return false;
			}
			
		}
		return true;
	}
}
