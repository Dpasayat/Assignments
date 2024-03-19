package exceptionDemo;

public class Demo2 
{// Throw an exception out of the method.
	 static void procA() 
	 {
		 try {
			 System.out.println("inside procA");
			 throw new RuntimeException("demo");
		 } 
		 finally 
		 {
			 //finally block executes even if there is an exception and method is terminated
			 System.out.println("procA's finally");
		 }
	}
		 // Return from within a try block.
	static void procB() 
	{
		 try 
		 {
			 System.out.println("inside procB");
			 return;
		 } 
		 finally 
		 {
			 //finally block is executed even when the function call returns before finally block 
			 System.out.println("procB's finally");
		 }
	}
		 // Execute a try block normally.
	static void procC() 
	{
		 try 
		 {
			 System.out.println("inside procC");
		 } 
		 finally 
		 {
			 //finally block is executed even without any errors!!
			 System.out.println("procC's finally");
		 }
	}
	public static void main(String args[]) 
	{
		 try 
		 {
			 procA();
		 } 
		 catch (Exception e)
		 {
			 System.out.println("Exception caught");
		 }
		 procB();
		 procC();
	}
}
