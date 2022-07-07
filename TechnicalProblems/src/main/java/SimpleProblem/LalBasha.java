package SimpleProblem;

public class LalBasha {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String m = "madam",
		reversestr = "";
		int strLength = m.length();
		for(int i =(strLength -1);i>=0;i--) 
		{
		reversestr = reversestr + m.charAt(i);
		}
		
		System.out.println(reversestr);
		if(m.equals(reversestr)) 
		{
		System.out.println(m + " is not  a palindrom String");
		}
		else 
		{ 
			System.out.println(m + " is a palindrom String"); 	
		}

	}
	
}
