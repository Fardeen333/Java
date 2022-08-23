package strings;

public class ReverseStringWordByWrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "The Sky is blue";
		int i = s1.length()-1;
		String ans = "";
//		System.out.println(s1.trim());
		while(i >= 0) {
			while(i>=0 && s1.charAt(i)==' ') {
				i--;
			}
			int j = i;
			if (i<0) {
				break;
			}
			
			while(i>=0 && s1.charAt(i)!=' ') {
				i--;
			}
			if(ans=="") {
				ans= ans.concat(s1.substring(i+1, j+1));
			}else {
				ans= ans.concat(" "+s1.substring(i+1, j+1));
			}
			
		}

	System.out.println(ans);
	
	
	
	
	}

}
