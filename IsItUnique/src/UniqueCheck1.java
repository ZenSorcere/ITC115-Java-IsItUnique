//*******************************************************************
//	ITC 115 - Assignment 8, part 2 - isUnique method
//  a method named isUnique that takes an array of integers as a parameter
//  and that returns a boolean value indicating whether or not the values
//  in the array are unique (true for yes, false for no). The values in the
//  list are considered unique if there is no pair of values that are equal.
//  A list of 0 or 1 elements would be considered unique.
//
//	By: Mike Gilson
//	Date: 2/29/2020
//*******************************************************************

public class UniqueCheck1 {

		public static void main(String[] args) {
//  create test arrays borrowed from PracticIt tests.
			int[] test1 = {2, 4, 6};
			int[] test2 = {};
			int[] test3 = {1};
			int[] test4 = {1, 3, 3};
			int[] test5 = {2, 4, 6, 8, 10, 12, -2, -4};
			int[] test6 = {2, 4, 6, 8, 10, 12, -2, -4, 2};
			
//  run test arrays through isUnique method, with expected result in comments.			
			System.out.println("Is test1 Unique? " + isUnique(test1)); // true
			System.out.println("Is test2 Unique? " + isUnique(test2)); // true
			System.out.println("Is test3 Unique? " + isUnique(test3)); // true
			System.out.println("Is test4 Unique? " + isUnique(test4)); // false
			System.out.println("Is test5 Unique? " + isUnique(test5)); // true
			System.out.println("Is test6 Unique? " + isUnique(test6)); // false		
		}  // end main
		
/*  method created that takes an integer array as a parameter. a nested for loop 
 * 	starts by going through each int in the array and compare it to all but itself.
 *  the outer for loop begins at the beginning of the array, and for each int in 
 *  the array, goes through the inner for loop, starting with the second int in the
 *  array, and runs the if statement which will check if the first int matches the
 *  second int, and so on. If the if statement is true, it returns false, indicating
 *  the array has a duplicate.
 *  Once the inner loop completes, the outer loop will iterate to the second int in
 *  the array, and the inner for  loop will compare the rest of the array items,
 *  starting with the third int.
 *  Once the outer loop is completed and no duplicates are found, it will return true.	
 */
		public static boolean isUnique (int[] list) {
			for (int i = 0; i < list.length; i++) {
				for (int j = i+1; j < list.length; j++) {
					if (list[i] == list[j]) {
						return false;
					}  // end if
				} // end inner for loop
			}  // end outer for loop
			return true;
		} // end isUnique method

	} // end class