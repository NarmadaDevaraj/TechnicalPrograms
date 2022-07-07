package TechnicalTheoryQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E3_ExceptionsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] strArray = new String[] { "John", "Snow" };
//		List<String> strList =Arrays.asList(strArray);
//		System.out.println("String list: " + strList);
//		
//		int a=5;
//		String s=Integer.toString(a);
//		System.out.println(s);
		
		//improperly casting one class object to another class
		Object i = Integer.valueOf (42); 
		String s = (String)i;
	}

}
