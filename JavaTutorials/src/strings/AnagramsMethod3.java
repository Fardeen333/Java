package strings;

public class AnagramsMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "listen123!@#";
		String b = "silent!@#32";
		boolean isAnagram = true ;
		int a1[] = new int[256];
//		int b1[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index = (int ) c;
			a1[index]++;
		}
		for(char c: b.toCharArray()) {
			int index = (int ) c;
			a1[index]--;
		}																	//		for (int i = 0; i< a.length(); i++) {
																			//			int index = (int)i;
																			//			a1[index]++;
																			//		}
																			//		for (int i = 0; i< b.length(); i++) {
																			//			int index = (int)i;
																			//			b1[index]++;
																			//		}
		for(int i = 0; i<256;i++) {
			if(a1[i] != 0) {
				isAnagram= false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
	}

}
