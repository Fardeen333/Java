package a_mathematics;

public class IIIIII_AllFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factors(10);
		System.out.println();
		factors1(10);
		System.out.println();
		factors2(25);

	}
	//O(n)
	public static void factors(int n) {
		for(int i =1; i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i+ " ");
			}
		}
	}
	//O(rootn)
	public static void factors1(int n) {
		for(int i =1; i*i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i+ " ");
				if(i!=(n/i)) {
					System.out.print(n/i+" ");
				}
			}
			
		}
	}
	
	public static void factors2(int n) {
		for(int i =1; i*i<n; i++) {
			if(n%i == 0) {
				System.out.print(i+ " ");
			}	
		}
		
		for(int i =(int)Math.sqrt(n); i>=1; i--) {
			if(n%i == 0) {
				System.out.print(n/i+ " ");
			}	
		}
	}
	
	
	

}
