package SimpleProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class T36_PrintDuplicateAtLast {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
//need to check
		int input[]= {1,2,5,6,2,2,5,8,7,7,8};
		int abc=input.length-1;
		int output[]=new int[abc];
		
		ArrayList arraylist1=new ArrayList();
		ArrayList arraylist2=new ArrayList();

		Map<Integer,Integer> map=new HashMap();
		for(int i=0;i<input.length;i++)
		{
			if(map.containsKey(input[i]))
			{
				map.put(input[i], map.get(input[i])+1);
			}else
			{
				map.put(input[i],1);
			}
		}
		for(Map.Entry<Integer, Integer> x:map.entrySet())
		{
			if(x.getValue()==1)
			{
				arraylist1.add(x.getKey());							
			}else
			{
				int l=x.getValue(); 
			
				while(0<l)
				{
					arraylist2.add(x.getKey());
					l--;
					
				}
				
			}
		
		}
		//System.out.println("Size :"+arraylist1.size());
		System.out.println(arraylist1);
		System.out.println(arraylist2);
		
//		//remove duplicates
//		arraylist1.removeAll(arraylist2);
//		System.out.println("After removing duplicates : "+arraylist1);
		
		//add duplicates at the last
		arraylist1.addAll(arraylist2);
		System.out.println("After adding duplicates at last :" +arraylist1);

		
		
		//		for(int i=0;i<input.length;i++)
//		{
//			arraylist1.add(input[i]); //list 1
//			int a=input[i];
//			for(int j=0;j<input.length;j++)
//			{
//				if(i==j)
//				{
//					continue;
//				}else
//				{
//				if(input[i]==input[j])	
//				{
//					arraylist2.add(input[i]); //list 2 //4th index //5th
//				}
//				}
//			}
//			
//		}
//		System.out.println("actual list1 ="+arraylist1);
//		System.out.println("actual list2 ="+arraylist2);
//
//		//remove duplicates
//		arraylist1.removeAll(arraylist2);
//		System.out.println("After removing duplicates : "+arraylist1);
//		
//		//add duplicates at the last
//		arraylist1.addAll(arraylist2);
//		System.out.println("After adding duplicates at last :" +arraylist1);
	}

}
	
