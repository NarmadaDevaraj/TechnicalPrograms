package ArrayAndArraylist;

import java.util.Arrays;

public class T5_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[4];
		
		arr[0]=2;
		arr[1]=5;
		
		System.out.println(arr.getClass());
		System.out.println("Array of integer:"+arr); //class of the obj for integer array
		System.out.println("Array of integer to string :"+arr.toString()); //memory locations
		
		//Representing the element
		
		System.out.println("Representing the element="+Arrays.toString(arr));
		
		
	}

}
