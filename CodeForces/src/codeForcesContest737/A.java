package codeForcesContest737;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int max = Integer.MIN_VALUE;
			double sum = 0;
			boolean first = true;
			int l = n;
			while(n>0) {
				int i = sc.nextInt();
				if(i>max) {
					if(first) {
						max = i;
						first = false;
					}else {
						sum += max;
						max = i;
					}
				}else {
					sum+=i;
				}
				n--;
			}
			sum = sum/(l-1);
			DecimalFormat df = new DecimalFormat("0.000000000");
			System.out.println(df.format(max+sum));
		}

	}

}
