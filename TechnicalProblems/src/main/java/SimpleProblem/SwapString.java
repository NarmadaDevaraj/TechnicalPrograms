package SimpleProblem;

public class SwapString {

	public static void main(String[] args) {
	
		String a="Narmada";
		String b="Guru";
		//a=a.concat(b);
		a=a+b;
		System.out.println(a);
		System.out.println(a.length());
		System.out.println(b.length());
		b=a.substring(0,(a.length()-b.length()));//0 - 7
		a=a.substring(b.length()); //above 7
		System.out.println(" a value after swap="+a);
		System.out.println("b value after swap="+b);
	}
	

}
