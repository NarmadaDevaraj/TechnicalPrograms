package SimpleProblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintNonDuplicateNum {

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<Integer, Integer> map=new HashMap();
		int arr[]={1,1,2,1,3,1,2,4,2,6,7};
		int inputLeng=arr.length;
		for(int i=0;i<arr.length;i++)
		{
            if (map.containsKey(arr[i])) //This method returns true if some key equal to the key exists within the map, else return false.
            {
                map.put(arr[i], map.get(arr[i]) + 1);//incrementing the key value
            }else
            {
            	map.put(arr[i], 1);
            }
		}
		 for(Map.Entry<Integer, Integer> x : map.entrySet())//It is used to return a collection view of the mappings contained in this map.
		 {
         if (x.getValue() == 1)
             System.out.print(x.getKey() + " ");
		 }
 }
		//System.out.println(set);
	}

