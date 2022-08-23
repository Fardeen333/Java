package g_matrix;

public class A_General {

	public static void main(String[] args) {
//		int arr[][] = new int [5][5];
		int arr[][] = {{1,2,3},
				{4,5,6},
				{7,8}};
		print(arr);
//		System.out.println(arr[1][2]);
//		System.out.println(arr[2][2]);
	}
	
	public static void print(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
