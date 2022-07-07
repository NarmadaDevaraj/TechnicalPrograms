package SimpleProblem;

import java.util.HashMap;
import java.util.Map;

public class T12_PrintRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Narmada has great Responsibilty ";
		//remove  the space
		String newInput=input.replaceAll(" ","");
		System.out.println("Modified string:"+newInput);
		//change string to char array
		char arr[]=newInput.toCharArray();
		
		int inputLength=arr.length;
		//map initialization
		Map<Character ,Integer> map =new HashMap();
		
		
		for(int i=0;i<inputLength;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
				
			}else
			{
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Character, Integer> x : map.entrySet())
		{
			if(x.getValue()!=1)
			{
				System.out.println(x.getKey() +":"+ x.getValue());
			}
		}
		
	}

}
