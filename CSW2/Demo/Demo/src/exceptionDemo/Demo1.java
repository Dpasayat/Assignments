package exceptionDemo;
//sometimes one exception is caused by the other. So it is useful to get why the exception is occurring.
//In the following code ArithmeticException causes NullpointerException:
public class Demo1 
{
	static void demoproc() {
		 // create an exception
		 NullPointerException e =new NullPointerException("top layer");
		 // add a cause
		 e.initCause(new ArithmeticException("cause"));//initializes cause of Exception e.
		 throw e;
		 }
	static int divideByZero(int n)throws ArithmeticException
	{
		return n/0;
	}

	public static void main(String[] args) 
	{
		try {
			 demoproc();
			} 
		catch(NullPointerException e) {
			 // display top level exception
			 System.out.println("Caught: " + e);
			 // display cause exception
			 System.out.println("Original cause: " +e.getCause());
			 }
		try {
			divideByZero(6);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught: Divide by zero.");
		}
		
		

	}

}
