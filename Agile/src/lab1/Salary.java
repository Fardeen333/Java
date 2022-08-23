package lab1;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double monthlySalary;
		double annualSalary;
		double increment;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your monthly Salary: "); 
		monthlySalary=sc.nextDouble();
		
		if(monthlySalary < 100000) {
			annualSalary= monthlySalary*12;
			increment = annualSalary * 0.15;
			System.out.println("Percentage Increment is: " +increment);
		}else if ( monthlySalary>=100000 && monthlySalary<=200000) {
			annualSalary= monthlySalary*12;
			increment = annualSalary * 0.10;
			System.out.println("Percentage Increment is: " +increment);
		}else {
			annualSalary= monthlySalary*12;
			increment = annualSalary*0.05;
			System.out.println("Percentage Increment is: " +increment);
		}
		
		
	}

}
