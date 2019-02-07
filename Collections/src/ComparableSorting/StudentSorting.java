package ComparableSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentSorting {

	public static void main(String[] args) {

		List<Student> list= new ArrayList<Student>();
		list.add(new Student(12,"Shujaat"));
		list.add(new Student(11,"Haider"));
		list.add(new Student(10,"Rajab"));
		list.add(new Student(18,"Papa"));
		list.add(new Student(21,"Mummy"));
		list.add(new Student(7,"Inayat"));
		list.add(new Student(1,"Kahkasha"));
		
		System.out.println("Students List before Sorting" + list);
		
		Collections.sort(list);
		
		System.out.println("Students List After Sorting" + list);
		
		

		// Sort employees by Name
        Comparator<Student> employeeNameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student e1, Student e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };
        
        Comparator<Student> employeeNameComparator2 = new Comparator<Student>() {
            @Override
            public int compare(Student e1, Student e2) {
                
            	
            	if(e1.getRollno() > e2.getRollno()) {
            		
            		return 1 ;
            	}
            	else 
            		return -1 ;
            }
        };
        
        
        Collections.sort(list,employeeNameComparator2);
        
        for(Student s : list) {
        	
        	System.out.println(s);
        	
        }
        
        
        
        Collections.sort(list, employeeNameComparator);
        System.out.println("\nEmployees (Sorted by Name) : " + list);
        
        
		
	}

}
