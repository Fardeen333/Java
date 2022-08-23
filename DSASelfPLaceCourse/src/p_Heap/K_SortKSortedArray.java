package p_Heap;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class K_SortKSortedArray {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(5);
		al2.add(15);
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(1);
		al3.add(9);
		al3.add(11);
		al3.add(18);
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		al.add(al1);
		al.add(al2);
		al.add(al3);
		sortKsortedArrays(al);
		
		

		sortKSortedArrays1(al);
		
		
		
		sortKSOrtedArrays2(al);
		
	}
	
	//Super Naive Solution O(nk*log(nk)) time 
	public static void sortKsortedArrays(ArrayList<ArrayList<Integer>> al) {
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=0; i<al.size(); i++) {
			for(int j=0; j<al.get(i).size(); j++) {
				res.add(al.get(i).get(j));
			}
		}
		Collections.sort(res);
		System.out.println(res);
	}
	
	
	//Naive Approach
	//O(n + 2n + 3n + ... kn) = O(nk^2) time and O(nk) space
	public static void sortKSortedArrays1(ArrayList<ArrayList<Integer>> al) {
		ArrayList<Integer> final_res = new ArrayList<>();
		for(int i=0; i<al.size(); i++) {
			ArrayList<Integer> res = new ArrayList<Integer>();
			mergeTwoSortedArray(final_res, al.get(i), final_res.size(), al.get(i).size(), res);
			final_res = res;
		}
		System.out.println(final_res);
	}
	
	public static void mergeTwoSortedArray(ArrayList<Integer> al, ArrayList<Integer> bl, int n1, int n2, ArrayList<Integer> res){
		int i=0;
		int j=0;
		while(i<n1 && j <n2) {
			if(al.get(i) <= bl.get(j)) {
				res.add(al.get(i));
				i++;
			}else {
				res.add(bl.get(j));
				j++;
			}
		}
		while(i<n1) {
			res.add(al.get(i));
			i++;
		}
		while(j < n2) {
			res.add(bl.get(j));
			j++;
		}
	}
	
	//Efficient Approach O(nklogk) time and O(k) space
	public static void sortKSOrtedArrays2(ArrayList<ArrayList<Integer>> al) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		PriorityQueue<Triplets> pq = new PriorityQueue<>();
		for(int i=0; i<al.size(); i++) {
			pq.add(new Triplets(al.get(i).get(0),i,0));
		}
		while(!pq.isEmpty()) {
			Triplets curr = pq.poll();
			res.add(curr.value);
			int ap = curr.array_index;  // ap == array position
			int vp = curr.val_index;    // vp == value Position
			if(vp+1 < al.get(ap).size()) {
				pq.add(new Triplets(al.get(ap).get(vp+1), ap, vp+1));
			}
		}
		System.out.println(res);
	}

}

class Triplets implements Comparable<Triplets>{
	int value;
	int array_index;
	int val_index;
	
	Triplets(int value, int array_index, int val_index){
		this.value = value;
		this.array_index = array_index;
		this.val_index = val_index;
	}

	@Override
	public int compareTo(Triplets o) {
		// TODO Auto-generated method stub
		return this.value-o.value;
	}
}