import java.text.ParseException;
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap; 
import java.util.List; 
import java.util.Map.Entry;
import java.util.Set; 
import java.util.TreeMap; 

public class HashMapSorting { 
	
	
	public static void main(String args[]) throws ParseException { 
		// let's create a map with Java releases and their code names 
		
		
		HashMap<String, String> codenames = new HashMap<String, String>(); 
		codenames.put("JDK 1.1.4", "Sparkler");
		codenames.put("J2SE 1.2", "Playground"); 
		codenames.put("J2SE 1.3", "Kestrel"); 
		codenames.put("J2SE 1.4", "Merlin");
		codenames.put("J2SE 5.0", "Tiger"); 
		codenames.put("Java SE 6", "Mustang"); 
		codenames.put("Java SE 7", "Dolphin"); 
		
		System.out.println("HashMap before sorting, random order "); 
		
		Set<Entry<String,String>> entries = codenames.entrySet();
		for(Entry<String,String> entry :entries) {
			
			System.out.println(entry.getKey() + "==>" + entry.getValue());
		}
		System.out.println("HashMap after sorting, random order "); 
		TreeMap<String,String> tm = new TreeMap<String,String>(codenames);
		Set<Entry<String,String>> treeentries = tm.entrySet();
		for(Entry<String,String> entry :treeentries) {
			
			System.out.println(entry.getKey() + "==>" + entry.getValue());
		}
		
		Comparator<Entry<String, String>> valueComparator = new Comparator<Entry<String,String>>() { 
			@Override 
			public int compare(Entry<String, String> e1, Entry<String, String> e2) { 
				String v1 = e1.getValue();
				String v2 = e2.getValue(); 
				return v1.compareTo(v2); 
				
			}
			}; 
			// Sort method needs a List, so let's first convert Set to List in Java 
			List<Entry<String, String>> listOfEntries = new ArrayList<Entry<String, String>>(entries); 
			// sorting HashMap by values using comparator
			Collections.sort(listOfEntries, valueComparator);
			LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listOfEntries.size());
			// copying entries from List to Map 
			for(Entry<String, String> entry : listOfEntries){
				sortedByValue.put(entry.getKey(), entry.getValue()); 
				
			}
			System.out.println("HashMap after sorting entries by values "); 
			Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet(); 
			for(Entry<String, String> mapping : entrySetSortedByValue){
				System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); } 
			
			
			
			
			
			
			
			

	}
}

