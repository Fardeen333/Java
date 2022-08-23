import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
//		System.out.println(decimal(5, 2));
		
//		String arr[] = {"", ""};
//		System.out.println(hamming(arr));
		
//		System.out.println(isValid("appleM7!"));
		
//		System.out.println(rating("4.5"));
//		
//		int x = 1651651;
//		int n = (int) Math.floor(Math.log10(x)+1);
//		
//		System.out.println(n);
//		int arr[] = {1,2,2,2,3,3};
		
		
		
		

				
		
		
	}
	
	
	public static String rating(String strParam) {
		double c = Double.parseDouble(strParam);
        DecimalFormat df = new DecimalFormat("0.00");
        strParam = df.format(c);
        int front = Integer.parseInt(strParam.substring(0,strParam.indexOf('.')));
        int back  = Integer.parseInt(strParam.substring(strParam.indexOf('.')+1,strParam.length()));

        if ( back == 0){

        }
        else if ( back > 0 && back < 25){
            back = 0;

        }
        else if ( back >= 25 && back < 75){
            back = 1;

        }
        else if ( back >= 75 ){
            front+=1;
            back = 0;
        }


        String ans = "";
        int count = 0;
        while(front>0) {
            count += 1;
            ans = ans + "full ";
            front -= 1;
        }

        if ( count < 5) {
            if (back != 0) {
                count += 1;
                ans = ans +"half ";
            }
        }

        while ( count < 5) {
            count += 1;
            ans = ans +"empty ";

        }

        strParam = ans;

        return strParam;
	}
	
	public static boolean isValid(String s) {
		boolean isValid = true;
		if(s.length()<7 || s.length()>31) {
			isValid = false;
		}
		if(s.contains("password")) {
			isValid = false;
		}
		String upperCaseChars = "(.*[A-Z].*)";
        if (!s.matches(upperCaseChars ))
        {
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!s.matches(numbers ))
        {
//                System.out.println("Password must have atleast one number");
                isValid = false;
        }
        String specialChars = "(.*[@,#,$,%.!].*$)";
        if (!s.matches(specialChars ))
        {
//                System.out.println("Password must have atleast one special character among @#$%");
                isValid = false;
        }
        return isValid;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int hamming(String arr[]) {
		int count = 0;
		char arr1[] = arr[0].toCharArray();
		char arr2[] = arr[1].toCharArray();
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				count++;
			}
		}
		return count;
	}
	
	public static String decimal(long a, long b) {
		DecimalFormat df = new DecimalFormat("0.0000");
		String ans = df.format((double)a/(double)b);
		return ans;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
