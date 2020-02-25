import java.util.HashMap;

public class HashMappp {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String> ();
		map.put("Bob", "FluffyP0nies");
		map.put("Katy", "diblle");
		map.put("Marley", "balleiash");
		
		// Printing HashMap
		System.out.println("Printing whole HashMap: \n" + map + "\n");
		
		// Printing only keys of HashMap
		System.out.println("Printing only keys: \n" + map.keySet() + "\n");
		
		// Printing only values of HashMap
		System.out.println("Printing only keys: \n" + map.values() + "\n");
		
		// Replacing "Bob" key with "John"
		map.replace("Bob", "John");
		System.out.println("Replacing Bob's value to John instead of FluffyP0nies and printing:");
		System.out.println(map + "\n");
		
		// Printing the value of key "Bob"
		System.out.println("Printing the value of key Bob: ");
		System.out.println(map.get("Bob") + "\n");
		
		// Removing "Bob" from the HashMap
		map.remove("Bob");
		System.out.println("Removing Bob from the HashMap: ");
		System.out.println(map + "\n");
		
		// Checking if HashMap contains key Katy
		System.out.println("Checking if HashMap contains key Katy: ");
		System.out.println(map.containsKey("Katy") + "\n");
		
		// Checking if HashMap contains value dibble
		System.out.println("Checking if HashMap contains key diblle: ");
		System.out.println(map.containsValue("diblle") + "\n");
		
		// Checking the size of the HashMap
		System.out.println("Checking the size of the HashMap: ");
		System.out.println(map.size());
		System.out.println("Because the HashMap is: " + map + "\n");
		
		// Getting the value of key Marley
		System.out.println("Getting the value of key Marley: ");
		System.out.println(map.get("Marley") + "\n");
		
		// Changing the key from Marley to Harvey
		Object obj = map.remove("Marley");
		map.put("Harvey", (String) obj);
		System.out.println("Changing the key from Marley to Harvey: ");
		System.out.println(map);
		
	}

}
