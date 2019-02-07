import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {
	
	
	
	
	
	static void printFirstRespeating(int[] arr) {
		
		int min =-1;
		Set<Integer> set = new HashSet<>();
		for(int i=arr.length-1;i>=0;i--) {
			
			if(set.contains(arr[i])) {
				min =i;
				
			}
			else
				set.add(arr[i]);
			
			
		}
		if(min!=-1) {
			
			System.out.println("repeating element  of the array is "+ arr[min]);
		}
		
		else
		{
			System.out.println("No repeating element");
		}
		
		
		
	}

	public static void main(String[] args) {

		int[] arr= {1,2,4,2,3,5,6,3,11};
		
		printFirstRespeating(arr);
		
		
		
		
	}
	
	


}
