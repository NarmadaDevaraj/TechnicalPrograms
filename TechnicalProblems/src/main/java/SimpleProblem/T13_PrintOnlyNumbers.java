package SimpleProblem;

public class T13_PrintOnlyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="1589rrttt677";
		char arr[]=input.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i])) //Character.isDigit ,Character.isAlphabetic
			{
				System.out.print(arr[i]);
			}
		}
	}

}
