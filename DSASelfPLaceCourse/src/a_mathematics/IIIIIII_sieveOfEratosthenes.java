package a_mathematics;

import java.util.Arrays;

//It is used to print prime numbers lower than a number

public class IIIIIII_sieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sieve(10);
		System.out.println();
		sieve(10);
		System.out.println();

		
//		long n =(long)Math.pow(10, 9);
//		System.out.println(n);

	}
	
	//Method 1
	public static void sieve(int n){
		for(int i =2; i<=n; i++) {
			if(prime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	//Method 2
	public static void sieve1(int n) {
		boolean arr[] = new boolean[n+1];
		Arrays.fill(arr, true);
		
		for(int i=2; i*i<=n; i++) {
			if(prime(i)) {
				for(int j=i*i; j<=n; j+=i){
					arr[j]= false;
				}
			}
		}
		for(int i=2; i<=n+1; i++) {
			if(arr[i]==true) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	
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
