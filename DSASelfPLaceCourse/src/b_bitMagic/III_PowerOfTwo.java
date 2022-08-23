package b_bitMagic;

public class III_PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPow(8));
		System.out.println(isPow(1));
		System.out.println(isPow2(8));

	}
	
	public static boolean isPow(int n) {
		if(n==0) {
			return false;
		}
		
		while(n > 1) {
			if(n%2 != 0) {
				return false;
			}
			n/=2;
		}
		return true;
	}
	
	public static boolean isPow2(int n) {
		if(n==0) {
			return false;
		}
		
		return (n& (n-1))==0;
	}
	

}
