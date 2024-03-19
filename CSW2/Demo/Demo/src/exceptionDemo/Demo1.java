package exceptionDemo;

public class Demo1 
{
	static void demoproc() {
		 // create an exception
		 NullPointerException e =new NullPointerException("top layer");
		 // add a cause
		 e.initCause(new ArithmeticException("cause"));
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
			 System.out.println("Original cause: " +
			 e.getCause());
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
