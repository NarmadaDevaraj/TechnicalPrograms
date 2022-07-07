package SimpleProblem;

public class T69_Denomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2000,500,200,100,50,20,10,5,1};
		int n=945;
		int count;
		
		for(int i=0;i<arr.length;i++)
		{
			while(arr[i]<n)
			{
				count=n/arr[i]; 
				n=n%arr[i]; //reminder
				System.out.println(n +"element="+arr[i]+":"+count);
			}
		}
	}

}
