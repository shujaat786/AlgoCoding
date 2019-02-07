package StringAlgorithms;

public class Duplicate_Characters {

	public static void main(String[] args) {

		String str = "DUMMY";
		int cnt = 0;
		char[] arr = str.toCharArray();

		for(int i=0; i<str.length();i++) {
		
		for(int j = i+1;j<str.length();j++)
		
		{
		if(arr[i]==arr[j])
		{
			
			System.out.println("Duplicate character is : " +arr[j]);
			cnt++;
		}
			
			
			
			
		    }
		
		
		}
		
	}

}
