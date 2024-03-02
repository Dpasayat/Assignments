//Q9. Design a Java program for managing student enrollment in a university, adhering to the 
//principles of loose coupling and high cohesion. Your program should include classes for 
//representing students (`Student`), courses (`Course`), and enrollment management 
//(`Enrollment`). Ensure that the `Enrollment` class interacts with the other classes indirectly 
//through an interface class (`EnrollmentSystem`). Implement methods for enrolling and 
//dropping students from courses, and displaying enrollment details. Create a `Main` class to 
//demonstrate the system's functionality, with appropriate error handling and user-friendly output 
//messages. Provide comments in your code explaining how loose coupling and high cohesion 
//are maintained throughout the implementation
package question_9;

import java.util.ArrayList;

public class Question_9_Main 
{

	public static void main(String[] args) 
	{
		Course c1=new Course("DSA","CSE1001");
		Student s1=new Student("Dhiraj","2241016218","CSE");
		Student s2=new Student("Anand","2241019398","CSIT");
		c1.displayDetails();
		c1.enroll(s1);
		c1.enroll(s2);
		c1.displayDetails();
		c1.drop(s2);
		c1.displayDetails();
		
		Course c2=new Course("UHV","HSS101");
		c2.enroll(s2);
		c2.drop(s1);
		c2.displayDetails();
		c2.enroll(s2);
		
		
	}

}

interface EnrollmentSystem
{
	void enroll(Student s);
	void drop(Student s);
	void displayDetails();
}

class Student
{
	private String name,registration_number,branch;
	

	public Student(String name, String registration_number, String branch) {
		super();
		this.name = name;
		this.registration_number = registration_number;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistration_number() {
		return registration_number;
	}

	public void setRegistration_number(String registration_number) {
		this.registration_number = registration_number;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "\n[Name: " + name + ", Registration_number: " + registration_number + ", Branch=" + branch + "]";
	}
	
	
	
}
class Course implements EnrollmentSystem
{
	
	private String courseName,courseCode;
	private ArrayList<Student> students=new ArrayList<Student>();
	
	
	

	public Course(String courseName, String courseCode) {
		super();
		this.courseName = courseName;
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@Override
	public void enroll(Student s) 
	{
		

		try {
			if(this.students.contains(s))
			{
				throw new Exception();
			}
			else
			{
				this.students.add(s);
			}
		}
		catch(Exception e) 
		{
			System.out.println("Student already exists. ");
			
		}
		
	}

	@Override
	public void drop(Student s) 
	{
		try {
			if(this.students.contains(s))
			{
				this.students.remove(s);
			}
			else
			{
				throw new Exception();
			}
		}
		catch(Exception e) 
		{
			System.out.println("Student does not exists. ");
			
		}
		
	}

	@Override
	public void displayDetails() 
	{
		System.out.println("\n___________________________________________________________________");
		System.out.println("Couse: "+this.getCourseName()+"\nCode: "+this.getCourseCode());
		System.out.println("Enrolled students: "+this.students.toString());
		System.out.println("___________________________________________________________________");
		
	}
	
	
	
}
class Enrollment
{
	public static void enrollStudent(Course c,Student s)
	{
		c.enroll(s);
	}
	public static void dropStudent(Course c,Student s)
	{
		c.drop(s);
	}
	
}


