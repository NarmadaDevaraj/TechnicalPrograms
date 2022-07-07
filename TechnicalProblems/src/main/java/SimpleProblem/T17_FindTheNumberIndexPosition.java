package SimpleProblem;

public class T17_FindTheNumberIndexPosition {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,8,6};
		int input=11;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==input)
			{
				System.out.println(i);//index
			}
			//need to add condition
		}
	}

}
