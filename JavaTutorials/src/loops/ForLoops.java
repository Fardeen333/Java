package loops;
public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0; i<10; i++) {
//			System.out.println("H3ello World "+i );
//			
//		}
//        for(int i=0; i<=100; i=i+2) {
//        	System.out.println(i);
//        }
//		int sum=0, n=50;
//		for (int i=1; i<=n;i++) {
//			sum=sum+i;
//		}
//		System.out.println("the total sum is"+sum);
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}
		int tableOf=23;
		for(int i=1;i<=10;i++) {
			System.out.println(tableOf+"*"+i+"="+tableOf*i);
		}
		int factorial=1, n=5;
		for(int i=n; i>=1; i--) {
			factorial=factorial*i;
		}
		System.out.println("The factorial of the give number is "+factorial);
	}

}
