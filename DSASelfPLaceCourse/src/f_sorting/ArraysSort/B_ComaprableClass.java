package f_sorting.ArraysSort;

import java.util.Arrays;
import java.util.Collections;

public class B_ComaprableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point arr[] = {new Point(10,20), new Point(3,12), new Point(5,7)};
		Arrays.sort(arr);
		
		for(Point p: arr) {
			System.out.println(p.x+" "+p.y);
		}
//		Arrays.sort(arr, Collections.reverseOrder());
//		for(Point p: arr) {
//			System.out.println(p.x+" "+p.y);
//		}

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
