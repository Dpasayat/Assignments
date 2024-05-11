package exceptionsClassWork;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) 
	{
		Student s1=new Student("Dhiraj",21);
		Student s2=new Student("Anand",23);
		Student s3=new Student("Himanshu",22);
		Student s4=new Student("extra",99);
		Lecture l=new Lecture(123,"Chocolate Exploration","e-23");
		try {
			l.addStudent(s1);
			l.addStudent(s2);
			l.addStudent(s3);
			l.addStudent(s4);
		} 
		catch (InvalidStudentExceptionUnch e) 
		{
			
			e.printStackTrace();
		}
		finally
		{
			System.out.println(l);
		}
		try {
			l.emptySpot();
			l.emptySpot();
			l.addStudent(new Student());
		}
		catch (InvalidStudentExceptionUnch e) 
		{
			
			e.printStackTrace();
		}
		try {
			l.emptySpot();
			
			
		}
		catch (InvalidStudentExceptionUnch e) 
		{
			
			e.printStackTrace();
		}

	}

}

class Lecture
{
	int classId;
	String sub;
	String roomno;
	Student[] studList=new Student[3];
	Lecture(int classId,String sub,String roomno)
	{
		this.classId=classId;
		this.sub=sub;
		this.roomno=roomno;
	}
	static int idx=-1;
	public void addStudent(Student s)throws InvalidStudentExceptionUnch
	{
		++idx;
		if(idx>=studList.length)
			throw new InvalidStudentExceptionUnch("Cannot admit more than 3 students.");
		studList[idx]=s;
	}
	public void emptySpot() throws InvalidStudentExceptionUnch
	{
		--idx;
		if(idx<0)
			throw new InvalidStudentExceptionUnch("Lecture is already empty");
	}
	@Override
	public String toString() {
		return "classId=" + classId + ", sub=" + sub + ", roomno=" + roomno + "\n studList="
				+ Arrays.toString(studList) + "]";
	}
	
}




class Student 
{
	String name;int age;
	Student()throws InvalidStudentExceptionUnch
	{
		throw new InvalidStudentExceptionUnch("Student name cannot be empty");
		
	}
	Student(String name,int age)
	{
		
		this.name=name;
		this.age=age;
	}
	public static void addStudent(Student s) throws InvalidStudentExceptionUnch
	{
		if(s.age<0 || s.age>40)
		{
			throw new InvalidStudentExceptionUnch("Invalid age..");
		}
		if(s.name=="")
			throw new InvalidStudentExceptionUnch("Invalid name..");
		
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]\n";
	}
	
}
class InvalidStudentExceptionUnch extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	InvalidStudentExceptionUnch(String msg)
	{
		super(msg);
	}
	InvalidStudentExceptionUnch(String msg,Exception e)
	{
		super(msg,e);
	}
	InvalidStudentExceptionUnch()
	{
		super();
	}
	
}
