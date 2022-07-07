package SimpleProblem;

public class T23_SwapWord_SpecialCharacterEncountered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="Narmada123@Java";
		String output;
		
		
		//char delimiter;
		T23_SwapWord_SpecialCharacterEncountered obj=new T23_SwapWord_SpecialCharacterEncountered();
		
		//getting spcl char 
		char output_delimiter=obj.findDelimiter(word);
		
		//splitting string using spcl char
		String op=Character.toString(output_delimiter);
		String split[]=word.split(op);
		
		//swap operation
		String temp=split[0];
		split[0]=split[1];
		split[1]=temp;
		
		//print function
		output=split[0]+op+split[1];
		System.out.println(output);
		
	}
	public static char findDelimiter(String word)
	{
		char delimiter = 0;
		for(int i=0;i<word.length();i++)
		{
			//need to add one more condition
			if(Character.isAlphabetic(word.charAt(i))||Character.isDigit(word.charAt(i)))
			{
				
			}else
			{
				System.out.println("Special character is present = "+word.charAt(i));
				delimiter=word.charAt(i);
				return delimiter;
			}
		}
		return delimiter;
		//return 0;
		
		
	}

}
