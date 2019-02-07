
public class Factorial {

	public static void main(String[] args) {

		
	int number = 6;
	long factorial = factrecursion(number);
	System.out.println("factorial of the given number is " + factorial);
	}
	
	public static int factrecursion(int number) {
		if(number >= 1)
		
		{
			
			return number*factrecursion(number -1);				
		}
		else return 1;
		
		
		
		
		
	}

}
