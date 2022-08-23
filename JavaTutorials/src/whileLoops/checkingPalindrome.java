package whileLoops;

import java.util.Scanner;

public class checkingPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n;
		int newNumber=0;
		while(temp!=0) {
			int remainder = temp%10;
			newNumber=newNumber*10+remainder;
			temp/=10;
		}
		if(n==newNumber) {
			System.out.println("The entered number " + n +" is a palindrome");
		}else {
			System.out.println("The entered number " + n +" is not a palindrome");
		}

	}

}
