import java.util.ArrayList;
import java.util.ListIterator;

class Test { 
    public static void main(String[] args) 
    { 
        ArrayList<String> list = new ArrayList<String>(); 
  
        list.add("A"); 
        list.add("B"); 
        list.add("C"); 
        list.add("D"); 
        list.add("E"); 
        
        for(int i=0; i<list.size();i++) {
        	
        	System.out.println(list.get(i));
        }
  
        // ListIterator to traverse the list 
        ListIterator iterator = list.listIterator(); 
  
        // Traversing the list in forward direction 
        System.out.println("Displaying list elements in forward direction : "); 
  
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
  
        System.out.println(); 
  
        // Traversing the list in backward direction 
        System.out.println("Displaying list elements in backward direction : "); 
  
        while (iterator.hasPrevious()) 
            System.out.print(iterator.previous() + " "); 
  
        System.out.println(); 
    } 
} 