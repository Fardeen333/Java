package strings;

public class ReverseStringByword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "    My name is Fardeen";
		int i = a.length()-1;
		
//		a.trim();
		String ans = "";
		
		while(i>=0) {
			while(i>=0 && a.charAt(i)==' ') {
				i--;
			}
			if(i<0) {
				break;
			}
			int j = i ;	
			
			
			while(i>=0 && a.charAt(i)!=' ') {
				i--;
			}
			if(ans.isEmpty()) {
				ans = ans.concat(a.substring(i+1, j+1));
			}else {
				ans = ans.concat(" "+a.substring(i+1, j+1));	
			}
		}
		

		
		System.out.print(ans);
//		System.out.print("wert");
		
		
		
		
	}

}
