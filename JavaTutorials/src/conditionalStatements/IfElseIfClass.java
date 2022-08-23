package conditionalStatements;
import java.util.Scanner;
public class IfElseIfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int number;
//		Scanner sc = new Scanner(System.in);
//		number=sc.nextInt();
//		if(number<=10) {
//			System.out.println("NO. is less than 10");
//		}else if(number>10 && number<=20){
//			System.out.println("NO. is lying between 10 and 20");
//		}else if(number>20 && number<=30){
//			System.out.println("NO. is lying between 20 and 30");
//		}else {
//			System.out.println("No. is greater than 30");
//		}
        int a=15;
        int b=28;
        int c= 0;
        c= (a > b)? a : b;
        System.out.println("max of both number is "+ c);
	}

}
