package SimpleProblem;

public class T32_CountNumberAlphabetSpecialCharacter {

	public static void main(String[] args) {
		
		String input="Java@123";
		int aCount=0;
		int dCount=0;
		int sCount=0;
		
		for(int i=0;i<input.length();i++)
		{
			if(Character.isAlphabetic(input.charAt(i)))
			{
				//System.out.println("Alphabetic ");
				aCount++;
			}else if(Character.isDigit(input.charAt(i)))
			{
				//System.out.println("Digit ");
				dCount++;
			}else
			{
				//System.out.println("spcl cha");
				sCount++;
			}
		}
		System.out.println("Alpha count="+aCount+" ; " +"Digit="+dCount+" ; "+"Specl char ="+sCount);
	}

}
