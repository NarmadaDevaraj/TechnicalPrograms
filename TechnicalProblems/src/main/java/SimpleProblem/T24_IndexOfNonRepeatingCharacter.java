package SimpleProblem;

public class T24_IndexOfNonRepeatingCharacter {

	/*
	 * The method indexOf() returns the position of the first occurrence of a given
	 * character in a string whereas method lastIndexOf() returns the position of
	 * the last occurrence of a given character in a string.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr="geeksforgeeks"; 
        for(char i :inputStr.toCharArray()){
        	
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i))   //eg. g=0 and g=8  //5==5
        {
            System.out.println("First non-repeating character is: "+i);
            System.out.println("index is : "+inputStr.indexOf(i));
            break;
        }
        }

	}

}
