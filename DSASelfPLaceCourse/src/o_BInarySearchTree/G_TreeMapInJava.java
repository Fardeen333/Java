package o_BInarySearchTree;


import java.util.TreeMap;

public class G_TreeMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(10, "geeks");
		tm.put(15, "ide");
		tm.put(5, "courses");
		
		System.out.println(tm);
		System.out.println(tm.containsKey(10));
//		for(Map.Entry<Integer, String> e: tm.entrySet()) {
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
		
//		tm.remove(10);
		System.out.println(tm.size());
		
		System.out.println(tm.higherKey(10));
		System.out.println(tm.lowerKey(10));
		System.out.println(tm.floorKey(10));
		System.out.println(tm.ceilingKey(10));
		
		System.out.println(tm.higherEntry(10).getValue());
		System.out.println(tm.lowerEntry(10).getValue());
		System.out.println(tm.floorEntry(10).getValue());
		System.out.println(tm.ceilingEntry(10).getValue());
		
	}

}
