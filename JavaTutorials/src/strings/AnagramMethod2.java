package strings;

import java.util.Arrays;

public class AnagramMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a = "aaeeddkkii" ;
		 String b = "aedkiaedki";
		 char array1[] = a.toCharArray();
		 Arrays.sort(array1);
		 a= new String(array1);
		 System.out.println(a);
		 char array2[] = b.toCharArray();
		 Arrays.sort(array2);
		 b= new String(array2);
		 System.out.println(b);
		 if(a.equals(b)) {
			 System.out.println("Anagrams");
		 }else {
			 System.out.println("Not anagrams");
		 }
		 String qwert ="qwert";
		 String yuiop ="qwert";
		 if(qwert==yuiop) {
			 System.out.println("True");
		 }

	}

}
