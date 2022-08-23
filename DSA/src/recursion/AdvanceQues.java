package recursion;
import java.util.*;
public class AdvanceQues {
	
	static Set<String> set = new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 0, 0},
//                {1, 0, 0, 1, 1, 0, 1, 1},
//                {1, 2, 2, 2, 2, 0, 1, 0},
//                {1, 1, 1, 2, 2, 0, 1, 0},
//                {1, 1, 1, 2, 2, 2, 2, 0},
//                {1, 1, 1, 1, 1, 2, 1, 1},
//                {1, 1, 1, 1, 1, 2, 2, 1},
//                };
	
//		floodFill(a, 0, 0, 9, 1);
//		printMatrix(a);
		
		permutation("abc", 0, 2);
		
//		int a[] = {1,5,7,3,2,4};
//		System.out.println(coinMax(a, 0, a.length-1));

	}
	
//	static int coinMax(int a[], int l, int r) {
//		if(l+1 == r) {
//			return Math.max(a[l], a[r]);
//		}
//		return Math.max(a[l] + Math.min(coinMax(a, l+2 , r), coinMax(a,l+1, r-1)),
//				a[r]+Math.min(coinMax(a, l+1 , r-1), coinMax(a,l, r-2)));
//	}
	
	static void permutation(String s, int l, int r) {
		if(l == r) {
			if(set.contains(s)) {
				return;
			}
			set.add(s);
			System.out.println(s);
			return;
		}
		
		for(int i =l ; i<= r; i++) {
			s= interchangeChar(s, l, i);
			permutation(s, l+1, r);
			s =interchangeChar(s, l, i);
		}
	}
	
	
	static String interchangeChar(String s, int a, int b) {
		char array[] = s.toCharArray();
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return String.valueOf(array);
	}
	
//	public static void floodFill(int a[][], int r , int c, int toFill, int prevFill) {
//		int rows = a.length;
//		int cols = a[0].length;
//		
//		if(r < 0 || r >= rows || c < 0 || c >= cols ) {
//			return;
//		}
//		
//		if(a[r][c] != prevFill) {
//			return;
//		}
//		
//		a[r][c]  = toFill;
//		
//		floodFill(a, r-1, c, toFill, prevFill);
//		floodFill(a, r+1, c, toFill, prevFill);
//		floodFill(a, r, c-1, toFill, prevFill);
//		floodFill(a, r, c+1, toFill, prevFill);
		
		
//	}
//	static void printMatrix(int a[][]) {
//		for(int[] array : a) {
//			for(int element : array) {
//				System.out.print(element + " ");
//			}
//			System.out.println();
//		}
//		
//		
//	}

}
