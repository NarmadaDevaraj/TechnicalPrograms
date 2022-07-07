package SimpleProblem;

public class I6_PrintWithoutDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,3,4};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=0;
					arr[j]=0;
				}
			}
			if(arr[i]!=0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
