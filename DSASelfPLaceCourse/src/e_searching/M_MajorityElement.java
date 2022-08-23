package e_searching;

public class M_MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,3,4,8,8};
		int b[] = {3,4,7,7,7,5};
		int c[] = {20,30,40,50,50,50,50};
		
		System.out.println(majority(a,a.length)+" "+majority(b,b.length)+" "+majority(c,c.length));
		System.out.println(majority1(a,a.length)+" "+majority1(b,b.length)+" "+majority1(c,c.length));
		

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int majority(int arr[], int n) {
		for(int i=0; i<n; i++) {
			int count =1;
			for(int j=i+1; j<n; j++) {
				if(arr[j] == arr[i]) {
					count++;
				}
			}
			if(count > (n/2)) {
				return i;
			}
		}
		return -1;
	}
	
	//Efficient Approach O(n) time and O(1) space 
	//Moorrs's voting algorithm
	public static int majority1(int arr[], int n) {
		int count =1; int res =0;
		for(int i=1; i<n; i++) {
			if(arr[i] == arr[res]) {
				count++;
			}else {
				count--;
			}
			if(count == 0) {
				res =i; count =1;
			}
		}
		count = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == arr[res]) {
				count++;
			}
		}
		
		if(count <= (n/2)) {
			return -1;
		}else{
			return res;
		}

		
	}

}
