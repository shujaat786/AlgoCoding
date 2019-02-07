package ComparableSorting;

public class Student implements Comparable<Student> {

	int rollno;
	String name;
	
	
	
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	} 
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	
	@Override 
	public int compareTo(Student student)
	{
		if(this.getRollno() < student.getRollno()) {
			return -1;
			}
		else if(this.getRollno() > student.getRollno()) {
			
			return 1;
		}
		else return 0;
		
	}
	
	
	
}
