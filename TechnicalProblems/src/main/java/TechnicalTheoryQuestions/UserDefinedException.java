package TechnicalTheoryQuestions;

public class UserDefinedException {
	
	/*
	 * In Java, we can write our own exception class by extends the Exception class.
	 * We can throw our own exception on a particular condition using the throw
	 * keyword.
	 */
	public static void main(String args[]){  
	        try{  
	            throw new NewException(5); //class created  by me
	        }  
	        catch( NewException ex){  
	            System.out.println(ex) ;  
	        }  
	    }  
}
	

