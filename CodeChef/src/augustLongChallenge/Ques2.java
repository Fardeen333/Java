package augustLongChallenge;

import java.util.*;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			HashSet<Integer> hm = new HashSet<>();
			for(int i=0; i<4; i++) {
				int x = sc.nextInt();
				hm.add(x);
			}
			if(hm.size() == 4) {
				System.out.println(2);
			}else if(hm.size() == 3){
				System.out.println(1);
			}else if(hm.size() == 2) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}

}
