package m_Deque;

import java.util.ArrayDeque;

public class G_CircularTourOfATruck {

	public static void main(String[] args) {
		
		int petrol[] = {4, 8, 7, 4};
		int distance[] = {6, 5, 3, 5};
		
		System.out.println(position(petrol, distance, petrol.length));
		
		int petrol1[] = {50, 10, 60, 100};
		int distance1[] = {30, 20, 100, 10};
//		System.out.println(position1(petrol1, distance1, petrol1.length));
//		int petrol2[] = {4, 8};
//		int distance2[] = {5, 6};
//		System.out.println(position1(petrol2, distance2, petrol2.length));
//		int petrol3[] = {8,9,4};
//		int distance3[] = {5,10,12};
//		System.out.println(position1(petrol3, distance3, petrol3.length));
		
		System.out.println(maximum2(petrol1, distance1, petrol1.length));
		
		
		
		

	}
	
	//Naive Approach O(n^2) time and O(1) space
	public static int position(int pet[], int dist[], int n) {
		for(int start=0; start<n; start++) {
			int curr_petrol = 0;
			int end = start;
			while(true) {
				curr_petrol += (pet[end]-dist[end]);
				if(curr_petrol<0) {
					break;
				}
				end= (end+1)%n;
				if(end == start) {
					return start+1;
				}
			}
		}
		return -1;
	}
	
	//Better Solution O(n) time and O(n) space
	public static int position1(int pet[], int dist[], int n) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		int start = 0;
        int end = 1;
        dq.offerLast(start);
        int curr_petrol = pet[start] - dist[start];
        while(end != start || curr_petrol < 0)
        {
             
            // If current amount of petrol in truck becomes less than 0, then
            // remove the starting petrol pump from tour
            while(curr_petrol < 0 && start != end)
            {
                // Remove starting petrol pump. Change start
                curr_petrol -= pet[start] - dist[start];
                start = (start + 1) % n;
                 
                // If 0 is being considered as start again, then there is no
                // possible solution
                if(start == 0)
                    return -1;
            }
            // Add a petrol pump to current tour
            curr_petrol += pet[end] - dist[end];
             
            end = (end + 1)%n;
        }
         
        // Return starting point
        return start+1;
	}
	
	//Efficient Approach O(n) time and o(1) space
	public static int maximum2(int pet[], int dist[], int n) {
		int start = 0;
		int curr_petrol = 0;
		int prev_petrol = 0;
		for(int i=0; i<n; i++) {
			curr_petrol += (pet[i]-dist[i]);
			if(curr_petrol<0) {
				prev_petrol = curr_petrol;
				curr_petrol=0;
				start = i+1;
			}
		}
		return (curr_petrol+prev_petrol >= 0)? start+1: -1; 
	}

}
