package TechnicalTheoryQuestions;

import java.util.ArrayList;

public class ArrayListProgram {
	
	/*
	 * 1)Dynamic in size . can able to resizing itself
	 * 2)ArrayList can hold both homogeneous and heterogeneous data elements
	 * 2)implements list interface 
	 * 3)manipulation is slow when remove or adding element because of memory shif
	 * 4)performs well when storing and accessing the elements
	 */

	 public static void main(String args[])
	    {
	        // Creating an ArrayList of Integer type
	 
		// Creating an ArrayList of Integer type
	        ArrayList<Integer> arrli
	            = new ArrayList<Integer>();
	 
	        // Appending the new elements
	        // at the end of the list
	        // using add () method via for loops
	        for (int i = 1; i <= 5; i++)
	            arrli.add(i);
	 
	        // Printing the ArrayList
	        System.out.println(arrli);
	 
	        // Removing an element at index 3
	        // from the ArrayList
	        // using remove() method
	        arrli.remove(3);
	 
	        // Printing the ArrayList after
	        // removing the element
	        System.out.println(arrli);

	    }	    
}