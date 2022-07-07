package SimpleProblem;

public class NivethProgram {
	
			//int arr1[]= {'a', 'b', 'c','d' }; //will print asci number
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr[]= {'a', 'b', 'c','d' };
		
		char ch[][] = new char[2][2];
		int f=0; int b=arr.length-1; 
		System.out.println(b);
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<2;j++)
			{
				if(j==0)
				{
					ch[i][j]=arr[f];
					System.out.println(i+ " : "+ j+ " = "+arr[f]);
				    f++;
				}else
				{
					ch[i][j]=arr[b];
					System.out.println(i+ " : "+ j+ " = "+arr[b]);
				    b--;	
				}
				
			}
		}
		System.out.println(ch);
		
	}
	

}
