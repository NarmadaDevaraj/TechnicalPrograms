package SimpleProblem;

public class T22_ReverseNumber {
	
	public static void main(String args[])
	{
		int n=1234;
		int digit;
		//output 4321
		//int arr[]= {1,2,3,4,5};
       int sum=0;
		while(0<n)
		{
			digit=n%10;       //4        //3         //2          //1
			sum=sum*10+digit; //0*10+4=4 //40+3 =43  //430+2=432  //4320+1=4321
			n=n/10 ;           //123      //12       //1          //0
			
			
		}
		System.out.println(sum);
		
		
	}

}
