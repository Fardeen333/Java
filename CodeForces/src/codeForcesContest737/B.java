package codeForcesContest737;
import java.io.*;
import java.sql.ResultSetMetaData;
import java.text.DecimalFormat;
import java.util.*;


public class B {

     public static void main(String[] args) throws IOException {
         Reader.init(System.in);
         BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
         int t = Reader.nextInt();
         while ( t > 0){
             int n = Reader.nextInt();
             int k = Reader.nextInt();
             int i = 0;
             int arr[] = new int[n];
             int copy[]  = new int[n];
             int count = 0;
             while ( i < n){
                 arr[i] =Reader.nextInt();
                 copy[i] = arr[i];
                 i++;
             }
             Arrays.sort(copy);
             i = 1;
             int min = arr[0];
             while ( i < n){
                 int index = bs(0,n-1,copy,min);
                 if ( index == n-1){
                     count++;
                     min = arr[i];
                 }
                 else{
                     if ( arr[i] != copy[index+1]){
                         count++;
                     }
                     min = arr[i];
                 }
                 i++;
             }
             if ( count < k){
                 System.out.println("YES");
             }
             else{
                 System.out.println("NO");
             }
             t--;
         }

     }

     private static int bs(int low,int high,int[] arr,int find){
         if ( low <= high ){
             int  mid = low + (high-low)/2;
             if ( arr[mid] > find){
                 high = mid -1;
                 return bs(low,high,arr,find);
             }
             else if ( arr[mid] < find){
                 low = mid+1;
                 return bs(low,high,arr,find);
             }
             return mid;
         }
         return -1;
     }
     private  static int calculate(int a,int b,int mid){
         a = a - (mid*4);
         b = b - mid;
         if ( a > b){
             return 1;
         }
         else if ( a < b){
             return -1;
         }
         else{
             return 0;
         }
     }
    private static int max(int a, int b) {
         return  Math.max(a,b);
    }

    private static int min(int a,int b){
         return  Math.min(a,b);
    }

    public static long modularExponention(long a,long b,long mod){
        if ( b == 1){
            return a;
        }
        else{
            long ans = modularExponention(a,b/2,mod)%mod;
            if ( b%2 == 1){
                return (a*((ans*ans)%mod))%mod;
            }

            return ((ans*ans)%mod);
        }
     }

     public static long sum(long n){
         return  (n*(n+1))/2;
     }
     public static long abs(long a){
         return a < 0 ? (-1*a) : a;
     }
     public static long gcd(long a,long b){
         if ( a == 0){
             return b;
         }
         else{
             return gcd(b%a,a);
         }
     }


}

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;


    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {

            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }

    static long nextLong() throws IOException{
        return Long.parseLong(next());
    }
}