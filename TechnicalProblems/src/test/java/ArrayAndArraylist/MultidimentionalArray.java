package ArrayAndArraylist;

import java.util.Arrays;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2 dimentional
		int[][] mulArr=new int[3][4]; //3 rows 4 columns
		System.out.println("Arrays reps="+Arrays.toString(mulArr));
				
		mulArr[0][0]=100;
		mulArr[0][3]=500;
		mulArr[1][0]=200;
		mulArr[2][3]=300;
		
	
		for(int[] arr:mulArr)
		{
			System.out.println(Arrays.toString(arr));
		}
		
		// 3 dimentional
		int[][][] threeArr = new int[3][4][5]; // 3 rows 4 columns
		System.out.println("Arrays reps=" + Arrays.toString(mulArr));

		
		for (int[][] arr : threeArr)
		{
			System.out.println("[");
			for(int[] arr1 :arr)
			{
				System.out.println(Arrays.toString(arr1));
			}
			System.out.println("]");
			
		}

	}

}
