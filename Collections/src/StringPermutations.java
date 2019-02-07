import java.util.Scanner;

public class StringPermutations {

	public static void main(String...args) {

		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		
		permute(str , 0 ,str.length()-1);
		
		
		
	}
	
	
	public static void permute(String st, int l, int r) {

		if (l == r) {

			System.out.println(st);
		}
		for (int i = l; i <= r; i++) {

			st = swap(st, l, r);
			permute(st, l + 1, r);
			st = swap(st, l, i);

		}

	}
	
	static String swap(String a, int i , int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp =charArray[i];
		charArray[i]=charArray[j];
		charArray[j] =temp;
		return String.valueOf(charArray);
		
	}
	

}
