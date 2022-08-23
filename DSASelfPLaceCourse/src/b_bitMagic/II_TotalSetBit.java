package b_bitMagic;

public class II_TotalSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countSet(7));
		System.out.println(countSet(7));
		System.out.println(count(5));

	}
	//Method 1 O(total bits in N)
	public static int countSet(int n) {
		int count =0;
		while(n!=0) {
			if(n%2!=0) {
				count++;
			}
			n/=2;
		}
		return count;
	}
	
	//Method 1 O(total bits in N)
	public static int countSet1(int n) {
		int count =0;
		while(n!=0) {
			if((n&1)==1) {
				count++;
			}
			n<<=1;
		}
		return count;
	}
	
	//Method 2 Brian Kerningams Algorithm
	public static int count(int n) {
		int count =0;
		while(n>0) {
			n = n & (n-1);
			count++;
		}
		return count;
	}

}
