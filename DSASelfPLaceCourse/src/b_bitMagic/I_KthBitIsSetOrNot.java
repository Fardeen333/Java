package b_bitMagic;

public class I_KthBitIsSetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kthset(5, 1);
		kthset(2, 3);
		
		kSet(5, 1);
		kSet(2, 3);

	}
	//Method 1 Left Shift
	public static void kthset(int n, int k) {
		
		
		if((n & (1<<(k-1))) > 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	//Method 2 Right shift
	public static void kSet(int n, int k) {
		if(((n>>(k-1)) & 1) == 1  ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	

}
