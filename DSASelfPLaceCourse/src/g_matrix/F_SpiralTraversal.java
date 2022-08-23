package g_matrix;

public class F_SpiralTraversal {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int brr[][] = {{1,2,3},{4,5,6}};
		int crr[][] = {{10,20,30}};
		int drr[][] = {{10},{20},{30}};
		
		spiralTraversal(arr, arr.length, arr[0].length);
		spiralTraversal(brr, brr.length, brr[0].length);
		spiralTraversal(crr, crr.length, crr[0].length);
		spiralTraversal(drr, drr.length, drr[0].length);
		

	}
	//O(r*c) time and O(1) space
	public static void spiralTraversal(int arr[][], int r, int c) {
		int top = 0;
		int right = c-1;
		int bottom = r-1;
		int left = 0;
		while(top<=bottom && left<=right) {
			for(int i=left; i<=right; i++) {
				System.out.print(arr[top][i]+" ");
			}
			top++;
			for(int i=top; i<=bottom; i++) {
				System.out.print(arr[i][right]+" ");
			}
			right--;
			if(top<=bottom) {
				for(int i=right; i>=left; i--) {
					System.out.print(arr[bottom][i]+" ");
				}
				bottom--;
			}
			if(left<=right) {
				for(int i=bottom; i>=top; i--) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
			}
			
		}
		System.out.println();
	}
}
