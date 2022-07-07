package SimpleProblem;

public class T37_ReverseEachWord {
	
	/*
	 * sample input = "My native is bangalore" 
	 * sample o/p="bangalore is native my"
	 */
	public static void main(String[] args) {
		
		String str= "My native is bangalore";
		
		  String output="";
		  String split[]=str.split(" "); 
		  for(int i=split.length-1;0<=i;i--) 
		  {
			  output=output+split[i]+" ";
		  
		  }
		  System.out.println(output);
		 
		
		}
	}


