package SimpleProblem;

import java.util.HashMap;
import java.util.Map;

public class T53_FindFirstRepeatedCharacterInString {

	public static void main(String[] args) {
		
		String input="geeksforgeeks";
		int output;
		Map<Character,Integer> map=new HashMap();
		
		for(int i=0;i<input.length();i++)
		{
			for(int j=i+1;j<input.length();j++)
			{
				if(input.charAt(i)!=input.charAt(j))
				{
					continue;
				}else
				{
				   System.out.println("i th index :"+i+" j th index:"+j);
				   output=j-i; //subtracting index 
				   System.out.println(output);
				   if(map.containsKey(input.charAt(i)))
				   {
					   System.out.println("already contains so no need to add it");
				   }else
				   {
				   map.put(input.charAt(i), output);
				   }
				   
				}
				
			}
		}
		System.out.println(map);
		//Integer smallestValue = Integer.MAX_VALUE;
		//Character smallestKey = null;
		int smallestValue = Integer.MAX_VALUE;
		char smallestKey =0;
		for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
		    if (entry.getValue() < smallestValue) { //8<max int //1<8 //8<1 and so on
		        smallestKey = entry.getKey();
		        smallestValue = entry.getValue();
		    }
		    System.out.println(entry.getKey() + " " + entry.getValue());
		}
	System.out.println("First Repeated char  " + smallestKey + " with " + smallestValue);
	}

}
