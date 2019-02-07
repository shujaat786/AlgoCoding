import java.util.Arrays;

public class Arraysduplicates {

	public static void main(String[] args) {

		
		int arr[] = {12,2,5,6,7,2,4,16,12,45,32,5};
		int n =arr.length;
		
		duplicate_check(arr,n);
		
		
		
	}
	
	static void printDistinct(int arr[], int n) 
    { 
        // Pick all elements one by one 
        for (int i = 0; i < n; i++) 
        { 
            // Check if the picked element  
            // is already printed 
            int j; 
            for (j = 0; j < i; j++) 
            if (arr[i] == arr[j]) 
                break; 
      
            // If not printed earlier,  
            // then print it 
            if (i == j) 
            System.out.print( arr[i] + " "); 
        } 
    }
	
	
	
	
	static void duplicate_check(int arr[],int n) {
		
		for (int i = 0; i < n; i++) 
        { 
            // Check if the picked element  
            // is already printed 
            int j; 
            for (j = 0; j < i; j++) 
            if (arr[i] == arr[j]) 
                break; 
      
            // If not printed earlier,  
            // then print it 
            if (i == j) 
            System.out.print( arr[i] + " "); 
        } 
		
		
		
		
	}
	
	 static void printDistinct2(int arr[], int n) 
	    { 
	        // First sort the array so that  
	        // all occurrences become consecutive 
	        Arrays.sort(arr); 
	      
	        // Traverse the sorted array 
	        for (int i = 0; i < n; i++) 
	        { 
	            // Move the index ahead while  
	            // there are duplicates 
	            while (i < n - 1 && arr[i] == arr[i + 1]) 
	                i++; 
	      
	            // print last occurrence of  
	            // the current element 
	            System.out.print(arr[i] +" "); 
	        } 
	    } 

}
