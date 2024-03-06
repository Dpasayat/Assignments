package Question_1;


public class Q1_Unmodified 
{
	public static void main(String[] args) 
	{
		Student1<Integer> s1=new Student1<Integer>("Dhiraj", 6218, 20);
		System.out.println("Roll Number as a String: ");
		System.out.println("S1: "+s1.toString());
		System.out.println("Type of roll number: "+s1.rollNo.getClass());
		System.out.println();
		
		System.out.println("Roll Number as a Integer                                                                                 : ");
		Student1<String> s2= new Student1<String> ("Dhiraj", "6219", 20);
		System.out.println("S2: "+s2.toString());
		System.out.println("Type of roll number: "+s2.rollNo.getClass());
		
		
	}

}

class Student1<T>
{
	private String name;
	T rollNo;
	int age;
	public Student1(String name, T rollNo, int age) {
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
	
	
	
}	
	
