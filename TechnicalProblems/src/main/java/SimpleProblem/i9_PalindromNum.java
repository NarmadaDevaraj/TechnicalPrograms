package SimpleProblem;

public class i9_PalindromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=121;
		int input=n;
		int digit;
		int sum=0;
		
		
		while(0<n)
		{
			digit=n%10;
			sum=sum*10+digit;
			n=n/10;
			
		}
		System.out.println(sum);
		if(sum==n)
		{
			System.out.println("The number is palindrom");
		}else
		{
			System.out.println("Not a palindrom");
		}
	}

}
