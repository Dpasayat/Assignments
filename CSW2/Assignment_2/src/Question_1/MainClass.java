package Question_1;



public class MainClass 
{

	public static void main(String[] args) 
	{
		Student<Integer> s1=new Student<Integer>("Dhiraj", 6218, 20);
		System.out.println("Roll Number as a String: ");
		System.out.println(s1.toString());
		System.out.println("Type of roll number: "+s1.rollNo.getClass());
		System.out.println();
		
		System.out.println("Roll Number as a Integer                                                                                 : ");
		Student<String> s2= new Student<String>("Dhiraj", "6218", 20);
		System.out.println(s2.toString());
		System.out.println("Type of roll number: "+s2.rollNo.getClass());
		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.hashCode()+"  "+s2.hashCode());
		
//		System.out.println(Objects.hash("Aar")+" "+ Objects.hash("Ab"));
//		System.out.println(s1.compareTo(s2));
		

	}

}
