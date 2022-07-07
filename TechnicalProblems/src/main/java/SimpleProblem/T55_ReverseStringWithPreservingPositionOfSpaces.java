package SimpleProblem;

public class T55_ReverseStringWithPreservingPositionOfSpaces {

	public static void main(String[] args) {
		
		String input="This is Narmada";
		String output="";
		
		String split[]=input.split("\\s");
		
		
		for(int i=0;i<split.length;i++)
		{
			String word=split[i];
			for(int j=word.length()-1;0<=j;j--)
			{
				System.out.println(word.charAt(j));
				output=output+word.charAt(j);
			}
			output=output+" ";
		}
		System.out.println(output);
	}

}
