import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Son {
    public static void main(String args[] ) throws Exception {
      Scanner s = new Scanner(System.in);
      
      int n = s.nextInt();
      
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
          
          arr[i]= s.nextInt();
      }
      
int sum =0;
      
      for(int j=0;j<n;j++){
          sum = sum + arr[j];
      }
      
      System.out.print(sum);

    }
}
