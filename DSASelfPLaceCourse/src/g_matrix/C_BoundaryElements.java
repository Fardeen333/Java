package g_matrix;

public class C_BoundaryElements {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int brr[][] = {{1,2,3,4},{5,6,7,8}};
		int crr[][] = {{1,2,3,4}};
		int drr[][] = {{1},{2},{3}};
		int err[][] = {{1,2},{3,4},{5,6}};
		boundaryPrint(arr, 4, 4);
		boundaryPrint(brr, 2, 4);
		boundaryPrint(crr, 1, 4);
		boundaryPrint(drr, 3, 1);
		boundaryPrint(err, 3, 2);
		

	}
	
	public static void boundaryPrint(int arr[][], int r , int c) {
		
		if(r==1) {
			for(int i=0; i<c; i++) {
				System.out.print(arr[0][i]+" ");
			}
		}else if(c == 1) {
			for(int i=0; i<r; i++){
				System.out.print(arr[i][0]+" ");
			}		
		}else {
			for(int j=0; j<c;j++) {
				System.out.print(arr[0][j]+" ");
			}
			for(int j=1; j<=r-2; j++) {
				System.out.print(arr[j][c-1]+" ");
			}
			for(int j=c-1; j>=0; j--) {
				System.out.print(arr[r-1][j]+" ");
			}
			for(int j=r-2; j>=1; j--) {
				System.out.print(arr[j][0]+" ");
			}
		}
		System.out.println();
		
	}

}
