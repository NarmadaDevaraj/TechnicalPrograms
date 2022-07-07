package SimpleProblem;

public class T28_PrintPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit=100;
		boolean flag=false;
		
		for(int i=1;i<=100;i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i);
			}
		}
	}

	public static Boolean checkPrime(int num)
	{
		
		if(num<2)
		{
			return false;
		}else
		{
			//int x=num/2;
		for(int i=2;i<=num/2;i++) //2<2
		{
			if(num%i==0)
			{
				return false;
			}
		}}
		return true;
	}
}
