import java.util.Scanner;

public class SetCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = new String[2];
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < 2; i++) {
			arr[i]=sc.nextLine();
			
		}
		
		for(int i =0; i < 2; i++) {
			System.out.print(arr[i]+" ");
		}
		
		String checkItem=sc.nextLine();
		
		if(checkItem.equals(arr[0])) {
			System.out.println("Valid");
		}else if(checkItem.equals(arr[1])){
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		} 
		
	}

}
