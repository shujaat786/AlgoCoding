package StringAlgorithms;

public class CountWords {

	public static void main(String[] args) {

		
		String s = "welcome to candid java tutorial";
		
     int count =0;
     String arr[] = s.split(" ");

     for(int i=0;i<=arr.length-1;i++)
     System.out.print( " " +arr[i]);
     count++;
	
     
     System.out.println(arr.length);
	
	
	
	
	
	
	int nt = 1;
	 
	for (int i = 0; i < s.length() - 1; i++)
	{
		if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
		{
			nt++;

		}
	}
		System.out.println("Number of words in a string = " + nt);

}
}
