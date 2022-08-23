package whileLoops;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 1;
		do {
			n= sc.nextInt();
			System.out.println("n is "+n);
		}while(n !=0);
	}

}
