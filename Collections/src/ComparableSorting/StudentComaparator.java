package ComparableSorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComaparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(12,"Shujaat"));
		list.add(new Student(11,"Haider"));
		list.add(new Student(10,"Rajab"));
		list.add(new Student(18,"Papa"));
		list.add(new Student(21,"Mummy"));
		list.add(new Student(7,"Inayat"));
		list.add(new Student(1,"Kahkasha"));
        System.out.println("Employees : " + list);

        // Sort employees by Name
        Comparator<Student> employeeNameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student e1, Student e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };

        /*
        The above Comparator can also be written using lambda expression like so =>
        employeeNameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());

        Which can be shortened even further using Java 8 Comparator default method
        employeeNameComparator = Comparator.comparing(Employee::getName)
        */

        Collections.sort(list, employeeNameComparator);
        System.out.println("\nEmployees (Sorted by Name) : " + list);

        // Sort employees by Rollno
        Comparator<Student> employeeSalaryComparator = new Comparator<Student>() {
            @Override
            public int compare(Student e1, Student e2) {
                if(e1.getRollno() < e2.getRollno()) {
                    return -1;
                } else if (e1.getRollno() > e2.getRollno()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        
        Collections.sort(list, employeeSalaryComparator);
        System.out.println("\nEmployees (Sorted by RollNo) : " + list);

        
    }
}