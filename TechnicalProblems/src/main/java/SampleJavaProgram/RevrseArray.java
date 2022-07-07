package SampleJavaProgram;

public class RevrseArray {
	

	/*
	 * The function reverseArray modify the input list by reversing its elements.
	 * The function/method reverseArray accepts two arguments-len,an integer
	 * representing the length of list and arr,list of integers representing the
	 * input list respectively.
	 * 
	 * For example,if the input list arr is{20 30 10 40 50}
	 * the function/method is  supposed to print {50 40 10 30 20}
	 */
	public static void main(String args[]) {
		
		int a[] = {15,45,20,30,10,40,50};
		int l = a.length;
		//System.out.println(l);
		RevrseArray r = new RevrseArray();
		r.reverseArray(l,a);
		
		
	}
	public void reverseArray(int len,int[] arr) {
		int i  , temp;
		int originalLen = len;
		for (i = 0; i < len/2; i++) {
			temp = arr[originalLen-1];
			arr[originalLen-1]= arr[i];
			arr[i] = temp;
			originalLen -=1;//just changed "-" instead of "+"
		}
		//System.out.println(originalLen); //50 40 10 30 20
		for(int k=0;k<len;k++) //Just added for loop to print array
		{
			System.out.println(arr[k]);
		}
	}
}
