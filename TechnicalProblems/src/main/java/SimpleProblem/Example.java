package SimpleProblem;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Third Largest: "+getThirdLargest(a,6));  
		System.out.println("Third Largest: "+getThirdLargest(b,7));  

	}
	public static int getThirdLargest(int[] a, int total){  
		Arrays.sort(a); 
		for(int i=0;i<total;i++)
		{
			System.out.println(a[i]);
		}
		//System.out.println(a[0]);
		
		//System.out.println(a[total-3]);
		return a[total-3];  
		}  

}
