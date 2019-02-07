import java.util.Arrays;

public class prime {
	
	// Java implementation of simple method to find 
	// minimum difference between any pair 


		// Returns minimum difference between any pair 
		static int findMinDiff(int[] arr, int n) 
		{ 
			// Initialize difference as infinite 
			int diff = Integer.MAX_VALUE; 
		
			// Find the min diff by comparing difference 
			// of all possible pairs in given array 
			for (int i=0; i<n-1; i++) 
				for (int j=i+1; j<n; j++) 
					if (Math.abs((arr[i] - arr[j]) )< diff) 
						diff = Math.abs((arr[i] - arr[j])); 
		
			// Return min diff	 
			return diff; 
		} 

		
	

	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		boolean flag =false;
		int number  =23;
		
		for(int i=2;i<=number/2;i++) {
			
			if(number%i==0) {
				
				
				flag= true;
				break;
			}
			
			
		}
		if(!flag) {
			System.out.println("it is a prime number");
		}
		
		else {
			System.out.println("Not a prime number");
		}
		
		int arr[] = new int[]{1, 5, 3, 19, 18, 25}; 
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println("Minimum difference is "+ 
							findMinDiff(arr, arr.length-1)); 
	
	}

}
