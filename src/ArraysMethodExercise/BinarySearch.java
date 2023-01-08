package ArraysMethodExercise;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// Binary Search Method.
		
		// create the array's for each data type, these values are we getting from user.
		int intValue[] = {10,20,30,40,50};
		byte byteValue[] = {1,2,3,4,5};
		char charValue[] = {'a','e','i','o','u'};
		
		// to check if the Array have the respected value.
		int intKey = 10;
		byte byteKey = 3;
		char charKey = 'u';
		
		System.out.println(Arrays.binarySearch(byteValue, byteKey));
		System.out.println(Arrays.binarySearch(charValue, charKey));
		System.out.println(Arrays.binarySearch(intValue, intKey));
		
	}

}
