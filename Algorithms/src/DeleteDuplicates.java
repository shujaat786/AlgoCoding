import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
public class DeleteDuplicates {

  public static void main(String[] args) {
 
    
     List<String> arrlst = new ArrayList<String>();
     arrlst.add("tech");
     arrlst.add("beamers");
     arrlst.add("java");
     arrlst.add("tech");
     arrlst.add("selenium");
     arrlst.add("shell");
 
  // Displaying the ArrayList elements 
     System.out.println("Before:");
     System.out.println("ArrayList contains: "+arrlst);
 
     // Creating a LinkedHashSet
     LinkedHashSet<String> linkhs = new LinkedHashSet<String>();
 
     /* Adding ArrayList elements to the LinkedHashSet
      * in order to remove the duplicate elements and 
      * to preserve the insertion order.
      */
     linkhs.addAll(arrlst);
  
     // Removing the ArrayList elements
     arrlst.clear();
 
     // Adding the LinkedHashSet elements to the ArrayList
     arrlst.addAll(linkhs);
 
     // Displaying ArrayList elements
     System.out.println("After:");
     System.out.println("ArrayList contains: "+arrlst);
     
     
     List<String> list2 = new ArrayList<String>();
     list2.add("wqwqfqf");
     
     list2.add("fwf");
     String[] str = list2.toArray(new String[list2.size()]);
     for(String a : str) {
    	 System.out.println(a);
    	 
     }
     
     
     
     
     
     
     
     
     
  }
}