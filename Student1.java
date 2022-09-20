package Assignment;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Student1 {
	/***Class: Students
   888888 Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by
 id & 
name, by email & phoneNumber**************/
	public void getStudentInfo(int id) {
		
		// TODO Auto-generated method stub
		System.out.println("My Id:"+id);

	}
	public void getStudentInfo(int id,String name) {
		System.out.println("My id " +id + " and My name:"+name);
	
	}
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println("email Id:" +email + " Phonenumber:"+phonenumber);
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stud = new Student1();
		stud.getStudentInfo(9);
		stud.getStudentInfo(98,"dudu");
		stud.getStudentInfo("krgr@gmail.com",908076886);
		
		
		

	}

}
