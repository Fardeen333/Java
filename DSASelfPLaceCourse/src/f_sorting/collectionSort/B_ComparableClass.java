package f_sorting.collectionSort;

import java.util.ArrayList;
import java.util.Collections;

public class B_ComparableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(new Point(10,20));
		list.add(new Point(3,12));
		list.add(new Point(5,7));
		Collections.sort(list, Collections.reverseOrder());
		for(Point p: list) {
			System.out.println(p.x+" "+p.y);
		}

	}

}

class Point implements Comparable<Point>{
	
	int x; 
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		return this.x - o.x;
	}
	
}
