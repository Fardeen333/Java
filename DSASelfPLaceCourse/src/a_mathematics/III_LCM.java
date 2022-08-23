package a_mathematics;

public class III_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcm(4,6));
		System.out.println(lcm1(4,6));
		
		
	}
	
	
	//Naive mETHOD O(a*b - Max(a,b))
	public static int lcm(int a, int b) {
		int max = Math.max(a, b);
		while(true) {
			if(max%a==0 && max%b==0) {
				return max;
			}
			max++;
		}
	}
	
	
	//O(log(min(a,b)))
	public static int euclidGcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return euclidGcd(b, a%b);
	}
	public static int lcm1(int a , int b) {
		return (a*b)/euclidGcd(a, b);
	}
	
	
	

}
