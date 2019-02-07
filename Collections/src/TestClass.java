
public class TestClass {

	public static void main(String[] args) {
		System.out.println(recursive(4,3));
		
		
		
		
	}
	
	
	public static int recursive(int x ,int y) {
		
		
		if(x==0)
			return y;
		return recursive(x-1, x+y);
	}

}
