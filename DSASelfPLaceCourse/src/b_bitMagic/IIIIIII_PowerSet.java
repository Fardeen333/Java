package b_bitMagic;

public class IIIIIII_PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abc";
		powerSet(str);

	}
	// O(2^n * n)
	public static void powerSet(String str) {
		int n = str.length();
		int pow = (int)Math.pow(2.0, n);
		
		for(int i=0; i<pow; i++) {
			for(int j =0; j<n; j++) {
				if((i & (1<<j)) != 0) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
