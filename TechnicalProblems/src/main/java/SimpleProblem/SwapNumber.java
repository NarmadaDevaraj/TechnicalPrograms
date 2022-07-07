package SimpleProblem;

public class SwapNumber {

	public static void main(String args[])
	{
		int a=6;
		int b=5;
		System.out.println("a value before swapping="+a);
		System.out.println("b value before swapping="+b);
		a=a+b;//11
		b=a-b;//
		a=a-b;
		System.out.println("a value after swapping="+a);
		System.out.println("b value after swapping="+b);
	}
}
