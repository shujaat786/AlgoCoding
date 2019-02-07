
public class Power {

	public static void main(String[] args) {

		System.out.println(findPower(4,2));
		System.out.println(findPower2(5,3));
		
		
	}
	
	public static long findPower(int x,int y) {
		if(y==0)
		{
			return 1;
			
		}
		while(y>1)
		{
			x *=x;
			y--;
		}
		return  x;
		
		
	}
	
	private static long findPower2(int x, int y) {
		if (y == 0)
			return 1;
		return x * findPower2(x, y - 1);
	}
}
