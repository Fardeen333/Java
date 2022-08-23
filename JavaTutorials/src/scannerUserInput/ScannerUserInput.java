package scannerUserInput;

import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principle ammount:");
		int principle= sc.nextInt();
		
		System.out.println("Enter the rate:");
		float rate= sc.nextFloat();
		
		System.out.println("Enter the time:");
		int time= sc.nextInt();
		
		float simpleInterest= principle*rate*time/100;
		
		System.out.println("The simple interest is:"+simpleInterest);

	}

}
