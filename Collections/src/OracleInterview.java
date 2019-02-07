import java.util.Scanner;

public class OracleInterview {

	public static void main(String[] args) {

		
		Scanner s= new Scanner(System.in);
		
		String str = "899393088";
		
		
         char[] ch = str.toCharArray();
		
		
		for(int i=0;i<str.length()-3;i++)
		{
			if(ch[i]==ch[i+1] && ch[i]==ch[i+2]) {
				
				System.out.println("fancy number");
			}
			else {
				
				System.out.println("not a  fancy");
			}
			
			//else if()
			
		}
	}
}
		
		

	
//	
//	