package StringAlgorithms;

public class ReverseString {

	public static void main(String[] args) {

		
		//String reversal without using a for loop
		String str = "JAVA";
		StringBuilder sb =  new  StringBuilder();
		sb.append(str);
		System.out.println(sb.reverse());
		
		
		//reverse a string using a for loop
		char ch[] = str.toCharArray();
		
		for( int i=str.length()-1;i>=0;i--)
		{
			
			System.out.print(ch[i]);
		}
		
		System.out.println(reverseRecursively("Shujaat"));
		
		
		String s1 = "ABC";
		System.out.println(s1.substring(1));
		System.out.println(s1.charAt(0));
	}
	
	
	
	
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }



}
