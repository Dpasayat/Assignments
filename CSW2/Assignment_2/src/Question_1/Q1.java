package Question_1;

import java.util.Objects;

public class Q1 
{
	public static void main(String[] args) 
	{
		Student<Integer> s1=new Student<Integer>("Dhiraj", 6218, 20);
		System.out.println("Roll Number as a String: ");
		System.out.println("S1: "+s1.toString());
		System.out.println("Type of roll number: "+s1.rollNo.getClass());
		System.out.println();
		
		System.out.println("Roll Number as a Integer                                                                                 : ");
		Student<String> s2= new Student<String>("Dhiraj", "6219", 20);
		System.out.println("S2: "+s2.toString());
		System.out.println("Type of roll number: "+s2.rollNo.getClass());
		
		
		Student<Integer> s3= new Student<Integer>("Ayush",6220,20);
		System.out.println("S3: "+s3);
		System.out.println("Student S1 compareTo S3: "+s1.compareTo(s3));
	}

}

class Student<T extends Comparable<T>> implements Comparable<Student<T>>  
{
	private String name;
	T rollNo;
	int age;
	public Student(String name, T rollNo, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getRollNo() {
		return rollNo;
	}
	public void setRollNo(T rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student<?> other = (Student<?>) obj;
		return age == other.age && this.name.equals(other.name) && this.rollNo.equals(other.rollNo);
	}
	
	@Override
	public int compareTo(Student<T> o) 
	{
		if(this.equals(o))
			return 0;
			else 
			{
				Student<T> other = (Student<T>) o;
				return this.getRollNo().compareTo(other.getRollNo());
				
			}
	}
	
	
	
}	
	
