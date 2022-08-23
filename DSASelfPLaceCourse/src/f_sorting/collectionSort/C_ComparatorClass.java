package f_sorting.collectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class C_ComparatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Point1> list = new ArrayList<Point1>();
		list.add(new Point1(10,20));
		list.add(new Point1(3,12));
		list.add(new Point1(5,7));
		Collections.sort(list, new MyComparator());
		for(Point1 p: list) {
			System.out.println(p.x+" "+p.y);
		}

	}

}

class Point1{
	
	int x; 
	int y;
	
	Point1(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class MyComparator implements Comparator<Point1>{

	@Override
	public int compare(Point1 o1, Point1 o2) {
		// TODO Auto-generated method stub
		return o1.x - o2.x;
	}
	
} 
