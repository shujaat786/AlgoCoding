		// TODO Auto-generated method stub
		import java.io.*;
		import java.util.*;
		import java.text.*;
		import java.math.*;
		import java.util.regex.*;

public class StringCompare {
 public static void main(String[] args) throws IOException {
		        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		        String str = bf.readLine();
		        int k = Integer.parseInt(bf.readLine());
		        String min = str.substring(0, k);
		        String max = str.substring(0, k);
		        for(int i=1 ; i<=str.length()-k ; i++) {
		            String sub = str.substring(i, i+k);
		            if(min.compareTo(sub) > 0) {
		                min = sub;
		            }
		            else if(max.compareTo(sub) < 0) {
		                max = sub;
		            }
		        }
		        System.out.println(min);
		        System.out.println(max);
		    
		
	}

}
