package h_hashing;

import java.util.HashSet;
import java.util.Iterator;

public class C_HashSet {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("gfg");
		hs.add("courses");
		hs.add("ide");
		
		
		
		System.out.println(hs);
		System.out.println(hs.contains("ide"));
		
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.println(hs.size());
		hs.remove("gfg");
//		System.out.println(hs.remove("gfg"));  return false
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.clear();
		System.out.println(hs.size());

	}

}
