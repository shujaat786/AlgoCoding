import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		String[] word = str.split(" ");
		
		Map<String,Integer>hm = new HashMap<>();
		
		for(String st : word) {
			
			if(hm.get(st)!=null) {
				hm.put(st, hm.get(st)+1);
			}
			else
			{
				hm.put(st, 1);
			}
			
			
			
		}
		
		Set<String>set = hm.keySet();
		for(String s1 : set) {
			
			if(hm.get(s1)>1) {
			System.out.println("word" + str + "times" + hm.get(s1));
		}
		
		
		
		
		
	}

	}
}
