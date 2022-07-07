package TechnicalTheoryQuestions;

public class E2_UncheckedException {

	//Exception mainly used for to handle all the runtime errors .If we are not using exception it will not proceed to further steps
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Example 1
			int arr[]= {1,3,4,5,6,7,0};
			System.out.println(arr[7]);//not throwing any compile time error //ArrayIndexOutOfBoundsException

			//Example 2
			int a=26;
			System.out.println(26/0); //not throwing any compile time error //Arithmetic Exception
			System.out.println("Final code in the method");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e)  //********the generic catch block we have to handle it in last catch block otherwise it will throw compile time error 
		{
			e.printStackTrace();
		}
	}

}
