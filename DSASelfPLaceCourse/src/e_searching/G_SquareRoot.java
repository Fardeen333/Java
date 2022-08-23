package e_searching;

public class G_SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareRoot(4)+" "+squareRoot(14)+" "+squareRoot(25));
		System.out.println(squareRoot1(4)+" "+squareRoot1(14)+" "+squareRoot1(25)+" " +squareRoot1(35));

	}
	
	//Naive Approach O(x) time and O(1) space
	public static int squareRoot(int x) {
		int i = 1;
		while(i*i <= x) {
			i++;
		}
		return i-1;
	}
	
	//Efficient Approach O(logn) time and O(1) space
	public static int squareRoot1(int x) {
		int ans = -1;
		int low =1; int high =x;
		while(low<=high) {
			int mid = (low + high)/2;
			int midsq = mid * mid;
			if(midsq == x) {
				return mid;
			}else if(midsq > x) {
				high = mid-1;
			}else {
				low = mid+1;
				ans = mid;
			}
		}
		return ans;
	}

}
