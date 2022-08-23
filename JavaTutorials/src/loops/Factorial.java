package loops;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which the factorial is to be calculated : ");
		int n = sc.nextInt();
		int factorial=1;
		for(int i=n; i>=1; i--) {
			factorial=factorial*i;
		}
		System.out.println("The factorial of the give number is "+factorial);

	}

}
