package SimpleProblem;

public class T14_ThirdLargestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,6,10,2,19,20,21};
		int temp;
		//int total=arr.length;
		
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
		for(int i=0;i<arr.length;i++)//for printing
		{
			System.out.println(arr[i]);
		}
		System.out.println("The Third Largest number is : "+arr[arr.length-3]); //7-3=4 -->arr[4]
		
	}

}
