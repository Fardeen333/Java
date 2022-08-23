import java.util.Arrays;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,9,6,1,96,84,103,17,16,3};
		
		int b[] = returnArray(a);
		System.out.println("The sorted array is :");
		for(int item : b) {
			System.out.print(item +" ");
		}
		
	}
	
	public static int[] returnArray(int a[]) {
		Arrays.sort(a);
		return a;
	}
}
