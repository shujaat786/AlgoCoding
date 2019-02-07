
public class InheritanceClass extends InnerClass {

	public static void main(String[] args) {
		
		InnerClass in = new InnerClass();
		System.out.println(in.x);
		// TODO Auto-generated method stub

		
		
		
		int a= 23;
		
		System.out.println(a/10);// gives quotient .
		System.out.println(a%10);// gives remainder.
		
		
		int b= 29;
		boolean flag = true;
		for(int i=2;i<=b/2;i++) {
			
			if(b%2 == 0){
				
				flag = false;
				break;
			}
			
		}
			if(flag)
			{
				
				System.out.println("Prime number");
			}
			else
				System.out.println("Not a prime number");
		
	}

}
