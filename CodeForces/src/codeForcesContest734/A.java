package codeForcesContest734;

import java.util.ArrayList;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long n = sc.nextLong();
			
			ArrayList<Long> al = number(n);
			for(long x: al) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
	}
	
	public static ArrayList<Long> number(long n) {
		long x = n/3;
		long one = x;
		long two = x;
		
		ArrayList<Long> al = new ArrayList<>();
		long res = (one*1+two*2);
		while(n != res) {
			if((n-res) == 1) {
				one++;
				res+=1;
			}else if(n-res == 2){
				two++;
				res+=2;
			}else {
				one++;
				two++;
				res+=3;
			}
		}
		
		al.add(one);
		al.add(two);
		
		return al;
		
	}

}
