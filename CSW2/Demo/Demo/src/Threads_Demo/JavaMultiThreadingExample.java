package Threads_Demo;

public class JavaMultiThreadingExample extends Thread 
{
	 public void run() 
	 {
		 System.out.println("My newThread is Running 1 "+Thread.currentThread());
		 System.out.println("My newThread is Running 2 "+Thread.currentThread());
	 }
	 public static void main(String args[]) 
	 {
		 JavaMultiThreadingExample newThread = new JavaMultiThreadingExample();
		 newThread.start();
		
		 System.out.println("Current thread running 1 "+ Thread.currentThread());
		 System.out.println("Current thread running 2 "+ Thread.currentThread());
		 System.out.println("Current thread running 3 "+ Thread.currentThread());
		 System.out.println("Current thread running 4 "+Thread.currentThread());
		 System.out.println("Current thread running 5 "+ Thread.currentThread());
		 System.out.println("Current thread running 6 "+ Thread.currentThread());
		 // Try running the program multiple times, the print statements' sequences are not same every time !!
		 
	 }
}