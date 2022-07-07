package SimpleProblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class T31_RemoveDuplicateCharFromString {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Narmada";

		for(char i: s.toCharArray())
		{
			if(s.indexOf(i)==s.lastIndexOf(i))
			{
				System.out.println(i);
			}
		}
		
//
//		Map<Character,Integer> map=new HashMap();
//		
//		for(int i=0;i<s.length();i++)
//		{
//			if(map.containsKey(s.charAt(i)))
//			{
//				map.put(s.charAt(i), map.get(s.charAt(i))+1);	
//			}else
//			{
//				map.put(s.charAt(i), 1);
//			}
//			
//		}
//		for(Map.Entry<Character, Integer> x:map.entrySet())
//		{
//			
//			if(x.getValue()!=1)
//			{
//				System.out.println(map);
//				//map.remove(x.getKey());
//			}
//		}
//		System.out.println(map);
	}
}
