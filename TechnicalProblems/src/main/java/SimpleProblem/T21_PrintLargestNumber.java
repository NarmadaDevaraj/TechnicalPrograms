package SimpleProblem;

public class T21_PrintLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f=(float) 48.57;
		
		//converting float to string
		String s=Float.toString(f);
		System.out.println(s);
		
		//String spliting
		String split[]=s.split("\\.");
		
		//convert string to int
		int value1=Integer.parseInt(split[0]);
		int value2 =Integer.parseInt(split[1]);
		
		//Verification part
		if(value1==value2)
		{
			System.out.println("no largest number ");
		}
		else if(value1<value2)
		{
			System.out.println("largest value is :"+ value2);
		}else
		{
			System.out.println("Largest value is :"+value1);
		}
		
	}

}
