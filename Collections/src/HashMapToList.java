import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToList {

	public static void main(String[] args) {

		
		Map<String,String> gfg =new HashMap<String,String>();
		
		gfg.put("GFG", "geeksforgeeks.org"); 
        gfg.put("Practice", "practice.geeksforgeeks.org"); 
        gfg.put("Code", "code.geeksforgeeks.org"); 
        gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
		
        
        for(Map.Entry<String, String>entry : gfg.entrySet()) {
        	System.out.println("Key" + entry.getKey() +  "==>" +  "Value" +entry.getValue());
        	
        }
        
        
        Set<Entry<String,String>>entryset = gfg.entrySet();
        
        ArrayList<Entry<String,String>> listofEntries = new ArrayList<Entry<String,String>>(entryset);
	
	
	for(Entry<String,String>entries:listofEntries)
	{
		System.out.println(entries.getKey() +     "Values" + entries.getValue());
		
	}
	
	
	System.out.println(1.0/0.0);
	
	}

}
