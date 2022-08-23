package h_hashing;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class D_HashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> m = new HashMap<>();
		m.put("gfg", 10);
		m.put("courses", 15);
		m.put("ide", 20);
		
		System.out.println(m);
		
		System.out.println(m.size());
		
		for(Map.Entry<String, Integer> e : m.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
//		System.out.println(m.remove("gfg"));  return the value associated with this key
		m.remove("gfg");
		System.out.println(m);
		
		System.out.println(m.containsKey("ide"));
		System.out.println(m.containsValue(20));
		
		System.out.println(m.get("ide"));
		System.out.println(m.get("hakunamatata"));
	}

}
