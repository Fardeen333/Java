package augustLongChallenge;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = 0;
			int b = 0;
			for(int i=1; i<=3; i++) {
				a+=sc.nextInt();
			}
			for(int i=1; i<=3; i++) {
				b+=sc.nextInt();
			}
			if(a>b) {
				System.out.println(1);
			}else {
				System.out.println(2);
			}
		}

	}
	
	

}
