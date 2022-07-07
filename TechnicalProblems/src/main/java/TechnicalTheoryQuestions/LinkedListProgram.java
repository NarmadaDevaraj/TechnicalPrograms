package TechnicalTheoryQuestions;

import java.util.LinkedList;

public class LinkedListProgram {
	/*
	 * //**
	 * 1)Manipulation fast because there is no concept of memory shifting
	 * 2)Implements List and deque interface 
	 * 3)works well when application demands manipulation of stored data.
	 */
    public static void main(String args[])
    {
 
        // Creating an object of the
        // class linked list
        LinkedList<String> object
            = new LinkedList<String>();
 
        // Adding the elements to the object created
        // using add() and addLast() method
 
        // Custom input elements
        object.add("A");
        object.add("B");
        object.addLast("C");
 
        // Print the current LinkedList
        System.out.println(object);
 
        // Removing elements from the List object
        // using remove() and removeFirst() method
        object.remove("B");
        object.removeFirst();
 
        System.out.println("Linked list after "
                           + "deletion: " + object);
    }


}
