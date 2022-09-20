package Assignment;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
     System.out.println("Student Name:Kavitha");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Its Computer Science");

	}
	
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student Id:5443");

	}
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.depName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		
	}

}
