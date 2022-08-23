package d_arrays;

public class L_FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,10,10,25,30,30,30};
		int b[] = {10,10,10,10};
		int c[] = {10,20,30};
		int d[] = {10};
		frequency(arr, arr.length);
		frequency(b, b.length);
		frequency(c, c.length);
		frequency(d, d.length);
		
		System.out.println();
		System.out.println();
		freq(arr, arr.length);
		freq(b, b.length);
		freq(c, c.length);
		freq(d, d.length);

	}
	
	//O(n) time and O(1) space 
	public static void frequency(int arr[], int n) {
		for(int i =0; i<n; i++) {
			int count = 1;
			if(i+1 < n) {
				while(arr[i+1] == arr[i]) {
					count++;
					i++;
					if(i+1 == n) {
						break;
					}
					
				}
			}
			System.out.print(arr[i] +" " +count+"   ") ;
		}
		System.out.println();
	}
	
	//O(n) space and O(1) time
	public static void freq(int arr[], int n ) {
		int i =1;
		int freq =1;
		while(i<n) {
			while(i<n && arr[i]==arr[i-1]) {
				freq++;
				i++;
			}
			System.out.print(arr[i-1]+"-"+freq+"    ");
			freq = 1;
			i++;
		}
		if(n==1 || arr[n-1] != arr[n-2]) {
			System.out.print(arr[n-1]+"-"+"1");
		}
		System.out.println();
		
	}

}
