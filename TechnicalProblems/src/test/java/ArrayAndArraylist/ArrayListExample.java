package ArrayAndArraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//list is ordered collection of object ,contains duplicates
		//ArrayList arraylist=new ArrayList();  //instanse of list interface //ordered collection //hetrogenious //dynamically changing size
		List arraylist=new ArrayList();
		//Collection arraylist=new ArrayList(); //list interface derives from the collection
		
		System.out.println("class ="+arraylist.getClass());
		//System.out.println("List interface="+arraylist instanseof);
		System.out.println("output="+arraylist.isEmpty());
		
		arraylist.add("nimmy");
		arraylist.add("narmada");
		arraylist.add("guru");
		arraylist.add(26);
		
		System.out.println("added: rep arraylist="+arraylist);
		System.out.println();
		
		arraylist.remove("nimmy");
		System.out.println("remove: rep arraylist="+arraylist);
		
		arraylist.contains("narmada");
		System.out.println("contains: rep arraylist ="+arraylist);
	}

}
