package SimpleProblem;

import java.util.ArrayList;

public class T47_CountVowels {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Narmada";
		int count=0;
		ArrayList arraylist=new ArrayList();
		
		arraylist.add('a');
		arraylist.add('e');
		arraylist.add('i');
		arraylist.add('o');
		arraylist.add('u');
		
		for(int i=0;i<a.length();i++)
		{
			if(arraylist.contains(a.charAt(i)))
			{
				count++;
				//System.out.println("Vowel is :"+a.charAt(i));
				//System.out.println("Vowel count :"+count);
				
			}
		}
		System.out.println("Vowel count :"+count);
	}

}
