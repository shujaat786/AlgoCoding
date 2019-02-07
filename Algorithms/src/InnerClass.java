
public class InnerClass {

	 int x =10;
	
	
	static class Inner {
		
		int y=17;
		
		public static void main (String  args[]){
			InnerClass i = new InnerClass();
			System.out.println(i.x);
			
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Inner in = new Inner();
		System.out.println(in.y);
	}

}
