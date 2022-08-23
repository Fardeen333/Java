package sets;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> fruits = new HashSet<String>();
//		
//		fruits.add("Apple");
//		fruits.add("Banana");
//		System.out.println(fruits.add("Kiwi"));
//		
//		System.out.println(fruits.add("Banana"));
//		
//		System.out.println(fruits);
		
//		 Set<String> fruits = new LinkedHashSet<String>();
//			
//			fruits.add("Apple");
//			fruits.add("Banana");
//			fruits.add("Kiwi");
//			
//			System.out.println(fruits);
		
//		

		Set<Integer> x = new HashSet<>();
		x.add(23);
		x.add(1);
		x.add(6);
		
		Set<Integer> y = new HashSet<>();
		y.add(3);
		y.add(1);
//		y.add(16);
		
		
		System.out.println(x.containsAll(y));
		
		

	}

}
