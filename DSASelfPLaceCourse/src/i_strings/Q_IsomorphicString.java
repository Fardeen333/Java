package i_strings;

import java.util.*;

public class Q_IsomorphicString {

	public static void main(String[] args) {
		String s1 = "aab"; String s2 ="xxy";
		System.out.println(areIsomorphic(s1, s2));
		String s3 = "aab"; String s4 ="xyy";
		System.out.println(areIsomorphic(s3, s4));
		String s5 = "aab"; String s6 ="xxx";
		System.out.println(areIsomorphic(s5, s6));
		
		 

	}
	
	public static boolean areIsomorphic(String s1,String s2)
    {
        int n = s1.length();
        int m = s2.length();
        
        if(n != m){
            return false;
        }
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();
        
        for(int i=0; i<n; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            if(map1.containsKey(ch1) == true){
                if(map1.get(ch1) != ch2){
                    return false;
                }
            }else{
                if(map2.containsKey(ch2) == true){
                    return false;
                }else{
                    map1.put(ch1,ch2);
                    map2.put(ch2,true);
                }
            }
        }
        return true;
        
    }

}
