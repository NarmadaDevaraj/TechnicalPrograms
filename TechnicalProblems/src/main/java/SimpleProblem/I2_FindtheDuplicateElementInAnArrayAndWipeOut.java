package SimpleProblem;

import java.util.Arrays;

public class I2_FindtheDuplicateElementInAnArrayAndWipeOut {

	public static void main(String[] args) {
		
		//int arr[]= {1,2,3,4,3,4,3,3,4};
		int arr[]= {1,2,3,4,1,2};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=0;//assigning 0 to upcoming duplicates
				}
			}
			if(count>=1&&arr[i]!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
