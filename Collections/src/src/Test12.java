package src;


import java.io.BufferedReader;
import java.io.InputStreamReader;
 

import java.util.*;
 
 
class Test12 {
    
   public  static String isEqual(String s1, String s2) {
		boolean isEqual = false;
		char [] arrS1 = s1.toCharArray();
		Arrays.sort(arrS1);
		char [] arrS2 = s2.toCharArray();
		Arrays.sort(arrS2);
		
		if(Arrays.equals(arrS1, arrS2)) {
			isEqual = true;
		}
		
	
		
		if(isEqual) {
			return "YES";
		}
		else {
			return "NO";
		}
				
	}
    
   
   public static String Equal(String s1 ,String s2) {
	   boolean flag =false;
	   char[] ch1= s1.toCharArray();
	   char[]ch2 =s2.toCharArray();
	   Arrays.sort(ch1);
	   Arrays.sort(ch2);
	   
	   if(Arrays.equals(ch1, ch2)){
		   flag =true;
	   }
	   if(flag) {
		   return "YES";
	   }
	   
	   else
	   {
		   
		   return "NO";
	   }
	   
	   
	   
	   
	   
   }
   
   
    public static void main(String args[] ) throws Exception {
        
        Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.nextLine();
		for(int i=0; i<T; i++) {
			String s1 = scan.nextLine();
			String [] s2 = s1.split(" ");
			System.out.println(isEqual(s2[0], s2[1]));
		}
 
    }
}
