package f_sorting;

public class E_IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		int a[] = {1,20,20,40,60};
		int b[] = {2,20,20,40};
		intersection(a,b,a.length, b.length);
		intersect(a,b,a.length, b.length);

	}
	//Naive Approach O(n*m) time and O(1) space  
	public static void intersection(int arr[], int brr[], int m, int n) {
		for(int i=0; i<m; i ++) {
			if(i>0 && arr[i] == arr[i-1]) {
				continue;
			}
			for(int j=0; j<n; j++) {
				if(arr[i] == brr[j]) {
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}
		System.out.println();
	}
	
	//Efficient Approach O(n+m) time and O(1) space
	public static void intersect(int arr[], int brr[], int m, int n) {
		int i =0; int j=0;
		while(i<m && j<n) {
			if(i>0 && arr[i] == arr[i-1]) {
				i++;
				continue;
			}
			if(arr[i] < brr[j]) {
				i++;
			}else if(arr[i] > brr[j]) {
				j++;
			}else {
				System.out.print(arr[i] + " ");
				i++;
				j++;
			}
		}
	}

}
