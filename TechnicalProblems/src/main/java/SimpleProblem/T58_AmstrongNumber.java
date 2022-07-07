package SimpleProblem;

public class T58_AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//153= 1*1*1+5*5*5+3*3*3
		int n=120;
		int input=n;
		int digit;
		int outputSum=0;
		while(0<n)
		{
			digit=n%10;                             //3         //5          //1
			outputSum=outputSum+digit*digit*digit;  //0+3*3*3=27 //27+125=152 //153
			n=n/10;                                 //15         //1          //0
		}
		System.out.println(outputSum);
		if(input==outputSum)
		{
			System.out.println("Given number is an Amstrong ");
		}else
		{
			System.out.println("Not an Amstrong number");
		}
	}

}
