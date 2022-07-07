package SimpleProblem;

public class T56_SeggregateBinary {

	public static void main(String[] args) {
		
		//3 int variable used --> i-->looping purpose ;j-->reverse storage ;k-->forward storage
		int input[]= {0,1,1,0,1,1,1,0};
		int leng=input.length;
		int output[]=new int[leng];
		int j=leng-1;
		int k=0;
		for(int i=0;i<input.length;i++,j--,k++) 
		{
			if(input[i]==0)
			{
				System.out.println(i +"input "+input[i]);
				output[k]=input[i];
				j++;
				
			}else if(input[i]==1)
			{
				System.out.println(j +" j val "+input[i]);
				output[j]=input[i];
				k--;
			}else
			{
				System.out.println("its not a binary");
			}
		}
		System.out.println(output.length);
		System.out.println();
		for(int i=0;i<output.length;i++)
		{
			
			System.out.print(output[i]+" ");
		}
	}

}
