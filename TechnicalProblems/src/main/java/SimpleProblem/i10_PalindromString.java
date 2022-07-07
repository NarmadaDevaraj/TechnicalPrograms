package SimpleProblem;

public class i10_PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="keek";
		String output="";
		for(int i=str.length()-1;0<=i;i--)
		{
			System.out.println(str.charAt(i));
			output=output+str.charAt(i);
		}
		System.out.println(output);
		if(str.equals(output))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("not a palindrom");
		}
	}

}
