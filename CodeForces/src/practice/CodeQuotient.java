package practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CodeQuotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double d = 1.234567;
//		
//		System.out.println(Math.sqrt(10));
		
//		Scanner sc = new Scanner(System.in);
//		long x = sc.nextLong();
//		
//		
//		int n =56;
//		int ans = (int)(Math.sqrt(n));
//		System.out.println(ans);
//		
		String s = "Fardeen";
		char arr[] = s.toCharArray();
		System.out.println(String.valueOf(arr));
		System.out.println(Math.ceil(8.0/3));
		
        
		

	}
	public static void frequencyCount(int arr[], int N, int P)
    {
        if(P<=N){
            for(int i= 1; i<=P; i++){
                int count =0;
                for(int j=0; j<N; j++){
                    if(arr[j] == i){
                      count++;  
                    } 
                }
                System.out.print(count +" ");
            }
            int left = N - P;
            for(int j=1; j<=left; j++){
                System.out.print(0+" ");
            }
            System.out.println();
        }else if(P > N){
            for(int i =1; i<=N; i++){
                int count =0;
                for(int j=0; j<N; j++){
                    if(arr[j] == i){
                        count++;
                    }
                }
                System.out.print(count +" ");
            }
            System.out.println();
        }
    }
	
	

}
