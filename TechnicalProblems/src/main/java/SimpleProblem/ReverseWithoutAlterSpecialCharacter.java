package SimpleProblem;

import java.util.Scanner;

//1)

public class ReverseWithoutAlterSpecialCharacter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);//to get input from user
		System.out.println("Enter a number=");
		String stringToBeTested=scanner.nextLine();
		// System.out.println("Before Reverse="+stringToBeTested);
	    char[] arr=stringToBeTested.toCharArray();
	   // System.out.println("Before Reverse="+arr);
	    ReverseWithoutAlterSpecialCharacter revStringWithoutSpcl=new ReverseWithoutAlterSpecialCharacter();
	    int leng=stringToBeTested.length()-1;//Narmada
	    revStringWithoutSpcl.reverseString(arr,leng);
	   // System.out.println("After Reverse="+arr);
	    String revStr = new String(arr); //need to check what is the use of this 
//	    
        System.out.println("Output string: " + revStr);
	}
public void reverseString(char[] arr,int leng)
{
	String output="";
	int init=0;
	while(init<leng)//0<6 ;1<5 
	{
		if(!Character.isAlphabetic(arr[leng]))
		{
			leng--;
		}else  if(!Character.isAlphabetic(arr[init]))
		{
			init++;
		}
		else
		{
			char temp=arr[leng];
			arr[leng]=arr[init];
			arr[init]=temp;
			leng--;
			init++;
			
		}
		//System.out.print(arr[leng]);
		
	}
	System.out.println("After Reverse:"+arr);
	String s=String.valueOf(arr);//The java string valueOf() method converts different types of values into string. By the help of string valueOf() method, you can convert int to string, long to string, boolean to string, character to string, float to string, double to string, object to string and char array to string.
	System.out.println("ValueOf="+s);
	}
}
