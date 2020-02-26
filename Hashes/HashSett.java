import java.util.HashSet;
import java.util.Iterator;

public class HashSett {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("lemur");
		set.add("monkey");
		set.add("spider");
		
		// Printing the whole HashSet
		System.out.println("Printing HashSet: ");
		System.out.println(set + "\n");
		
		// Removing spider
		System.out.println("Removing spider...");
		set.remove("spider");
		System.out.println(set + "\n");
		
		// Getting size of the HashSet
		System.out.println("The size of the HashSet is: ");
		System.out.println(set.size());
		System.out.println("Because the HashSet is: " + set + "\n");
		
		// Checking if HashSet contains "lemur"
		System.out.println("Checking if HashSet contains lemur: ");
		System.out.println(set.contains("lemur") + "\n");
		
		// Checking if HashSet is empty
		System.out.println("Checking if HashSet is empty: ");
		System.out.println(set.isEmpty() + "\n");
		
		// Adding one more element to the HashSet
		System.out.println("Adding dog to the HashSet: ");
		set.add("dog");
		System.out.println("The new HashSet is: ");
		System.out.println(set + "\n");
		
		// Declaring another HashSet
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(13);
		set2.add(24);
		set2.add(5);
		System.out.println("The new HashSet of Integers is: ");
		System.out.println(set2 + "\n");
		
		// Turning HashSet into Array
		System.out.println("Turning the HashSet into array: ");
		Object[] set2array = set2.toArray();
		System.out.println(set2array[0] + "\n"); // index 0 is last element!
		
		// Getting the HashCode of the HashSet
		System.out.println("The HashCode of this HashSet is: ");
		System.out.println(set2.hashCode() + "\n");
		
		// Iterating through HashSet
		System.out.println("Iterating through HashSet: ");
		Iterator it = set2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); // first is last!!!
		}
		System.out.println();

	}

}
