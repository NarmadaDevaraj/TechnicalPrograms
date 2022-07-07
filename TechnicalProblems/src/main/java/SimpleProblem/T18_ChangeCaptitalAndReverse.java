package SimpleProblem;

public class T18_ChangeCaptitalAndReverse {

	public static void main(String[] args) 
	{
		String input="Bangalore is Capital of Karnataka";
		String split[]=input.split("\\s");
		String reverseString="";
		for(int i=0;i<split.length;i++)
		{
			String word=split[i];
			
			char ch=word.charAt(0);
			String s=Character.toString(ch).toUpperCase();
			
			String reverseWord="";
			
			for(int j=word.length()-1;0<j;j--)
			{
				//System.out.println(word.charAt(j));
				reverseWord=reverseWord+word.charAt(j);
				
			}
			reverseString=reverseString+s+reverseWord+" ";
		}
		System.out.println(reverseString);
		
	}

}
