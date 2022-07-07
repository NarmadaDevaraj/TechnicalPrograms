package SimpleProblem;

public class T39_ExtractNumberFromStringAndSumTheNumber {
	
	public static void main(String[] args) {
		
		String input="I have 5 years experience and I am 25 years old.123 1AB234";
		int outputSum=0;
		
		String s=input.replaceAll("[^\\d]"," ");
		s=s.trim();//eliminates leading and trailing spaces //The string trim() method doesn't omit middle spaces.
		System.out.println(s);
		
		String split[]=s.split("\\s+");
		 int[] array = new int[split.length]; //to strore the output //no need here
		//System.out.println(s);  //string would be after removing regex
		
		 int sum=0;
		 for(int i=0;i<split.length;i++)
		{
			//System.out.print(split[i]);
			//System.out.print(" ");
			sum+=Integer.parseInt(split[i]);
			
		}
//		for(int i=0;i<array.length;i++)
//		{
//			//System.out.println(array[i]);
//			outputSum=outputSum+array[i];
//		}
		System.out.println(sum);
	}

}
