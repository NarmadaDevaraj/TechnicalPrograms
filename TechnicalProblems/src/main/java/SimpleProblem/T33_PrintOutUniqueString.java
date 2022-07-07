package SimpleProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T33_PrintOutUniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Narmada2626";
		
		Set set=new HashSet();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i)); //set is an unordered collection of object .in which duplicate values cannot be stored
		}
		
		System.out.println(set);
		
		
		
//		List arr = new ArrayList(set);
//	     System.out.println(arr);
//	     Collections.sort(arr);
//	     System.out.println(arr);
	     		
	}

}
