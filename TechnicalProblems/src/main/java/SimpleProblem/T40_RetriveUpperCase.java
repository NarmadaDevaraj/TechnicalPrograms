package SimpleProblem;

public class T40_RetriveUpperCase {

	public static void main(String[] args) {
		
		String input="Hello World";
		System.out.print("Capital letters are : ");
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)>='A' && input.charAt(i)<='Z')
			{
				System.out.print(input.charAt(i)+" ");
			}
		}
	}

}
