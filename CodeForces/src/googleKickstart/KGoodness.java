package googleKickstart;

import java.util.*;

public class KGoodness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i = 1; i<=testCases; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			int X = checkGoodness(s);
//			System.out.println(K-count);
			if(X == K) {
				System.out.println("0");
			}else if(K>X) {
				System.out.println(K-X);
			}else if(X>K) {
				System.out.println(X-K);
			}
		}
		
		
		

	}
	
	public static int checkGoodness(String s) {
		int count = 0;
		int length = s.length();
		if(length%2 == 0) {
			for(int i = 0; i<length/2; i++) {
				if(s.charAt(i)!=s.charAt(length-1-i)) {
					count+=1;
				}else {
					continue;
				}
			}
		}
		if(length%2 != 0) {
			for(int i =0; i<(length/2);i++) {
				if(s.charAt(i)!=s.charAt(length-1-i)) {
					count+=1;
				}else {
					continue;
				}
			}
		}
		return count;
	}

}
