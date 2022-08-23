package interviewQuestions;
import java.util.*;
public class SlidingWindowMaximum {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int a[] = {4, 3, 1, 2, 5, 3, 4, 7, 1, 9};
		int ans[] = sol.maxSlidingWindow(a, 4);
		
		
		for(int item : ans) {
			System.out.print(item+ " ");
		}
		

	}
	
	static class Solution{
		public int[] maxSlidingWindow(int a[], int k) {
			Deque<Integer> dq = new LinkedList<>();
			int n = a.length;
			int ans[] = new int[n-k+1];
			if(n<=1) {
				return a;
			}
			int i = 0;
			for(;i<k;i++) {
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}
			for(;i<n;i++) {
				ans[i-k] = a[dq.peekFirst()];
				
				while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
					dq.removeFirst();
				}
				
//				if(!dq.isEmpty() && dq.peekFirst() <= i-k) {
//					dq.removeFirst();
//				}
				
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);	
			}
			ans[i-k] = a[dq.peekFirst()];
			return ans;
		}
	}

}
