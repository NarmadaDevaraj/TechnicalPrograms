package SimpleProblem;

public class T29_PalindromString {

	public static void main(String[] args) {
		
		String input="abcba";
		char ch[]=input.toCharArray();
		String output="";
 
		
		for(int i=input.length()-1;0<=i;i--)
		{
			char value=input.charAt(i);
			System.out.print(input.charAt(i));
			output=output+value;
		}
		
		//Validation part
		System.out.println();
		if(output.equals(input))
		{
			System.out.println("Given string is palindrom");
		}else
		{
			System.out.println("Given string is not palindrom");
		}
	
	}

}
