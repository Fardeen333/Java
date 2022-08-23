package g_matrix;

public class G_SearchingInRowAndColumnSortedMatrix {

	public static void main(String[] args) {
		int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
	
		searching(arr, arr.length, arr[0].length, 29);
		searching(arr, arr.length, arr[0].length, 24);
		
		
		searching1(arr, arr.length, arr[0].length, 48);
		searching1(arr, arr.length, arr[0].length, 32);
		searching1(arr, arr.length, arr[0].length, 20);
		searching1(arr, arr.length, arr[0].length, 24);
	}

	
	//Naive Approach O(r*c) time and O(1) space
	public static void searching(int arr[][], int r, int c, int x) {
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(arr[i][j] == x) {
					System.out.println("Found at ("+i+","+j+")");
					return;
				}
			}
		}
		System.out.println("Not Found");	
	}
	
	//Efficient Approach O(r+c) time and O(1) space
	public static void searching1(int arr[][], int r, int c, int x) {
		int i=0; int j=c-1;
		while(i<r && j>=0) {
			if(arr[i][j] == x) {
				System.out.println("Found at ("+i+","+j+")");
				return;
			}else if(arr[i][j] > x) {
				j--;
			}else {
				i++;
			}
		}
		System.out.println("Not Found");
	}
	

}
