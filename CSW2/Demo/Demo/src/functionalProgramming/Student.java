package functionalProgramming;

import java.util.Arrays;
import java.util.function.Function;

public class Student 
{
	String name,course;
	int age;
	double[] marks;
	double cgpa;
	Student(String name,int age,String course,double[] marks)
	{
		this.name=name;
		this.age=age;
		this.course=course;
		this.marks=Arrays.copyOf(marks, marks.length);
	}

	public static void main(String[] args) 
	{
		double[] marks1= {9.0,9.8,9.9,10.0};
		double[] marks2= {9.0,9.80};
		Student s1=new Student("Dhiraj",20,"Btech",marks1) ;
		Student s2=new Student("Jhon",24,"Mtech",marks2);
		cgpaBtech btech=new cgpaBtech();
		cgpaMtech mtech=new cgpaMtech();
		s1.awardStudent(btech);
		System.out.println(s1+"\nMarks: "+Arrays.toString(s1.marks));
		System.out.println("CGPA: "+s1.cgpa);
		s2.awardStudent(mtech);
		System.out.println(s2+"\nMarks: "+Arrays.toString(s2.marks));
		System.out.println("CGPA: "+s2.cgpa);
		
		double[] marks3= {3.3,4.4,5.0};
		Student s3=new Student("Neha",24,"Agera Wagera",marks3);
		//example of anonymous class
		s3.awardStudent(new cgpa_Students() {
			
			public double calc_cgpa(Student s) 
			{
				return (s.marks[0]+s.marks[1]+s.marks[2])/3*2;
			} 
		});
		System.out.println(s3+"\nMarks: "+Arrays.toString(s3.marks));
		System.out.println("CGPA: "+s3.cgpa);
		
		//example of lambda expression: we use a built in Function interface in util.Functions
		Function<Student,Double> ark=(Student s)->{
			
			return s.cgpa=(s.marks[0]+s.marks[1]+s.marks[2])/3*2;
		};
		Student s4=new Student("Sneha",24,"B.Arch",marks3);
		s4.cgpa=ark.apply(s4);
		System.out.println(s4+"\nMarks: "+Arrays.toString(s4.marks));
		System.out.println("CGPA: "+s4.cgpa);
		
		
		
				

	}
	public void awardStudent(cgpa_Students e)
	{
		this.cgpa=e.calc_cgpa(this);
		
	}
	public int grade(cgpa_Students cs)
	{
		this.cgpa=cs.calc_cgpa(this);
		if(cgpa>9)
			return 1;
		if(cgpa>8) return 2;
		if(cgpa>7) return 3;
		else return 4;
		
	}

	@Override
	public String toString() {
		return "---------------------------\n"+"name: " + name + "\nCourse: " + course + "\nAge: " + age;
	}
	

}

interface cgpa_Students
{
	public double calc_cgpa(Student s);
}

class cgpaBtech implements cgpa_Students
{

	@Override
	public double calc_cgpa(Student s) 
	{
		return (s.marks[0]+s.marks[1]+s.marks[2]+s.marks[3])/4;
	}	
	
}

class cgpaMtech implements cgpa_Students
{
	
	@Override
	public double calc_cgpa(Student s) 
	{
		return (s.marks[0]+2*s.marks[1])/3;
	}	
	
}
