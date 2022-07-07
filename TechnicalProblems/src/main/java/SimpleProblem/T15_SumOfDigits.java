package SimpleProblem;

public class T15_SumOfDigits {

//	Read or initialize an integer N.
//	Declare a variable (sum) to store the sum of numbers and initialize it to 0.
//	Find the remainder by using the modulo (%) operator. It gives the last digit of the number (N).
//	Add the last digit to the variable sum.
//	Divide the number (N) by 10. It removes the last digit of the number.
//	Repeat the above steps (3 to 5) until the number (N) becomes 0.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {32,4,21,45,1};
		int digit;
		//int number=0;
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			int number=arr[i];
			int sum=0;
		while(0<number)
		{
			digit=number%10; // 32%10=2   //3%10 =3 //4
			sum=sum+digit; //0+2          //  2+3=5 //4
			number=number/10; // 32/10=3  // 3/10=0.3 //
			
		}
		System.out.println(sum);
		}
	}
	

}
