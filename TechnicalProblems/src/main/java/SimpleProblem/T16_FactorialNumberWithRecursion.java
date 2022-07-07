package SimpleProblem;

public class T16_FactorialNumberWithRecursion {

	public static void main(String[] args) {
		
		//5!-->5*4*3*2*1
		int fact=1;
		int i=1;
		int num=5;
		 while( i <= num ){  
	            fact = fact * i;   
	            i++; //increment i by 1   
	        }
		 System.out.println(fact);
	}
	
}
//	 public static long fact(long n) {
//	      if (n <= 1)
//	         return 1;
//	      else
//	         return n * fact(n - 1);
//	   }


