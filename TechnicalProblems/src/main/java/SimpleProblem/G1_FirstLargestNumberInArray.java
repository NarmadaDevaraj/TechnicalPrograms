package SimpleProblem;

public class G1_FirstLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,3,5,3,2,6};
		int largest=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
		  if(largest<arr[i])
		  {
			  largest=arr[i];
		  }
		}
		
		System.out.println(largest);
	}

}
