package SimpleProblem;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		
		
		@SuppressWarnings("rawtypes")
		//List list = new ArrayList();
		String stringToBeReverse = "Narmada";
		int stringLength = stringToBeReverse.length();
		String output="";
		
		for (int i = stringLength; 0 < i; i--) {
			
			char charvalue = stringToBeReverse.charAt(i - 1);
			//String convertedStrigValue = Character.toString(charvalue);
			//list.add(convertedStrigValue);
			output=output+charvalue;
		}
		System.out.println(output);
	}
}
