package f_sorting.collectionSort;

import java.util.ArrayList;

import java.util.Collections;

public class A_Basics {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(1);
		list.add(6);
		list.add(5);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		

	}

}
