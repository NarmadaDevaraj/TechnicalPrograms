package TechnicalTheoryQuestions;

public class Jerin {

	public static void main(String args[])
	{
		int arr[]={1,2,3,2,1,7,1,3,3,3,3,3};

		//output={1,2}

		for(int i=0;i<arr.length;i++)
		{
		int count=1;
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]==arr[j])
		{
		count++;
		arr[j]=0;

		}
		}
		if(count>1&&arr[i]!=0)
		{

		System.out.println(arr[i]);
		}

		}

	}
}
