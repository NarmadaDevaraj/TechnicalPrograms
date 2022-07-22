package ArrayAndArraylist;

import java.util.Arrays;

public class FixedLength {

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
		System.out.println("Length="+arr.length);
		
		
		//
		String[] strArr=new String[5];
		strArr[1]="narmada";
		strArr[2]="narmada123";
		System.out.println(strArr.getClass());
		System.out.println("Array of strArr:"+strArr); //class of the obj for integer array
		System.out.println("Array of strArr to string :"+strArr.toString()); //memory locations
		
		//Representing the element
		
		System.out.println("Representing the element="+Arrays.toString(strArr));
		System.out.println("Length="+strArr.length);
		
		//Array is a ordered position so we can access using indexed position
		String index[]= {"abc","xcv","bnm"};
		
		System.out.println("oth index="+index[0]);
		System.out.println("1st index="+index[1]);
		System.out.println("2nd index="+index[2]);
		
		
		for(String names:index) //there is no change of index outofBound exception
		{
			System.out.println("For each loop:"+names);
		}
	}

}
