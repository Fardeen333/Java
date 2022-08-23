package a_mathematics;

public class II_Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(10,9));
		
		System.out.println(euclidGcd(15, 45));
	}
	
	
	//Complexity = O(min(a,b))
	public static int gcd(int a, int b) {
		int min = Math.min(a, b);
		while(min != 0) {
			if(a%min ==0  && b%min == 0) {
				break;
			}
			min--;
		}
		return min;
	}
	
	//Ecledean Algorithm O(log(min(a,b)))
	public static int euclidGcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return euclidGcd(b, a%b);
	}

}
