import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ReverseString {
	
	
	public static void main(String...a) {
//first approach 		
		String input = "Geeks";
		
		StringBuilder input1 = new StringBuilder(); 
		  
        // append a string into StringBuilder input1 
        input1.append(input); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 
  
        // print reversed String 
        System.out.println(input1);
        
		//2nd approach
        
        char[] ch = input.toCharArray(); 
		  
        for (int i = ch.length-1; i>=0; i--) 
            System.out.print(ch[i]); 
        
  // 3rd approach      
        
      
        
        
        
        
        char[] ch1 = input.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : ch1) {
        	list.add(c);
        }
        Collections.reverse(list);
        ListIterator liq= list.listIterator();
        while(liq.hasNext()) {
        	
        	System.out.print(liq.next());
        }
        
        
        Set<String> set = new HashSet<>();
        set.add("Shujaat");
        set.add("Shujaat4");
        set.add("Shujaat");
        set.add("Shujaat1");
        System.out.println(set.size());
        
        Map<Integer,String>map = new HashMap<>();
        
        map.put(1, "A");
        map.put(1, "B");
        map.put(2, "A");
        System.out.println(map.size());
        
        Set<Entry<Integer, String>>mp = map.entrySet();
        
        for(Entry<Integer, String>key: mp) {
        	System.out.println(key.getKey() + " " + key.getValue());
        	
        	
        }
        
        
        
        
        
		
	}
	
	

}
