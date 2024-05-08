package Threads_Demo;

public class Demo3 extends Thread
{
	static int counter=0;
	public void run()
	{
		counter--;
//		System.out.println(counter);
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Demo3 d = new Demo3();
		d.start();
		counter++;
		// below two lines do the same thing. The while(d.isAlive) is not preferred though.
//		d.join();
//		while(d.isAlive());
		System.out.println(counter);
		

	}

}
