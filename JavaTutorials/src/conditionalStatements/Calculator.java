package conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first operand:");
		int a = sc.nextInt();
		System.out.println("Enter second operand:");
		int b = sc.nextInt();
		System.out.println("Enter the operation you want to perform:");
		sc.nextLine();
		char operator = sc.nextLine().charAt(0);
		switch(operator) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
		default:
			System.out.println("you have entered an invalid operation");
		}
		System.out.println("The result is "+ result);

	}

}
