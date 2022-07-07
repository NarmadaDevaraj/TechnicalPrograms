package SampleJavaProgram;

public class SortArray {

	/*Code Approach:For this question,you will need to correct the given implementation
	.We do not expect you to modify the approach or incorporate any additional library methods

	The function/method sortArray modify the input list by sorting its elements in
	descending order.
	The function/method sortArray accepts two arguments-len,representing the length of the list and 
	arr , a list of integers representing the input list respectively.

	*/
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			SortArray sortarray=new SortArray();
			int[] arr= {45,14,15};
			int len=arr.length;
			sortarray.sortArry(len, arr);
		}
		public void sortArry(int len,int[] arr) {
			int i,max,location,j,temp;
			for ( i = 0; i < len; i++) {
				max = arr[i];
				location=i;
				for (j=i; j < len; j++) {
					if(max<arr[j]) {//just changed "<" instead of ">"
						max=arr[j];
						location = j;
					}
					
				}
				temp = arr[i];
				arr[i]= arr[location];//here its interchanging
				arr[location] = temp;
			
				System.out.println(arr[i]);
				
			}
			
			
		}
		
		}

