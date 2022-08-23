package arrays;

public class BuubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 1, 8, -3, 6, 4, 12};
		
//		for (int i =0 ; i< a.length-1;i++) {
//			boolean sorted = true;
//			for(int j= 0; j<a.length-1-i; j++) {
//				if(a[j+1]<a[j]) {
//					int temp = a[j+1];
//					a[j+1]=a[j];
//					a[j]=temp;
//					
//					sorted = false;
//				}
//			}
//			if(sorted) break;
//		}
//		for(int item: a) {
//			System.out.print(item + " ");
//		}
		for(int i = 0; i<a.length-1; i++) {
			boolean sorted = true;
			for(int j =0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
					sorted = false;
				}
			}
			if(sorted) {
				break;
			}
		}
		for (int item: a) {
			System.out.print(item+" ");
		}
	}

}
