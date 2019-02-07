package StringAlgorithms;

public class StringPalindrome {

	public static void main(String[] args) {

		
		
		System.out.println(stringPalindrome("MAMA"));
		
	}
	
	public static  boolean stringPalindrome(String word)
	{
		boolean result  = true;
		
		int h ,l;
		char ch[] =word.toCharArray();
		for(int i=0;i<word.length()-1;i++) {
		for(int j = word.length()-1;j>=0;j--) {
			
			if(ch[i] != ch[j]) {
				
				return false;
				
			}
			else
				
				return result;
			
			
			
		}
		                                  
		                                  
		                                  
			
			
			
			
			
		}
		
		
	
	
	
	return false;
	}

}
