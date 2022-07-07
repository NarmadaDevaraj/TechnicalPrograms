package SimpleProblem;

public class FibonaceSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8 
		int n=10;
		int a=0;
		int b=1;
		int c;
		int output=0;
		System.out.println(a);
		System.out.println(b);
		while(0<n)
		{
		 c=a+b;
		 System.out.println(c);
		 a=b;
		 b=c;
		 n--;
		}
	}

}
