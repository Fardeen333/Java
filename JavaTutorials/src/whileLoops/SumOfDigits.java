package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		int temp= n;
		while(temp != 0) {
			int remainder = temp%10;
			sum+=remainder;
			temp/=10;
		}
		System.out.println(sum);
		int noOfDigits = (int)(Math.log10(n) + 1);
		System.out.println(noOfDigits);

	}

}
