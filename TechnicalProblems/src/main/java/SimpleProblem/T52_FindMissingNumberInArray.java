package SimpleProblem;

public class T52_FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,6,7,9};
		int j=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==j)
			{
				//System.out.println();
			}else {
				System.out.println("missed num is :"+j);//arr[1]!=2
				i--; //i.e it will check again arr[1]
			}
			j++; 
		}

	}

}
