package exceptionDemo;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Demo of a custom Exception: ");
			System.out.println("Do you want to print a message? 1/0: ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter a message: ");
				String msg=sc.next();
				throw new myException(msg);
				//no need for break as break will be unreachable.
			case 0:
				throw new myException();
			default:
				System.out.println("bade teej ho rahe ho!! 1 or 0 dabao!!");
				main(null);
				
			}
		}
		catch(myException e)
		{
			System.out.println(e);
		}
		finally
		{
			//this will execute no matter what. If you are being "Bade teej" then it will execute as many times the main is called, figure out why yourself
			System.out.println("Finally block executed. ");
			sc.close();
		}

	}

}
class myException extends Exception
{
	private static final long serialVersionUID = 1L;
	myException(String s)
	{
		System.out.println("Idhar ye Exception hai: "+s);;
	}
	myException()
	{
		System.out.println("Meri marji!! idhar exception hai!!");
	}
	@Override
	public String toString()
	{
		return super.toString();
		
	}
	
}
