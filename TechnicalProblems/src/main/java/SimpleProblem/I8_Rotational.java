package SimpleProblem;

public class I8_Rotational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		
		int out[]=new int[arr.length];
		
		int leng=arr.length-1;//4
		
		int j=1; //5 i=4,j=5
		for(int i=0;i<arr.length;i++)
		{
			if(i==leng)
			{
				out[0]=arr[i];
			}else
			{
				out[j]=arr[i];
				j++;				
			}
			
		}
		
		for(int k=0;k<out.length;k++)
		{
			System.out.println(out[k]);
		}
		
	}
	

}
