package SimpleProblem;

public class G2_RemoveDublicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,4,1,2,3,5,9};
		int output[]=new int[arr.length];
		
		int count=1;
		output[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			int valCount=0;
			for(int j=0;j<count;j++)
			{
				if(output[j]==arr[i])
				{
					valCount++;
				}
			}
			if(valCount==0)
			{
				output[count]=arr[i];
				count++;
			//	System.out.println(arr[i]);
			}
		}
		
		for(int i=0;i<count;i++)
		//for(int i=0;i<arr.length;i++)
		{
			System.out.println(output[i]);
		}
		
	}

}
