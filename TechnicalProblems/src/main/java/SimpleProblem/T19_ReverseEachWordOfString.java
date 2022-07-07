package SimpleProblem;

public class T19_ReverseEachWordOfString {

	/*
	 * sample i/p = "My native is bangalore"
	 *  sample o/p="yM evitan si erolagnab"
	 */
	
	public static void main(String[] args) {
		
		String str= "My native is bangalore";
		String reverseString="";
		String split[]=str.split(" ");
		for(int i=0;i<split.length;i++)
		{
			String word = split[i];
            
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
		System.out.println(reverseString);

	}

}
