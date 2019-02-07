
public class TestPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	int x = 153;
	System.out.println(x%10);
	System.out.println(x/10);
	
	
	
	int r,sum=0,temp;    
	  int n=4549;//It is the number variable to be checked for palindrome  
	  
	  temp=n;    
	  while(n>0){    
	   r=n%10;  //getting remainder  
	   n=n/10;
	   sum=(sum*10)+r;    
	       
	  }    
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	} 
		
	

}
