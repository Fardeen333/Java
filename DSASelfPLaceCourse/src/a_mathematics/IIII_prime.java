package a_mathematics;

public class IIII_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(9));
		System.out.println(isPrime(97));
		
		
		

	}
	
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i =2; i<=Math.sqrt(n); i++) {
			if(n%i== 0) {
				return false;
			}
		}
		return true;
	}
	
	
	//most optimised prime checking function
	
	public static boolean prime(int n) {
		if(n==1) {
			return false;
		}
		if(n==2 || n==3) {
			return true;
		}
		if(n%2 ==0 || n%3 == 0) {
			return false;
		}
		
		for(int i =5; i<=Math.sqrt(n); i+=6) {
			if(n%i == 0 || n%(i+2)==0 ) {
				return false;
			}
		}
		
		return true;
		
	}
	

}
