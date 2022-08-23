package f_sorting;

public class G_CountInversion {

	public static void main(String[] args) {
		int a[] = {2,4,1,3,5};
		int b[] = {1,2,3,4,5};
		int c[] = {5,4,3,2,1};
		
		System.out.println(countInversion(a, a.length)+" "+ countInversion(b, b.length)+" "+ countInversion(c, c.length));
		System.out.println(countInverse(a, 0, a.length-1)+" "+ countInverse(b, 0, b.length-1)+" "+ countInverse(c,0, c.length-1));

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int countInversion(int arr[] , int n) {
		int count =0 ;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) count++;
			}
		}
		return count;
	}
	
	//efficient Approach O(nlogn) time and O(1) space
	public static int countInverse(int arr[], int l, int r) {
		int count = 0;
		if(r>l) {
			int m = (l+r)/2;
			count += countInverse(arr, l, m);
			count += countInverse(arr, m+1, r);
			count += merge(arr, l, m, r);
		}
		return count;
	}
	
	public static int merge(int arr[], int l, int m, int r) {
		int n1 = m -l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0; i<n1; i++) {
			L[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			R[j] = arr[m+1+j];
		}
		
		int i=0; int j=0; int k =l; int count = 0;
		while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
				k++;
			}else {
				arr[k] = R[j];
				j++;
				k++;
				count += (n1-i);
			}
		}
		while(i<n1) {arr[k] = L[i]; k++; i++;}
		while(j<n2) {arr[k] = R[j]; k++; j++;}
		
		return count;
		
	}

}
