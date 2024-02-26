//Q5. Developing a Simple College Management System in Java
//Create a Java program for managing colleges and students. The provided classes model the 
//relationship between colleges and students.
//The College class represents a college with attributes collegeName and collegeLoc. The 
//Student class represents a student with attributes studentId, studentName, and a reference
//to a College object. Enhance the Student class by adding a constructor that assigns a student 
//ID, name, and college information. Additionally, add a method named displayStudentInfo()
//that prints the student's ID, name, and the college information in which they are enrolled.
//In the Main class, instantiate at least two College objects and at least two Student objects. 
//Enroll each student in one of the colleges. Then, display the information of all colleges and all 
//students using the appropriate methods.


public class Question_5 
{

	public static void main(String[] args) 
	{
		College soa=new College("ITER","Jagamara");
		College kiit=new College("KIIT","Patia");
		Student dkp=new Student("2241016218","Dhiraj Kumar Pasayat",soa);
		Student ap=new Student("2241016219","Anupam Patel",kiit);
		dkp.displayStudentInfo();
		ap.displayStudentInfo();
		

	}

}

class College
{
	private String collegeName,collegeLoc;

	public College(String collegeName, String collegeLoc) {
		super();
		this.collegeName = collegeName;
		this.collegeLoc = collegeLoc;
	}

	@Override
	public String toString() {
		return "College Name=" + collegeName + "\nCollege Location=" + collegeLoc;
	}
	
	
}

class Student
{
	private String studentId,studentName;
	College cg;
	public Student(String studentId, String studentName, College cg) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.cg = cg;
	}
	public void displayStudentInfo()
	{
		System.out.println("_______________________________________________");
		System.out.println("Name: "+studentName+"\nID:"+studentId+"\n"+cg);
		System.out.println("_______________________________________________");
	}
	
	
}