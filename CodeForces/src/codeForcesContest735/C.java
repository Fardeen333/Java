package codeForcesContest735;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while(t-->0) {
				
				long n = sc.nextLong();
				long m = sc.nextLong();
				
				missing(n , m);
				
			}
		}
	}
	
	public static void missing(long n, long m) {
		ArrayList<Long> al = new ArrayList<>();
		if(Math.abs(n-m) == 1) {
			System.out.println(1);
			return;
		}
		for(long i=0; i<=m; i++) {
			al.add(n^i);
		}
		long res = 0;
		Collections.sort(al);
		for(long i=0; i<al.size(); i++) {
			if(!al.contains(al.get((int) i)+1)) {
				res = al.get((int)i)+1;
				break;
			}
	
		}
		System.out.println(res);
	}

	

}
