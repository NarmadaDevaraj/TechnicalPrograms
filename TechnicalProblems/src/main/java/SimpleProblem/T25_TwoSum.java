package SimpleProblem;

import java.util.ArrayList;

public class T25_TwoSum {

	public static void main(String[] args) {
		//{2,7,9,11,15,1,18} , target - 17
		//{0,4}
		
		int arr[]= {2,7,9,11,15,1,18};
		int target=17;
		ArrayList alist=new ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					alist.add(i);
					alist.add(j);
				}
			}
		}
		System.out.println(alist);

	}

}
