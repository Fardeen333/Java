package d_arrays;

public class S_MajorityElement {

	public static void main(String[] args) {
		int a[] = {8,7,6,8,6,6,6,6};
		int b[] = {8,3,4,8,8};
		int c[] = {3,7,4,7,7,5};
		int d[] = {20,30,40,50,50,50,50};
		System.out.println(majority(a,a.length)+" "+majority(b,b.length)+" "+majority(c,c.length)+" "+majority(d,d.length));
		System.out.println(majority1(a,a.length)+" "+majority1(b,b.length)+" "+majority1(c,c.length)+" "+majority1(d,d.length));


	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int majority(int arr[], int n) {
		for(int i =0; i<n; i++) {
			int count = 1;
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count > (n/2)) {
				return i;
			}
		}
		return -1;
	}
	
	//Moore's Voting Algorithm
	//O(n) time and O(1) space
	public static int majority1(int arr[], int n) {
		int res =0;
		int count =1;
		for(int i =1; i<n; i++) {    //Finding a candidate
			if(arr[i] == arr[res]) {
				count++;
			}else {
				count--;
			}
			if(count==0) {
				count =1;
				res= i;
			}
		}
		count = 0 ;
		for(int i=0;i<n; i++) {     //Checking for the majority
			if(arr[i] == arr[res]) {
				count++;
			}
		}
		if(count <= (n/2)) {
			return -1;
		}else {
			return res;
		}
	}

}
