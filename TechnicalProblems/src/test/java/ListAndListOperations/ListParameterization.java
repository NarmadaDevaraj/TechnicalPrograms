package ListAndListOperations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListParameterization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//odered sequence
		//allow you to store duplicates and null
		
		//parameterized collections makes our code secure and error free
		
		//List<String> list=new ArrayList<String>(); //its a parameterized arraylist
		List<String> list=new ArrayList(); //its a parameterized arraylist
		
		System.out.println("Class of obj="+list.getClass());
		
		System.out.println();
		
		System.out.println("ArrayList class:"+(list instanceof ArrayList));
		System.out.println("List interface: "+(list instanceof List));
		System.out.println("Collection interface :"+(list instanceof Collection));
		System.out.println("Iterable interface :"+(list instanceof Iterable));
		
System.out.println();
		
		System.out.println("ArrayList class:"+(list instanceof ArrayList<?>));
		System.out.println("List interface: "+(list instanceof List<?>));
		System.out.println("Collection interface :"+(list instanceof Collection<?>));
		System.out.println("Iterable interface :"+(list instanceof Iterable<?>));
		
		
	}

}
