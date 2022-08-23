package recursion;

public class RecursionPractice {
	
	static int a =0, b=1, c;
	
	static int sum = 0;
	
	static int array[] = {1,2,3,4,5,6,7,8,9};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. printNumbers
		printNumbers(5);
		
		//2. catEyes
		System.out.println("cat Eyes : "+catEyes(10));
		
		//3. Exponent
		System.out.println("The value of 2 raise to power 3 is "+exponent(2, 3));
		
		//4. factorial
		System.out.println("Factorial of 5 is" + " " + factorial(10));
		
		//5. Fibonacci Series
		System.out.print(a+" "+b+" ");
		fibonacci(10-2);
		System.out.println();
		
		//6. Number pf speakers mobile have
		System.out.println("10 phones have "+mobileSpeakers(10));
		
		//7. Sum of Digits
		System.out.println("Sum = "+ sumNumbers(123));
		
		//8. Number of five
		System.out.println("Five = "+ five(45555555));
		
		//9. Binary Search
		System.out.println(binarySearch(array, 4, 0, 8));
 		
		//10. prime factors of a number
		factors(36);
		
	}
	
	
	public static void printNumbers(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNumbers(n-1);
	}  
	
	public static int catEyes(int n) {
		if(n==1) {
			return 2;
		}
		return 2+catEyes(n-1);
	}
	
	public static int exponent(int base , int power) {
		if(power == 0) {
			return 1;
		}
		return base * exponent(base, power-1);
	}
	
	public static int factorial(int num) {
		if(num ==0 || num==1) {
			return 1;
		}
		return num * factorial(num-1);
	}
	
	public static void fibonacci(int n) {
		if(n==0) {
			return ;
		}
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		fibonacci(n-1);
		
	}
	
	public static int mobileSpeakers(int num) {
		if(num==0) {
			return 0;
		}
		if(num%2==0) {return 2+mobileSpeakers(num-1);}
		return 1+mobileSpeakers(num-1);
	}
	
	public static int sumNumbers(int n) {
		if(n==0) {
			return 0;
		}
		
		return n%10 + sumNumbers(n/10);
	}
    
	public static int five(int n) {
		if(n==0) {
			return 0;
		}
		if(n%10==5) {
			return 1 + five(n/10);
		}else {
			return five(n/10);
		}
	}
	
	public static int binarySearch(int array[], int key, int start, int end) {
		if(start<=end) {
			int mid =(start +end)/2;
			if(key>array[mid]) {
				return binarySearch(array, key, mid+1, end);
			}else if(key<array[mid]) {
				return binarySearch(array, key, start, mid-1);
			}else{
				return mid+1;
			}
		}else {
			return -1;
		}
	}
	
	//to find the prime factors of a number
	public static void factors(int n) {
		while(n%2==0) {
			System.out.println(2);
			n/=2;
		}
		for(int i =3; i<=Math.sqrt(n); i++) {
			while(n%i==0) {
				System.out.println(i);
				n/=i;
			}
		}
		if(n>2) {
			System.out.println(n);
		}
	}

}
