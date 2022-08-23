package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String, Integer> numbers = new HashMap<>();
//		
//		numbers.put("One", 1);
//		numbers.put("Two", 2);
//		numbers.put("Five", 5);
		
//		numbers.put("One" , 10);
//		numbers.putIfAbsent("One", 10);
		
//		System.out.println(numbers.get("Two"));
		
//		System.out.println(numbers.get("Three"));
		
//		System.out.println(numbers.containsKey("Four"));
		
//		numbers.remove("Two",4);
		
//		System.out.println(numbers);
//		System.out.println(numbers.keySet());
//		System.out.println(numbers.values());
//		
//		System.out.println(numbers.entrySet());
//		
//		Set<Entry<String, Integer>> entries = numbers.entrySet();
//		
//		for(Entry<String, Integer> entry : entries) {
//			entry.setValue(entry.getValue()*100);
//		}
//		
//		System.out.println(numbers);
		
		System.out.println(getHash("GOD"));
		
	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i = 0; i< s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}

}
