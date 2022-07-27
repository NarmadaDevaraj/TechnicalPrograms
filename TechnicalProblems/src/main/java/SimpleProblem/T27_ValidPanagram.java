package SimpleProblem;

import java.util.ArrayList;

public class T27_ValidPanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="The quick brown fox jumps over the lazy dog";
		String alpha="abcdefghijklmnopqrstuvwxyz";
		String upper=alpha.toUpperCase();
		ArrayList alist=new ArrayList();
		
		int arr[]=new int[26]; 
		String split[]=input.split("\\s");
		int count =0;
		for(int i=0;i<split.length;i++)
		{
			String word=split[i];
			
			for(int j=0;j<word.length();j++)
			{
				//System.out.println(j);
				char ch=word.charAt(j);
				String out=String.valueOf(ch);
				int wordcount=0;
				if(alpha.toLowerCase().contains(out.toLowerCase()))
				{
					if(alist.contains(out.toLowerCase()))
					{
						
					}else
					{
						alist.add(out.toLowerCase());
						count++;
						
					}
						
				}
			}
		}
		System.out.println(count);
		if(count==26)
		{
			System.out.println("Given string is Pangram");
		}else
		{
			System.out.println("Given string is not pangram");
		}
	}

}
