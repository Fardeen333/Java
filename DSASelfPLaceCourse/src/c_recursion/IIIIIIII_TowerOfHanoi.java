package c_recursion;

public class IIIIIIII_TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(toh(4,'a','b','c'));
		toh(3, 'A', 'B', 'C');
	}
	
	
	//O(2^n)
	public static void toh(int n, char A, char B, char C) {
		if(n==1) {
			System.out.println("Move disc "+ 1 +" from "+A+" to "+C);
//			return 1;
			return;
		}
		toh(n-1, A,C,B);
		System.out.println("Move disc "+ n +" from "+A+" to "+C);
		toh(n-1,B,A,C);
//		int count = toh(n-1, A,C,B) + 1 + toh(n-1,B,A,C);
//		return count;
	
	}

}
