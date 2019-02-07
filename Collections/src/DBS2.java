
public class DBS2 {

	static {

		System.out.println("static");
	}

	{

		System.out.println("block");
	}

	public DBS2() {

		System.out.println("A");

	}

	public static void main(String[] args) {
		DBS2 a = new DBS2();

	}

}
