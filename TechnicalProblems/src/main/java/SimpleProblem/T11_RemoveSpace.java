package SimpleProblem;

public class T11_RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String output="";
		String input="Narmada is a good girl";
		String split[]=input.split("\\s+");
		for(int i=0;i<split.length;i++)
		{
			output=output+split[i];
		}
		System.out.println(output);
	}

}
