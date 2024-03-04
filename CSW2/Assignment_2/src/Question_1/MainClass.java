package Question_1;

public class MainClass 
{

	public static void main(String[] args) 
	{
		Student<String> s1=new Student<String>("Dhiraj", "2241016218", 20);
		System.out.println("Roll Number as a String: ");
		System.out.println(s1.toString());
		System.out.println("Type of roll number:");
		System.out.println(s1.rollNo.getClass());
		
		
		Student<Integer> s2= new Student<Integer>("Dhiraj", 6218, 20);
		System.out.println(s2.toString());
		System.out.println(s2.rollNo.getClass());

	}

}
