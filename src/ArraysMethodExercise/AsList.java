package ArraysMethodExercise;

import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AsList {

	public static void main(String[] args) throws Exception {
		// asList method in Arrays class here this method is used for returning the
		// listed arrays of the given Array,
		// and once the listed array created we are not able to add or delete the item
		// in the array.
		// but it's possible when you create the empty array and using the add() method
		// to add the data to Array.

		// To declare the array and values.
		Integer[] a = new Integer[] { 10, 20, 30, 40 };

		// To create an object for returning the listed array.
		List<Integer> list = Arrays.asList(a);

		System.out.println("The return listed Value " + list);

		// if you want to add the values to the listed Item it's not possible for now
		// but it's possible when you
		// create the separate object for the List.

		// Initialize the empty list using constructor
		List<Integer> listOneInteger = new ArrayList<Integer>();
		List<String> listOneString = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 5 Integer value to add in Array List :");

		for (int i = 1; i <= 5; i++) {
			int b = scan.nextInt();
			listOneInteger.add(b);
		}

		System.out.println("Listed Integer Array " + listOneInteger);
		
		// creating the reading the string value from user using the BufferReader method in Java on io package.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a 5 String value to add in Array List :");

		for (int i = 1; i <= 5; i++) {
			String c = br.readLine();
			listOneString.add(c);
		}
		
		System.out.print(listOneString);

	}

}
