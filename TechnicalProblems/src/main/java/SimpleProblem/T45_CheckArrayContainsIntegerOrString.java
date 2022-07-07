package SimpleProblem;

public class T45_CheckArrayContainsIntegerOrString {

	public static void main(String[] args) {
		
		int input1[]= {1,2,3,4,5,6};
		String input2[]= {"narmada","nimmy","nikki"};
		
		for(int i=0;i<input1.length;i++)
		{
			if(input1[i]==1)
			{
				System.out.println("Array contains integer elements");
			}
		}
			
		for(int i=0;i<input2.length;i++)
		{
			if(input2[i].contains("narmada"))
			{
				System.out.println("Array contains String elements");
			}
		}
	}
}
