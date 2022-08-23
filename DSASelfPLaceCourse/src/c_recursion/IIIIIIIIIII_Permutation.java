package c_recursion;

public class IIIIIIIIIII_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("abcd", "");
		System.out.println();
		per("abcd",0);
		System.out.println();
		permutation("abc", "");
		System.out.println();
		per("abc",0);

	}
	
	public static void permutation(String s, String ans) {
		if(s.length()==0) {
			System.out.print(ans+ " ");
			return;
		}
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			String leftPart = s.substring(0, i);
			String rightPart = s.substring(i+1);
			String newS = leftPart+rightPart;
			permutation(newS, ans+ch);
		}
	}
	
	public static void per(String s, int i) {
		if(i==s.length()-1) {
			System.out.print(s+" ");
			return;
		}
		
		for(int j =i; j<s.length(); j++) {
			s = swap(s, i, j);
			per(s, i+1);
			s = swap(s, i, j);
		}
		
	}
	
	public static String swap(String s, int a, int b) {
		 char arr[] = s.toCharArray();
		 
		 char temp = arr[a];
		 arr[a]= arr[b];
		 arr[b] = temp; 
		 
		 return String.valueOf(arr);
	}

}
