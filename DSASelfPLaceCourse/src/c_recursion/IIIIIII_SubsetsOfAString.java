package c_recursion;

public class IIIIIII_SubsetsOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsets("abc","", 0);
//		bitwisesubsets("abc",3);
	}
	
	
	
	//recursive 
	// O(2^n)
	public static void subsets(String s, String current, int i) {
		if(i==s.length()) {
			System.out.println(current);
			return;
		}
		subsets(s, current, i+1);
		subsets(s, current+s.charAt(i), i+1);
	}
	
	
	//bitwise subsets
	public static void bitwisesubsets(String s, int n) {
		for(int i =0 ; i<Math.pow(2, n); i++) {
			for(int j=0; j<n; j++) {
				if((i & (1<<j)) >= 1 ) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
