import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Test {



    // Complete the oddNumbers function below.
    static int oddNumbers(int l, int r) {
        int i=0 ;
    	
    	if(l<=0 || r>0){ 
            System.out.println("Out of bounds");
         }
        for( i=l ;i<r;i++){
         if(i%2 !=0){
             System.out.print(i);
         }

        }
        return  i ;
         


    }
    
    
    public static String evenOdd(int n) {
		String s = "";

		if (n % 2 == 0) {
			s = n + " is an even number";
		} else {
			s = n + " is an odd number";
		}

		return s;

	}
    
    

    public static void main(String[] args) throws IOException {
       Scanner s = new Scanner(System.in);
       int l =s.nextInt();
      


              System.out.println(evenOdd(l));

        s.close();
    }
}
