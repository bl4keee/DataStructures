package training;

import java.util.Arrays;

public class Arrayyy {

	public static void main(String[] args) {
		
		// Declaring arrays
		String[] cars = {"BMW", "Opel", "Mazda", "Mercedes"};
		int[] nums = {20, 30, 40, 10};
		
		// Printing both arrays
		System.out.print("The array of cars: ");
		System.out.println(Arrays.toString(cars));
		System.out.print("The array of numbers: ");
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		// Getting the second element of cars array
		System.out.print("The second element of the array of cars: ");
		System.out.println(cars[1]);
		
		// Getting the length of the array of cars
		System.out.print("The length of the array of cars: ");
		System.out.println(cars.length);
		
		// Looping through the array of cars with For-loop
		System.out.print("Looping through the array of cars with For-loop: ");
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		
		// Looping through the array of cars with For-each
		System.out.print("Looping through the array of cars with For-each loop: ");
		for(String i : cars) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		// Multidimensional arrays
		int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
		System.out.print("Multidimensional array: ");
		System.out.println(Arrays.deepToString(myNumbers));
		
		// Getting the third element of the second array from multidimensional arrays
		int x = myNumbers[1][2];
		System.out.print("The third element of the second array: ");
		System.out.println(x);
		
		// Looping through multidimensional array
		System.out.print("Looping through multidimensional array: ");
		for (int i = 0; i < myNumbers.length; ++i) {
			for (int j = 0; j < myNumbers[i].length; ++j) {
				System.out.print(myNumbers[i][j]);
			}
		}
	}

}
