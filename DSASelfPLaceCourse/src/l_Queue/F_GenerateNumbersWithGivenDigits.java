package l_Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class F_GenerateNumbersWithGivenDigits {

	public static void main(String[] args) {
		
		numbers(10);
		
	}
	
	public static void numbers(int n) {
		Queue<String> q = new ArrayDeque<>();
		q.offer("5");
		q.offer("6");
		for(int i=0; i<n; i++) {
			String x = q.poll();
			System.out.print(x+" ");
			q.offer(x+"5");
			q.offer(x+"6");
		}
	}

}
