package SimpleProblem;

public class T29_PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=12321;
		int input=n;
		int digit;
		int sum=0;
		while(0<n)
		{
			digit=n%10;    //1            //2        //3         //2       //1
			sum=sum*10+digit; // 0+1=1   //10+2=12   //120+3=123  //1232   //12321
			n=n/10;        //1232       //123         //12        //1      //0.1
		}  
		System.out.println("Reversed number="+sum);
		
		if(sum==input)
		{
			System.out.println("Given number is palindrom");
			
		}
		else
		{
			System.out.println("given number is not palindrom");
		}
	}

}
