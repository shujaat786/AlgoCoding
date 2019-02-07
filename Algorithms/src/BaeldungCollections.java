import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class BaeldungCollections {

	public static void main(String[] args) {

		Integer i = new Integer(5);
		System.out.println(i);
		
		
		List<Integer> li = Arrays.asList(1,2,3,4,5,6);
		System.out.println(li.size());
		
		random_element() ;
		
		List<Integer> source = Arrays.asList(1, 2, 3);
		List<Integer> dest = Arrays.asList(5, 6, 7, 8, 9, 10);
		Collections.copy(dest, source);
		System.out.println(source);
	
	
	
	List<Integer> list = Arrays.asList(1,2,3,4 ,4,6,7,4);
	Integer[] targetArray = list.toArray(new Integer[list.size()]);
	//System.out.println(targetArray);
	for(int a : targetArray) {
		System.out.println(a);
		
	}
	
	
String s1 = new String("Shujaat");
String s2 = new String("Shujaat");
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2);
	
	
	
	Set<Integer>set = new HashSet<>(list);
	System.out.println(set.size());
	
	Map<String,Integer>hm = new HashMap<>();
	hm.put("ABC", 12);
	hm.put("RCSS", 11);
	hm.put("A1BC", 12);
	
	
	System.out.println(hm);
	
	
	
	
	}
	

	
	
	
	
	
	
	
	
	
	

	
	
	public static void random_element() {
		
		List<Integer> li = Arrays.asList(1,2,3,4,5,6);
		Random ran =  new Random();
		
		int randomelemrt = li.get(ran.nextInt(li.size()));
		System.out.println(randomelemrt);
	}
	
}
