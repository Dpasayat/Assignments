
public class Demo
{

	public static void main(String[] args) 
	{
		Bank_Account b1=new Bank_Account("Dhiraj", "42200678", 5470.50f);
		System.out.println(b1);
		
		Bank_Account b2 = new Bank_Account("Dhiraj", "42200678", 5470.50f);
		Bank_Account b3 = new Bank_Account("Anjali", "42200567", 101010.50f);
		
		System.out.print("Using == operator, in this case checks for the address of the objects: b1==b2 ?: ");
		System.out.print(b1==b2 );
		System.out.println("\nb1: "+b1.address()+"\nb2: "+b2.address());
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Using .equals() method after overriding.");
		System.out.println("Are bank Accounts same ? ");
		System.out.println("b1:"+b1.toString()+"\nb2:"+ b2.toString()+"\nb3:"+ b3.toString());
		System.out.println("b1 & b2: " + b1.equals(b2));
		System.out.println("b1 & b3: " + b1.equals(b3));
		
	}

}


