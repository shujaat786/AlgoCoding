
class Access {

	public int x;

	private int y;

	void call(int a, int b) {

		x = a + 1;
		y = b;
	}

}







public class DBS1 {

	public static void main(String[] args) {

		Access obj = new Access();
		
		obj.call(2, 3);
	//	System.out.println(obj.x + " " + obj.y);
		
		int arr[] = new int[8];
		System.out.print(arr);
		
	}

}
