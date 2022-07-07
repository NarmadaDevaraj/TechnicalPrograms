package SimpleProblem;

import java.util.Scanner;

public class OccurenceOfString {

	static int count=0;
	public static void main(String[] args) {
		
		//get input from user
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input string 1:");
		String inputStr1=scanner.nextLine();
		System.out.println(inputStr1);

		System.out.println("Enter input string 2:");
		String inputStr2 = scanner.nextLine();
		System.out.println(inputStr2);
		
		//split the string 
		//String inputStr1="This is narmada this is";
		//String split[]=inputStr1.split("\\s+"); **for to handle Multiple space**
		//String split[]=inputStr1.split(" ");** for to handle single space**
		String split[]=inputStr1.split("\\s");
		int leng=split.length;
		System.out.println(leng);
		//String inputStr2="th";
		//loop it
		for(int i=0;i<split.length;i++)
		{
			String abc=split[i];
			if(split[i].toLowerCase().contains(inputStr2.toLowerCase())) //** for avoid conflicts
			{
				count++;
				System.out.println("Occurence is present : "+inputStr2);
			}
		}
		
	System.out.println("Output= "+inputStr2+" : "+count);
	}

}
