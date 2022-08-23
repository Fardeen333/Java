package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = new LinkedList<>();
		
		List<String> vegetables = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Hi");
		
//		vegetables.add("Potato");
//		vegetables.add("Tomato");
//		vegetables.add("Peas");
//		
//		fruits.addAll(vegetables);
		
//		List<String> toRemove = new ArrayList<>();
//		toRemove.add("Apple");
//		toRemove.add("Hi");
		
//		fruits.clear();
		
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);
		for(String e : temp) {
			System.out.println(e);
		}
		System.out.println(fruits.contains("Apple"));
		
//		System.out.println(fruits.contains("Banana"));
		
//		ArrayList<Integer> marks = new ArrayList<>();
//		
//		Pair<String , Integer> p1 = new Pair<>("Anuj",457);
//		Pair<Boolean , String> p2 = new Pair<>(true , "Hello");
////		
//		p1.getDescription();
//		p2.getDescription();
	}

}
