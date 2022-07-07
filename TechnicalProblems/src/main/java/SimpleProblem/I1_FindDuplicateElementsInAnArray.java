package SimpleProblem;

public class I1_FindDuplicateElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,3,4,3};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					//System.out.println(arr[i]);
					arr[j]=0;
					System.out.println("j value="+j);
				}
			}
			if(count>1&&arr[i]!=0)
			{
				System.out.println(arr[i]+":"+count);
			}
		}
	}

}
