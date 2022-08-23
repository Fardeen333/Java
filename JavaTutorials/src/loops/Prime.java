package loops;

import java.util.Scanner;
// if a number has any factor one of its lies between the range 1 to root n
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked for prime or not : ");
		int n = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i*i<=n; i++) {
			if (n%i==0) {
				isPrime=false;
				break;
			}
		}
		if(n<2) {isPrime= false;}
        if(isPrime) {
        	System.out.println(n+" is a prime number");
        }else {
        	System.out.println(n+" is not a prime number");
        }
        
	}

}
