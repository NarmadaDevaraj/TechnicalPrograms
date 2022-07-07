package SimpleProblem;

import java.util.ArrayList;

public class T20_MultiplyOtherIndexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,3,4};
		
		for(int i=0;i<arr.length;i++)
		{
			int mul=1;
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
				{
					continue;
				}else
				{
					mul=mul*arr[j];
				}
				
			}
			System.out.println("index :"+i+"; Muliplication value :"+mul);
		}	
	}
           
	}

