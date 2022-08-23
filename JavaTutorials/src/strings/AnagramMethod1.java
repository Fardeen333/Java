package strings;

public class AnagramMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "silent";	
		String s2 = "listen";
		boolean isVisited[] = new boolean[s2.length()];
		boolean isAnagram = false;
//		if(s1.length()==s2.length()) {
//			for( int i= 0 ; i<s1.length() ; i++) {
//				char check = s1.charAt(i);
//				isAnagram = false;
//				for( int j = 0 ; j< s2.length() ; j++) {
//					if(check == s2.charAt(j) && isVisited[j]==false) {
//						isAnagram = true;
//						isVisited[j] = true;
//						break;
//					}
//				}
//				if(!isAnagram) {
//					break;
//				}
//			}
//		}
		
		if(s1.length()==s2.length()) {
			for(int i = 0; i<s1.length(); i++) {
				char c = s1.charAt(i);
				isAnagram = false;
				for(int j = 0; j< s2.length(); j++) {
					if(c==s2.charAt(j) && !isVisited[j]) {
						isVisited[j]= true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
				
			}
		}
		if(isAnagram) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
