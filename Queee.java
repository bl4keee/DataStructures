import java.util.LinkedList;
import java.util.Queue;

public class Queee {

	public static void main(String[] args) {
		
		Queue<String> bbqline = new LinkedList<String>();
		
		bbqline.add("Jackson");
		bbqline.add("Tyreek");
		bbqline.add("Susan");
		
		// Print out the que
		System.out.println("The que: ");
		System.out.println(bbqline);
		System.out.println();
		
		// Taking the first person from the line
		bbqline.poll();
		System.out.println("Taking Jackson out of the que: ");
		System.out.println(bbqline);
		System.out.println();
		
		// Peeking - printing only first person (now Tyreek is first)
		System.out.println("Peeking: ");
		System.out.println(bbqline.peek());
		System.out.println();
		
		// Getting the size of the que
		System.out.println("Size of the que: ");
		System.out.println(bbqline.size());
		System.out.println();
		
		// If the que contains Susan
		System.out.println("Checking if the que contains Susan: ");
		System.out.println(bbqline.contains("Susan"));
		System.out.println();
		
		// If the que contains Jackson
		System.out.println("Checking if the que contains Jackson: ");
		System.out.println(bbqline.contains("Jackson"));
		System.out.println();
		
		// Converting que into Array
		System.out.println("Converting que into array and printing first element: ");
		System.out.println(bbqline.toArray()[0]);
		System.out.println();
		
		
		
		
		
	}

}
