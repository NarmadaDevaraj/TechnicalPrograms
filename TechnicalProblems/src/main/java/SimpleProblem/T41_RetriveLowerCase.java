package SimpleProblem;

public class T41_RetriveLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Hi bye";
		System.out.print("Small letters are : ");
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)>='a' && input.charAt(i)<='z')
			{
				System.out.print(input.charAt(i));
			}
		}
	}

}
