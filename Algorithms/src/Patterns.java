
public class Patterns {

	public static void main(String[] args) {

		
		String str = "HELLO" ;
		char ch[] = str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch[j]);
				
				
			}
			System.out.println();
			
		}
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
				
				
			}
			System.out.println();
			
		}
		
		System.out.println("pattern two");
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j>=i;j--) {
				System.out.print("*");
				
				
			}
			System.out.println();
			
		}
		
		printTriagle(5);
		
		printStars(6);
		
		
	}

	
	public static void printTriagle(int n) 
    { 
        // outer loop to handle number of rows 
        //  n in this case 
        for (int i=0; i<n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=n-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
    } 
	
	
	
	public static void printStars(int n) 
    { 
        int i, j; 
  
        // outer loop to handle number of rows 
        //  n in this case 
        for(i=0; i<n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for(j=2*(n-i); j>=0; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
             
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
              
            // ending line after each row 
            System.out.println(); 
        } 
    } 
}
