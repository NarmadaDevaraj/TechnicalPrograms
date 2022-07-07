package SimpleProblem;

public class T57_MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[][]= {{1,2},{3,4}};
//		int b[][]= {{1,1},{1,1}};
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
		
		//System.out.println(a.length);
		int output[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					output[i][j]+=a[i][k]*b[k][j]; //0+a[0][0]*b[0][0] //
					
				}
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
			
		}
		

	}

}
