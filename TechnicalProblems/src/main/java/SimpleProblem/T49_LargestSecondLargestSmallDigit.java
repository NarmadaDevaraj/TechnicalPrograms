package SimpleProblem;

public class T49_LargestSecondLargestSmallDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,34,42,13,15,99,39};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		System.out.println("Largest number is:"+arr[arr.length-1]);
		System.out.println("Second Largest number is:"+arr[arr.length-2]);
		System.out.println("Small digit is:"+arr[arr.length-arr.length]);
	}

}
