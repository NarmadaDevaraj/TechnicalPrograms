package SimpleProblem;

public class T51_SecondLargestElementInArray {

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
		
		System.out.println("Second largest number is:"+arr[arr.length-2]);
	}

}
