package codeForcesContest699;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i =1 ; i <= testCases; i++) {
			int x1 = 0;
			int y1 = 0;
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			sc.nextLine();
			String lang = sc.nextLine();
			lang= lang.toUpperCase();
			int countfory1inc=0;
			int countfory1dec=0;
			int countforx1inc=0;
			int countforx1dec=0;

			for(int j =0 ; j < lang.length() ; j++) {
				if(lang.charAt(j) == 'U') {
				
					countfory1inc+=1;
					
				}else if (lang.charAt(j) == 'D') {
					
					countfory1dec+=1;
					
				}else if (lang.charAt(j) == 'R') {
					
					countforx1inc+=1;
					
				}else if(lang.charAt(j) == 'L'){
					
					countforx1dec+=1;
				
				}
				
			}
			if(x2==0 && y2==0){
				System.out.println("YES");
			}else if(x2>0 && y2==0) {
				if(countforx1inc>=x2) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else if(x2==0 && y2>0) {
				if(countfory1inc>=y2) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else if (x2>0 && y2>0) {
				if(countforx1inc>=x2 && countfory1inc>=y2) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else if(x2<0 && y2==0) {
				if(countforx1dec>=(-x2)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else if(x2==0 && y2<0) {
				if(countfory1dec>=(-y2)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else if(x2<0 && y2<0) {
				if(countforx1dec>=(-x2) && countfory1dec>=(-y2)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else if(x2>0 && y2<0) {
				if(countforx1inc>=x2 && countfory1dec>=(-y2)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
				
			}else if(x2<0 && y2>0) {
				if(countforx1dec>=(-x2) && countfory1inc>=y2) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
			
			
		}

	}

}
