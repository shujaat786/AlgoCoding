package StringAlgorithms;

public class occurencesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Shujaat";
		
		System.out.println(str.length());
		System.out.println(str.replaceAll("a", "").length());
		int count = str.length() - str.replaceAll("a", "").length();
		System.out.println(count);
		
	}

}
