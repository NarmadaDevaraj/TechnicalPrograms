package SimpleProblem;

import java.util.HashMap;
import java.util.Map;

public class T10_DuplicateCity {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap();
		
		String arr[]= {"chennai","kolkatta","mumbai","chennai"};
		int inputLeng=arr.length; //array  so arr.length
//		String a="Narmada";
//		a.length(); //string so a.length();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}else
			{
				map.put(arr[i],1);
			}
		}
		
		for(Map.Entry<String,Integer> x:map.entrySet())
		{
			if(x.getValue()!=1)//here filtering  duplicates
			{
				System.out.println(x.getKey());
			}
		}
	}

}
