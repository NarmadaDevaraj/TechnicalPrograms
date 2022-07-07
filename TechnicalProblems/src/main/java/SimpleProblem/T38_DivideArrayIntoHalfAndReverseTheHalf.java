package SimpleProblem;

import java.util.ArrayList;

public class T38_DivideArrayIntoHalfAndReverseTheHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int arr[]= {3,2,1,0,4,6,7,8,5,9};
		int leng=arr.length;
		ArrayList arrayList=new ArrayList();
		
		
		for(int i=leng/2-1;0<=i;i--) //1st half 4-->0,1,2,3,4
		{
			arrayList.add(arr[i]);
		}for(int j=leng-1;leng/2<=j;j--)
		{
			arrayList.add(arr[j]);
		}
		System.out.println(arrayList.size());
		System.out.println(arrayList);
	}

}
