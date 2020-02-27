import java.util.LinkedList;

public class LinkedListtt {

	public static void main(String[] args) {
		
		// Creating LinkedList
		LinkedList<String> list = new LinkedList<String>();
		
		// Adding elements to the list
		list.add("A");
		list.add("B");
		list.add("C");
		list.addLast("D");
		list.addFirst("E");
		list.add(3, "F");
		list.add("G");
		list.add("H");
		System.out.println("Linked list: " + list);
		
		// Removing elements from the list
		list.remove("A");
		list.remove(4);
		list.removeFirst();
		list.removeLast();
		System.out.println("Linked list after deletion: " + list);
		
		// Finding elemetns in the list
		boolean status = list.contains("B");
		
		if(status)
			System.out.println("List contains the element 'B' ");
		else 
			System.out.println("List does not contain the element 'B' ");

		// Getting number of elements in the linked list
		int size = list.size();
		System.out.println("The size of the linked list: " + size);
		
		// Get and set elements from linked list
		Object element = list.get(2);
		System.out.println("Element returned by get() : " + element);
		list.set(2, "P");
		System.out.println("Linked list after change: " + list);
		
	}

}
