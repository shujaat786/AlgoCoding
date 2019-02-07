import java.util.Arrays;
import java.util.List;

public class Test2 {
	public static boolean contains(Integer[] arr, Integer item) {
		List<Integer> list = Arrays.asList(arr);
		return list.contains(item);
	}	
	
	
	
	
	public static boolean testpresent(int[] arr , int item) {
		
		for(int a : arr) {
			if(item==a)
			{
				
				return true ;
			}
		}
		return false ;
		
		
	}
	
	
	

	public static void main(String[] args) {
		int[] myArray = { 5, 2, 17, 13, 12, 19, 7, 3, 9, 15 };
		//System.out.println(contains(myArray, 13));
		//System.out.println(contains(myArray, 25));
		
		System.out.println(testpresent(myArray ,15));
	}
}