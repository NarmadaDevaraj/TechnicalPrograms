package SampleJavaProgram;

public class CalculateMatrixSum {

	/*
	 * The function/method calculateMatrixSum returns an integre representing the
	 * sum of odd elements of the given matrix whose ith and jth index are the same
	 * 
	 * The function/method calculateMatrixSum accepts three arguments -rows,an integer
	 * representing the number of rows of the given matrix,columns,
	 * an integer representing the number of columns of the given matrix 
	 * and matrix representing a two dimensional array of integers.
	 * 
	 * 1 2
	 * 2 3
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateMatrixSum calculatematrixsum=new CalculateMatrixSum();
		int matrix[][]= {{1,2},{2,8}};
		int row=matrix.length;
		int column=matrix.length;
		int returnedValue=calculatematrixsum.calculateMatrixSum(row, column, matrix);
        System.out.println(returnedValue);
	}
	int calculateMatrixSum(int rows,int columns,int matrix[][])
	{
		int i,j,sum=0;
		if((rows>0) &&(columns>0)) {
			for (i = 0; i < rows; i++) {
				//sum=0; //commended this line
				for ( j = 0; j < columns; j++) {
					if(i ==j) {
						int a=matrix[i][j];
						int abc=matrix[i][j]/2;
						if(matrix[i][j]%2!=0) //just changed "%" instead of "/"
							sum +=matrix[i][j];
					}
					
				}
				
			}
			return sum;
		}
		else
			return sum;
	}

}
