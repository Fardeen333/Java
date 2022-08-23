import java.util.*;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int mid = n/2;
		
		if(n % 2 == 0) {
			for(int i=0; i<mid; i++) {
				System.out.println(arr[n-i-1]+" "+arr[i]);
			}
		}else {
			for(int i=0; i<mid; i++) {
				System.out.println(arr[n-i-1]+" "+arr[i] );
			}
			System.out.println(arr[mid]+" "+0);
		}

	}
	
	
	
}
