package training;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListtt {

	public static void main(String[] args) {
		
		// Declarations
		ArrayList<String> cars = new ArrayList<String>();
		
		// Adding items to the ArrayList
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("Mazda");
		cars.add("Ford");
		
		// Printing ArrayList
		System.out.print("ArrayList: ");
		System.out.println(cars);
		
		// Getting the size of the ArrayList
		System.out.print("ArrayList size: ");
		System.out.println(cars.size());
		
		// Access an item
		System.out.print("Accessing the first item: ");
		System.out.println(cars.get(0));
		
		// Change an item
		System.out.print("Changing the second item: ");
		cars.set(1, "Mercedes");
		System.out.println(cars);
		
		// Remove an item
		System.out.print("Removing the third item: ");
		cars.remove(2);
		System.out.println(cars);
		
		// Clear an ArrayList
		System.out.print("Removing all the items from ArrayList: ");
		cars.clear();
		System.out.println(cars);
		
		
		// Adding items for loop example
		System.out.print("Looping through with 'for loop': ");
		cars.add("Fiat");
		cars.add("Opel");
		cars.add("Reanult");
		for (int i = 0; i < cars.size(); i ++) {
			System.out.print(cars.get(i) + " ");
		}
		System.out.println();
		
		// For each loop
		System.out.print("Looping through with 'for each loop': ");
		for(String i : cars) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////////
		
		// Creating new ArrayList of Integeres
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		myNums.add(11);
		myNums.add(20);
		myNums.add(17);
		myNums.add(7);
		System.out.print("The new array of Integers: ");
		System.out.println(myNums);
		
		// Looping through array
		System.out.print("Looping through with 'for each loop': ");
		for (int i : myNums) {
			if (i != myNums.size() - 1) {
				System.out.print(i + " ");
		}
		}
		
		System.out.println();
	
		// Sorting an ArrayList
		System.out.print("Sorting ArrayList myNums: ");
		Collections.sort(myNums);
		System.out.println(myNums);
		
	}

}
