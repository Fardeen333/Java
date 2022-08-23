package googleKickstart;
import java.util.Scanner;
import java.util.ArrayList;

public class IncreasingSubtring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		for(int i = 1; i<=testCases; i++) {
			int N = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			
		    ArrayList<Integer> answer = new ArrayList<Integer>();
		    answer.add(1);
		    for(int j = 1; j<N; j++){
		        int count =1;
		        for(int k = j; k>0; k--){
		            if(s.charAt(k)>s.charAt(k-1)){
		                count+=1;
		            }else{
		                break;
		            }
		        }
		        answer.add(count);
		    }
		    if(N==1){
		        System.out.print("Case #"+i+":"+" ");
		        System.out.print(answer.get(0));
		    }else{
		        System.out.print("Case #"+i+":"+" ");
		        for(int item: answer){
		            System.out.print(item+" ");
		        }
		    }
		    System.out.println();
		 }

	}
}
