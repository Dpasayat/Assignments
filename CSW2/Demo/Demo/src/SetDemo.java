import java.util.*;


public class SetDemo 
{

	public static void main(String[] args) 
	{
		Set<Integer> s=new HashSet<>();
		s.add(3);
		s.add(2);
		s.add(1);
		System.out.println(s);
		s.add(3);
		s.add(null);
		System.out.println(s);
		Set<Integer> s1=new LinkedHashSet<>();
		s1.add(3);
		s1.add(2);
		s1.add(1);
		System.out.println("\n"+s1);
		s1.add(3);
		s1.add(null);
		System.out.println(s1);
		
		
		Set<Integer> s2=new TreeSet<>();
		s2.add(3);
		s2.add(2);
		s2.add(1);
		System.out.println("\n"+s2);
		s2.add(3);
		//s2.add(null); //this throws an error as in TreeMap class it requires it to not be null.
		System.out.println(s2);
		
		/*commenting the equals and hash method makes it so that the set stores duplicate entry as it hashes it according to address.
		and contains() function doesn't work.*/
		Set<Student> st=new HashSet<>();
		st.add(new Student("Dhiraj",21,99));
		st.add(new Student("Dhanya",20,100));
		st.add(new Student("Dhiraj",21,99));
		System.out.println(st);
		System.out.println(st.contains(new Student("Dhanya",20,100)));
		

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