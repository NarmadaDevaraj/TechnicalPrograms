package TechnicalTheoryQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsAndArraySort {

	public static void main(String[] args) {
		
		//Createing ArrayList Object
		ArrayList<String> students = new ArrayList<>();
		//Adding elements to the ArrayList
		students.add("Jai");
		students.add("Manish");
		students.add("Vikram");
		students.add("Mahesh");
		students.add("Naren");
		//Print ArrayList
		System.out.println("ArrayList elements: " + students);
		// Print minimum value
		System.out.println("Minimum value: " + Collections.min(students));
		// print maximum value
		System.out.println("Maximum value: " + Collections.max(students));
		//sort the array
		Collections.sort(students);
		System.out.println("Sorted order :" + students);
		
		
		//*********Array Sort
		int arr[]= {1,3,2,4,2,5,0};
		String s[]= {"abc","xyz","df"};
		Arrays.sort(arr);
		Arrays.sort(s);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}

	}

}
