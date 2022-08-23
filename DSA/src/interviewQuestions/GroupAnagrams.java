package interviewQuestions;
import java.util.*;
public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String array[] = {"eat", "tea", "tan", "ate", "nat" , "bat"};
		
		System.out.println(groupAnagrams(array));

	}
	
	
	public static List<List<String>> groupAnagrams(String str[]){
//		Map<String, List<String>> map = new HashMap<>();
//		for(String s : str) {
//			char charArray[] = s.toCharArray();
//			Arrays.sort(charArray);
//			String sorted = new String(charArray);
//			
//			if(!map.containsKey(sorted)) {
//				map.put(sorted, new LinkedList<String>());
//			}
//			
//			map.get(sorted).add(s);
//		}
//		return new LinkedList<>(map.values());
		Map<String, List<String>> map = new HashMap<>();
		for(String s : str) {
			char charArray[] = s.toCharArray();
			Arrays.sort(charArray);
			String sorted = new String(charArray);
			
			if(!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
			}
			
			map.get(sorted).add(s);
		}
		return new LinkedList<>(map.values());
	}

}
