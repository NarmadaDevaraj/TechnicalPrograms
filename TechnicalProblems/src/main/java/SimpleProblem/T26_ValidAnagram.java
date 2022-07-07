package SimpleProblem;

import java.util.Arrays;

public class T26_ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1="Listen";
		String input2="Silentt"; 
		
		T26_ValidAnagram obj=new T26_ValidAnagram();
		
		boolean result=obj.isAnagram(input1,input2);
		if(result)
		{
			System.out.println("Its a valid anagram");
		}else
		{
			System.out.println("its not a valid anagram");
		}
		
	}
	public static boolean isAnagram(String input1,String input2)
	{
		if(input1.length()!=input2.length())
		{
			return false;
		}else
		{
			//convert both string in to lowercase and in to char array
			char ch1[]=input1.toLowerCase().toCharArray();
			char ch2[]=input2.toLowerCase().toCharArray();
			//sorting the both array
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			return(Arrays.equals(ch1, ch2));
			
		}
		
	}

}
