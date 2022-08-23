package a_mathematics;

public class IIIII_PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		primeFactor(11);
		System.out.println();
		primeFact(29);
		System.out.println();
		primeFactorEfficient(15);
		System.out.println();
		primeFactorMostEfficient(101);

	}
	//Method 1
	//this and
	public static void primeFactor(int n) {
		if(n==1) {
			System.out.println("Nothing");
			return;
		}
		for(int i =2; i<=n; i++) {
			if(isPrime(i)) {
				while(n%i == 0) {
					System.out.print(i+" ");
					n/=i;
				}
			}
		}
	}
	
	//Method 1
	//this are same
	public static void primeFact(int n) {
		if(n==1) {
			System.out.println("Nothing");
			return;
		}
		for(int i =2; i<=n; i++) {
			if(isPrime(i)) {
				int x =i;
				while(n%x == 0) {
					System.out.print(i+" ");
					x*=i;
				}
			}
		}
	}
	
	
	//Method 2
	//O(sqrt(n))
	public static void primeFactorEfficient(int n) {
		if(n<1) {
			return;
		}
		for(int i =2; i<= Math.sqrt(n); i++) {
			while(n%i == 0) {
				System.out.print(i+" ");
				n/=i;
			}
		}
		if(n>1) {
			System.out.print(n);
		}

	}
	
	//Method 3
	//O(sqrt(n))
	public static void primeFactorMostEfficient(int n) {
		if(n<1) {
			return;
		}
		while(n%2 == 0) {
			System.out.print(2+" ");
			n/=2;
		}
		while(n%3 == 0) {
			System.out.print(3+" ");
			n/=3;
		}
		for(int i =5;i<=Math.sqrt(n); i+=6) {
			while(n%i==0) {
				System.out.print(i+" ");
				n/=i;
			}
			while(n%(i+2)==0) {
				System.out.print(i+2+" ");
				n/=(i=2);
			}
		}
		if(n>3) {
			System.out.print(n);
		}
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

}
