package functionalProgramming;

import java.util.Arrays;

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
		Student s1=new Student("Dhiraj",20,"Btech",marks1) ;
		
				

	}
	public void calc_cgpa(cgpa_Students e)
	{
		if(course == "Btech")
		{
			cgpaBtech bt=new cgpaBtech();
			this.cgpa=bt.calc_cgpa(this);
		}
		else if(course=="Mtech")
		{
			cgpaMtech mt=new cgpaMtech();
			this.cgpa=mt.calc_cgpa(this);
		}
		
	}
	public int awardStudent(cgpa_Students cs)
	{
		this.cgpa=cs.calc_cgpa(this);
		if(cgpa>9)
			return 1;
		if(cgpa>8) return 2;
		if(cgpa>7) return 3;
		else return 4;
		
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
