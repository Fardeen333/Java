package geeksForGeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int n= sc.nextInt(); 
		    int d= sc.nextInt();
		
		    int arr[] = new int[n];
		    for(int i = 0; i<n ; i++){
		        arr[i]=sc.nextInt();
		    }
		    for(int i = 0; i<d; i++){
		        int temp=arr[0];
		        for(int j=0; j<n-1; j++){
		            arr[j]=arr[j+1];
		        }
		        arr[n-1]=temp; 
		    }
		
		    for(int i=0; i<n; i++){
		        System.out.print(arr[i]);
		    }
		    t--;
		    }
	}
}