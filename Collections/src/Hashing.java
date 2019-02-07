import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Hashing {

	public static void main(String[] args) {

		
		
		Map<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(7, "A");
		hm.put(2, "B");
		hm.put(1, "F");
		hm.put(4, "S");
		
		
		Set<Entry<Integer,String>>set = hm.entrySet();
		for(Entry<Integer,String>ent :set) {
			System.out.println(ent.getKey() + " ==> " + ent.getValue());
		}
		/*
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>(hm);
		Set<Entry<Integer,String>>st = tm.entrySet();
		for(Entry<Integer,String>tree:set) {
			System.out.println(tree.getKey()+ " --" + tree.getValue());
		}
		*/
		
	//System.out.println(hm);
	
		
		Map<String, String> mp = new HashMap<>();
		mp.put("A", "Atul");
		mp.put("V", "Shujaat");
		mp.put("g", "Ahuaat");
		mp.put("h", "hujaat");
		mp.forEach((k, v) -> {
		System.out.println(k + " " + v);
		});

		HashMap<Integer,Integer> hm2 = new HashMap<Integer, Integer>();
		Map<String, String> mp2 = new HashMap<>();
		mp2.put("A", "Atul");
		mp2.put("V", "Shujaat");
		mp2.put("g", "Ahuaat");
		mp2.put("LP", "hujaat");
		mp2.forEach((k, v) -> {
		System.out.println(k + " " + v);
		});
      
	}

}
