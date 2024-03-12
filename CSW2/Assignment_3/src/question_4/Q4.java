package question_4;

import java.util.*;

public class Q4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> studList=new LinkedList<>();
		Student s1=new Student("Dhanya",21,99);
		Student s2=new Student("Anandita",25,79);
		Student s3=new Student("Anupama",22,89);
		Student s4=new Student("Ayushi",21,98);
		Student s5=new Student("Vaishali",20,100);
		Student s6=new Student("Vaishali",20,100);
		addToList(studList,s1,s2,s3,s4,s5,s6);
		//displaying the list:-
		System.out.println(studList);
		System.out.println("Enter a student object to check if it exists");
		Student check=new Student(sc.next(),sc.nextInt(),sc.nextInt());
		System.out.println("List contains the object?: "+studList.contains(check));
		System.out.println("Number of Students: "+studList.size());
		System.out.println("Douplicate Student entry: "+checkDouplicate(studList));
		sc.close();
	}
	static void addToList(LinkedList<Student> list,Student...values)
	{
		for(Student ob:values)
		{
			list.add(ob);
		}
	}
	static LinkedList<Student> checkDouplicate(LinkedList<Student> list)
	{
		LinkedList<Student> oList=new LinkedList<>(list);
		LinkedList<Student> output=new LinkedList<>();
		for(Student s:oList)
		{
			if(oList.indexOf(s) != oList.lastIndexOf(s))
			{
				oList.remove(s);
				output.add(s);
			}
		}
		return output;
	}

}

class Student 
{
	private String name;
	private int age, marks;
	
	Student()
	{
		super();
	}
	
	
	Student(String name, int age, int marks) 
	{
		this.name = name;
		this.age = age;
		this.marks = marks;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, marks, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && marks == other.marks && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "name: " + name + ", age: " + age + ", marks: " + marks +"\n";
	}
	
	
}