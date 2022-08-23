package f_sorting;

import java.util.Arrays;

public class N_MergeOverlappingIntervals {

	public static void main(String[] args) {
		
//		Interval arr[] = new Interval[4];
//		arr[0] = new Interval(5,10);
//		arr[1] = new Interval(3,15);
//		arr[2] = new Interval(18,30);
//		arr[3] = new Interval(2,7);
//		
//		Arrays.sort(arr);
//		for(Interval e: arr) {
//			System.out.println(e.start+" "+e.end);
//		}
		Interval arr[] = {new Interval(5,10), new Interval(3,15),new Interval(18,30),new Interval(2,7)};
		overlap(arr,arr.length);

	}
	
	public static void overlap(Interval arr[], int n) {
		Arrays.sort(arr);
		int res = 0;
		for(int i=1; i<n; i++) {
			if(arr[i].start <= arr[res].end) {
				arr[res].start = Math.min(arr[res].start, arr[i].start);
				arr[res].end = Math.max(arr[res].end, arr[i].end);
			}else {
				res++;
				arr[res] = arr[i];
			}
		}
		
		for(int i=0; i<=res; i++) {
			System.out.println(arr[i].start+" "+arr[i].end);
		}
	}

}



class Interval implements Comparable<Interval>{
	int start;
	int end;
	
	Interval(){
		start = 0;
		end = 0;
	}
	
	Interval(int start, int end){
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Interval o) {
		// TODO Auto-generated method stub
		return this.start - o.start;
	}
}
