package c_recursion;

public class IIIIII_RopeCuttingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(maxPieces(23, 12, 9, 11));

	}
	//given a rope of length n and 3 sizes a b c, we have to find out how many cuts can be made on the rope
	//O(3^n)
	public static int maxPieces(int n, int a, int b, int c) {
		if(n==0) {
			return 0;
		}
		if(n<0) {
			return -1;
		}
		
		int res = Math.max(Math.max(maxPieces(n-a, a, b, c), maxPieces(n-b, a, b, c)), maxPieces(n-c, a, b, c));
		
		if(res==-1) {
			return -1;
		}
		return res+1;
	}


}
