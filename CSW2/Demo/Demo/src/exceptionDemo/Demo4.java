package exceptionDemo;

public class Demo4 
{

	public static void main(String[] args) 
	{
		int divisor=(int)(Math.round(Math.random())); //randomly generates 0 or 1;
		int x=6;
		System.out.println("divisor: "+divisor);
		try
		{
			//if divisor is 0 the below code will throw Arithmetic exception implicitly else NullPointerException will be thrown. 
			x=x/divisor;
			
			throw new NullPointerException();
		}
		catch(ArithmeticException | NullPointerException ne)// you can catch multiple exception in one catch block this way. It was implemented Java 7 onwards
		{
			System.out.println("Caught: "+ne);
			
		}
		//if you want to go the traditional route, use this instead:
		try
		{
			//if divisor is 0 the below code will throw Arithmetic exception implicitly else NullPointerException will be thrown. 
			x=x/divisor;
			
			throw new NullPointerException();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Caught: "+ae);
			
		}
		catch(NullPointerException ne)
		{
			System.out.println("Caught: "+ne);
		}
		catch(Exception e)
		{
			System.out.println("Caught: "+e);
		}
		//keep in mind thought that the catch should be implemented keeping hierarchy in mind. For Example:
		// Exception class is super class of ArithmeticException so it should not be placed above it otherwise the Arithmetic exception will be unreachable which will cause an error.
	}

}
