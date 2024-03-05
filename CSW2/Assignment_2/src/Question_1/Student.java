//Q1. Write a program to create a Student class that has members, name, roll
//number, and age. Design the Student class in such a way that it can take
//the roll number as an integer or string. Create a driver class that creates
//student objects and invokes the methods.

package Question_1;

import java.util.Objects;

public class Student<T extends Comparable> implements Comparable<Student<T>>
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
		
//		if(this.equals(o))
//		{
//			return 0;
//		}
//		else 
//		{
		
				return this.rollNo.compareTo(o.rollNo);
//			else
//				return 1;
//			
		}
	}
	
	
	
	
	


	//@Override
//	public int compareTo(Student<T> o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}}
//}
