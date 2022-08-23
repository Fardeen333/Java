import java.util.*;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int leftDiagonal = 0;
//		int rightDiagonal = 0;
//		List<List<Integer>> arr = new ArrayList<>();
//		
//		List<Integer> innerList = new ArrayList<>();
//		innerList.add(12);
//		innerList.add(23);
//		innerList.add(34);
//
//		
//		List<Integer> innerList1 = new ArrayList<>();
//		innerList1.add(10);
//		innerList1.add(15);
//		innerList1.add(20);
//		
//		List<Integer> innerList2 = new ArrayList<>();
//		innerList2.add(2);
//		innerList2.add(5);
//		innerList2.add(3);
//		
//		arr.add(innerList);
//		arr.add(innerList1);
//		arr.add(innerList2);
//		
//		System.out.println(arr);
//		
//		for(int i = 0; i < arr.size(); i++ ){
//			leftDiagonal += arr.get(i).get(i);     
//	        
//	    }
//		
//		for(int i = 0;  i < arr.size(); i++  ){
//	      
//	        rightDiagonal += arr.get(i).get(arr.size()-i-1);
//	    }
//		
//		System.out.println(Math.abs(leftDiagonal-rightDiagonal));
		
//		List<Integer> a = new ArrayList<>();
//		a.add(0);
//		a.add(0);
//		System.out.println(a);
//		a.set(0, a.get(0)+1);
//		System.out.println(a);
		
		
//		String str = "07:05:45PM";
//	    print24(str);
		
	    
	    String s = "12:40:22AM";
	    int n = s.length();
	    int h1 = (int)s.charAt(1) - '0';
	    int h2 = (int)s.charAt(0) - '0';
	    Integer hh = (h2 * 10 + h1);
	    
	    String ans= "";
	    
	    if(s.contains("AM")) {
	    	if(hh == 12) {
	    		ans = ans.concat("00");
	    		ans = ans.concat(s.substring(2, n-2));
	    	}else{
                ans = ans.concat(s.substring(0,n-2));
            }
	    }else {
	    	if(hh== 12) {
	    		ans = ans.concat(s.substring(0,n-2));
	    	}else {
	    		hh+=12;
	    		String z = hh.toString();
	    		ans = ans.concat(z);
	    		ans = ans.concat(s.substring(2, n-2));
	    	}
	    }
	    System.out.println(ans);
		
				

	}
	
//	static void print24(String str)
//	{
//	    // Get hours
//	    int h1 = (int)str.charAt(1) - '0';
//	    int h2 = (int)str.charAt(0) - '0';
//	    int hh = (h2 * 10 + h1 % 10);
//	 
//	    // If time is in "AM"
//	    if (str.charAt(8) == 'A')
//	    {
//	        if (hh == 12)
//	        {
//	            System.out.print("00");
//	            for (int i = 2; i <= 7; i++)
//	                System.out.print(str.charAt(i));
//	        }
//	        else
//	        {
//	            for (int i = 0; i <= 7; i++)
//	                System.out.print(str.charAt(i));
//	        }
//	    }
//	 
//	    // If time is in "PM"
//	    else
//	    {
//	        if (hh == 12)
//	        {
//	            System.out.print("12");
//	            for (int i = 2; i <= 7; i++)
//	                System.out.print(str.charAt(i));
//	        }
//	        else
//	        {
//	            hh = hh + 12;
//	            System.out.print(hh);
//	            for (int i = 2; i <= 7; i++)
//	                System.out.print(str.charAt(i));
//	        }
//	    }
//	} 

}
