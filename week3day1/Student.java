package week3day1;

public class Student extends Department {
	
	public void studentName(String name) {
	
	System.out.println(name);
	}
	public void studentDept(String Dept) {
		System.out.println(Dept);

	}
	public void studentId(int a) {
		
		System.out.println(a);

	}
	

	public static void main(String[] args) {
		
		Student data = new Student();
		data.collegeCode();
		data.collegeName();
		data.collegeRank();
		data.departmentName();
		data.studentName("Ananya");
		data.studentDept("Robotics");
		data.studentId(34);

	}

}
