import java.util.Scanner;

public class DPFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Fib(x);
		System.out.print(fibonacci(6));

	}

	
	public static int Fib(int n)
	{
		
		
		if(n==1 || n==2)
		{
			return 1;
		}
		return Fib(n-1) + Fib(n-2);
	}
	
	public static int fibonacci(int number) {
		
		if(number == 1 || number == 2)
		{ return 1; } 
		
		return fibonacci(number-1) + fibonacci(number -2); //tail recursion }

	}
}
