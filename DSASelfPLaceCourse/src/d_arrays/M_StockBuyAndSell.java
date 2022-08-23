package d_arrays;

public class M_StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,5,3,8,12};
		int b[] = {30,20,10};
		int c[] = {10,20,30};
		int d[] = {1,5,3,1,2,8};
		
		System.out.println(maxProfit(a,a.length));
		System.out.println(maxProfit(b,b.length));
		System.out.println(maxProfit(c,c.length));
		System.out.println(maxProfit(d,d.length));

	}

	public static int maxProfit(int arr[], int n) {
		int profit =0;
		for(int i =1; i<n; i++) {
			if(arr[i] > arr[i-1]) {
				profit += (arr[i]-arr[i-1]);
			}
		}
		return profit;
	}
}
