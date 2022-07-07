package SimpleProblem;

public class I13_ExtractNumbersAndCharacterInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Narmada123Aadhesh";
		
		char[] ch=input.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				System.out.println("Numbers="+ch[i]);
			}else
			{
				System.out.println("Characters="+ch[i]);
			}
		}
	}

}
