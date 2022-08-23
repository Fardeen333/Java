package arrays;

import java.util.Scanner;

public class AverageMatksOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		int average= 0;
		int marks[] = new int[n];
		for(int i =0; i<n ;i++) {
			marks[i]=sc.nextInt();
			average += marks[i];
		}
			average/=n;
		System.out.println(average);
		

	}

}
