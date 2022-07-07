package SimpleProblem;

import java.util.ArrayList;
import java.util.List;

public class i11_AlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List list =new ArrayList();
//		
//		for(char ch='A';ch<='Z';ch++)
//		{
//			list.add(ch);
//		}
//		System.out.println(list);
//		int k=1;
		char ch='A';
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
				//System.out.println(ch1++);
			}
			System.out.println("");
		}
		System.out.println();
	}

}
