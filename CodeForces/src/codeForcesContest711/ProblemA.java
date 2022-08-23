package codeForcesContest711;

import java.util.*;

public class ProblemA {

	public static void main(String[] args) {
		int noOfElements=0;
		int width =0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>();
		int testCases = sc.nextInt();
		for(int i =1 ; i <= testCases; i++) {
			noOfElements = sc.nextInt();
			width = sc.nextInt();
			boolean array[] = new boolean[myList.size()];
			for(int j =1; j<=noOfElements;j++) {
				int e = sc.nextInt();
				myList.add(e);
			}
			
			for(int l=0; l<noOfElements; l++) {
				int newWidth = width;
				while(newWidth>0) {
					newWidth-=getSmallest(myList, newWidth); 
				}
				if(checkForEmptiness(myList)) {
					System.out.println(l+1);
					break;
				}
					
			}
			
			
		}
		System.out.println(noOfElements+width);
		System.out.println(myList.get(0));
	}
	
	public static int getSmallest(ArrayList<Integer> list,int length) {
		int smallest = 0;
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)<=length) {
				smallest = list.get(i);
				list.remove(i);
			}else {
				continue;
			}		
		}
		return smallest;
	}
	
	public static boolean checkForEmptiness(ArrayList<Integer> list) {
		boolean isEmpty = true; 
		if(list.size()==0) {
			isEmpty=false;
		}
		return isEmpty;
	}

}
