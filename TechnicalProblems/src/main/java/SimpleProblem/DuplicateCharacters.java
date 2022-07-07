package SimpleProblem;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String args[])
	{
		//Set set=new HashSet();
		
		String actualString="aaabccdd";
		int count;
		int n=actualString.length();
		for(int i=0;i<n;i++)
		{
			count=1;
    	
			char charValue=actualString.charAt(i);
			for(int j=i+1;j<n;j++)
		    {
				char charValue1=actualString.charAt(j);
				if(charValue==charValue1)
				{
					count++;
					//System.out.println("Dublicate is present="+charValue);
					//set.add(charValue);
					System.out.println(charValue+":"+count);
					//charValue1 = '0';
					//break;
				}
		    }
		}
		//System.out.println("Print the set="+set);
	}
}
