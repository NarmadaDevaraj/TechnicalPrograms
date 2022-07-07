package SimpleProblem;

public class I7_CharacterAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char arr[]= {'a','b','c','d'};
		
		int finalIndexLeng=arr.length-1;
		String output="";
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==finalIndexLeng)
			{
				System.out.println("This is last index");
				output=output+arr[i];
			}else
			{
				output=output+arr[i]+"|";
			}
		}
		System.out.println(output);
		
	}

}
