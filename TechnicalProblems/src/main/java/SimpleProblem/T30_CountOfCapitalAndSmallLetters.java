package SimpleProblem;

public class T30_CountOfCapitalAndSmallLetters {

	public static void main(String[] args) {
		
		String input="Narmada";//7->1 & 6
		int uCount = 0;
		int lCount =0;
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			
			if(ch>='A'&&ch<='Z')
			{
				uCount++;
				//System.out.println("Its Upper case :"+ch);
			}else if(ch>='a'&&ch<='z')
			{
				lCount++;
				//System.out.println("Its lower case :"+ch);
			}else
			{
				System.out.println("its not an Alphabet");
			}
		}
		System.out.println("Upper case count = "+uCount);
		System.out.println("Lower case count ="+lCount);

	}

}
