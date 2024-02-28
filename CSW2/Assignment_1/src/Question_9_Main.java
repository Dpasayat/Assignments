//Q9. Design a Java program for managing student enrollment in a university, adhering to the 
//principles of loose coupling and high cohesion. Your program should include classes for 
//representing students (`Student`), courses (`Course`), and enrollment management 
//(`Enrollment`). Ensure that the `Enrollment` class interacts with the other classes indirectly 
//through an interface class (`EnrollmentSystem`). Implement methods for enrolling and 
//dropping students from courses, and displaying enrollment details. Create a `Main` class to 
//demonstrate the system's functionality, with appropriate error handling and user-friendly output 
//messages. Provide comments in your code explaining how loose coupling and high cohesion 
//are maintained throughout the implementation

import java.util.ArrayList;

public class Question_9_Main 
{

	public static void main(String[] args) 
	{
		

	}

}

interface EnrollmentSystem
{
	void enroll(Courses c);
	void drop(Courses c);
}

class Students
{
	private String name,registration_number,branch;
	private ArrayList<Courses> courseList=new ArrayList<Courses>();

	public Students(String name, String registration_number, String branch) {
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
	
	
}
class Courses
{
	private String course_name,cource_code,Pattern;

	public Courses(String course_name, String cource_code, String pattern) {
		super();
		this.course_name = course_name;
		this.cource_code = cource_code;
		Pattern = pattern;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCource_code() {
		return cource_code;
	}

	public void setCource_code(String cource_code) {
		this.cource_code = cource_code;
	}

	public String getPattern() {
		return Pattern;
	}

	public void setPattern(String pattern) {
		Pattern = pattern;
	}
	
	
}
class Enrollment implements EnrollmentSystem
{

	@Override
	public void enroll(Courses c) 
	{
		
		
	}

	@Override
	public void drop(Courses c) 
	{
		// TODO Auto-generated method stub
		
	}
	
}

