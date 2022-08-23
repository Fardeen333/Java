package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		int result=1;
		for (int i=1; i<=b; i++) {
			result*=a;
		}
		System.out.println(result);
		

	}

}
