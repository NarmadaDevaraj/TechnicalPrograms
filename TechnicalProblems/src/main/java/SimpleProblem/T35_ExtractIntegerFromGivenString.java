package SimpleProblem;

public class T35_ExtractIntegerFromGivenString {

	public static void main(String[] args) {

		String input="I have 5 years experience and I am 25 years old.123 1AB234";
		
		String s=input.replaceAll("[^\\d]"," ");
		s=s.trim();
		String split[]=s.split("\\s+"); //remove multiple space
		
		//System.out.println(s); //string would be after removing regex
		for(int i=0;i<split.length;i++)
		{
			System.out.print(split[i]);
			System.out.print(" ");
		}
	}
}
