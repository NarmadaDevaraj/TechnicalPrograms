package SimpleProblem;

public class T2_Tom_Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Morgen stanly india";
		String output="";
		String split[]=s.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			String word=split[i];
			if(word.equals("india"))
			{
				
			}else
			{
				output=output+word+" ";
			}
			
		}
		System.out.println(output);
	}

}
