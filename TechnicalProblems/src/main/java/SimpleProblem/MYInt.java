package SimpleProblem;

public class MYInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=133;
		int input=n;
		int digit;
		int sum=0;
		while(n>0)        //13>0  //1>0
		{
		digit=n%10;       //1   /3  /1
		sum=sum*10+digit;   //1 *10 +3 =13 *10+1 =131
		n=n/10 ;            //13 =1 //0

		}

		if(sum==input)
		{
		System.out.println("Its a palindrom");
		}else
		{
			System.out.println("Its not a palindrom");
		}

	}

}
