package o_BInarySearchTree;

import java.util.Iterator;
import java.util.TreeSet;

public class F_TreeSetInJava {
	
	public static void main(String args[]) {
		
//		TreeSet<String> s = new TreeSet<>();
//		s.add("gfg");
//		s.add("courses");
//		s.add("ide");
//		
//		System.out.println(s);
//		
//		s.add("ide");
//		
//		System.out.println(s);
//		System.out.println(s.contains("ide"));
//		Iterator<String> i = s.iterator();
//		while(i.hasNext()) {
//			System.out.print(i.next()+" ");
//		}
//		System.out.println();
//		
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		ts.add(10);
//		ts.add(5);
//		ts.add(2);
//		ts.add(15);
//		System.out.println(ts);
////		ts.remove(5);
////		System.out.println(ts);
//		
//		System.out.println(ts.lower(5));
//		System.out.println(ts.higher(5));
//		System.out.println(ts.floor(5));
//		System.out.println(ts.ceiling(5));
		
//		System.out.println(ts.headSet(15).size());
		
		int arr[] = {10 ,6 ,9 ,7 ,20 ,19 ,21 ,18 ,17 ,16};
		System.out.println(fill(arr, arr.length, 0));
		
	}
	
	public static int fill(int arr[], int n, int res) {
	    TreeSet<Integer> s = new TreeSet<>();
	    s.add(arr[n-1]);
	    res = 0;
	    for(int i=n-2; i>=0; i--){
	        int smaller = s.headSet(arr[i]).size();
	        System.out.println(smaller);
	        res = Math.max(res, smaller);
	    }
	    return res;
	    
	}

}
