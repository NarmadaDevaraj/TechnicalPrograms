package SimpleProblem;

public class T44_FindEvenAndOddNumbers {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even Number ="+arr[i]);
			}else
			{
				System.out.println("Odd Number ="+arr[i]);
			}
		}

	}

}
