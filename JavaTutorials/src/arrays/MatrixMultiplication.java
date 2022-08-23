package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of Matrix 1 ");
		int rows1= sc.nextInt();
		int cols1= sc.nextInt();
		int a[][] = new int[rows1][cols1];
		
		System.out.println("Enter the dimensions of matrix 2 ");
		int rows2 = sc.nextInt();
		int cols2 = sc.nextInt();
		int b[][] = new int[rows2][cols2];
		
		for(int i =0 ; i< rows1; i++) {
			for( int j = 0; j< cols1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i =0 ; i< rows2; i++) {
			for( int j = 0; j<cols2; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		int c[][] = new int[rows1][cols2];
		for(int i =0 ; i<rows1; i++) {
			for (int j=0 ; j < cols2; j++ ) {
				c[i][j]=0;
				for(int k= 0; k< rows2; k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		for(int i= 0; i<rows1; i++) {
			for(int j=0; j<cols2; j++) {
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		}		

	}

}
