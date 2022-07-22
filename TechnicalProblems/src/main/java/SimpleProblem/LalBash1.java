package SimpleProblem;

import java.util.HashSet;
import java.util.TreeSet;

public class LalBash1 {

	
	
	public static void main(String args[])
	{
		//Hashset is performance faster than Treeset
		//but hash set is unordered where as treeset is maintained sorted order
		//Treeset should not allow ,it will throw null pointer exception
		int[] a= {3,1,4,4,2,'c',100,0};
		TreeSet<Integer> t = new TreeSet<>();
		//HashSet<Integer> t = new HashSet<>();
		for (int i= 0;i<a.length;i++) {
		t.add(a[i]);
		}
		System.out.println(t);


	}
}
