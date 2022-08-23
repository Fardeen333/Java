package codeForcesContest699;

import java.util.Scanner;

public class ProblemA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i =1 ; i <= testCases; i++) {
			int x1 = 1;
			int y1 = 1;
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
//			System.out.println(x1+""+y1+""+x2+""+y2);
			sc.nextLine();
			String lang = sc.nextLine();
			lang= lang.toUpperCase();
			int countfory1inc=0;
			int countfory1dec=0;
			int countforx1inc=0;
			int countforx1dec=0;
			for(int j =0 ; j < lang.length() ; j++) {
				if(lang.charAt(j) == 'U') {
//					if (y1==y2) {
//						continue;
//					}else {
//						y1 = y1 + 1;
					countfory1inc+=1;
					
//					}
				}else if (lang.charAt(j) == 'D') {
//					if (y1==y2) {
//						continue;
//					}else {
//						y1 = y1 - 1;
					countfory1dec+=1;
//					}
				}else if (lang.charAt(j) == 'R') {
//					if(x1 == x2) {
//						continue;
//					}else{
//						x1 = x1 + 1;
//					}
					countforx1inc+=1;
				}else {
//					if(x1==x2) {
//						continue;
//					}else {
//						x1 = x1 - 1;
					}
					countforx1dec+=1;
				}
				
			}

	}

}
