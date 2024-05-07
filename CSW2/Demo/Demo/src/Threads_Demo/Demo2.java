package Threads_Demo;

public class Demo2 extends Thread
{

	public static void main(String[] args) 
	{
		
		Thread t = new Thread(new worker());
		t.setPriority(MAX_PRIORITY);
		t.start();
		Runnable r = ()->{printEven(50);};
		Thread t3 = new Thread(r);
		t3.start();
		Thread t2= new Thread(new worker2(true));
		t2.setPriority(MIN_PRIORITY);
		t2.start();
		for(int i=0;i<=12;i++)
		{
			int ran = (int)Math.round(Math.random());
			if(ran==0)
				System.out.println("HELLLOOOOOOOOOOO");
			
		}
		
		System.out.println("-----------------Interrupt: May get Executed in between--------------------------------");
		
		//below statements ensures that both the threads are finished first.
		try {
			t.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("--------------Finish: Always gets executed at the end----------------------------------");
		

	}
	public void printPrime()
	{
		for(int i = 0; i <= 50; i++)
		{
			if(isPrime(i))
				System.out.println("Prime: "+i);
		}
	}
	public static void printEven(int n)
	{
		for(int i = 1; i<=n;i++)
		{
			if(i%2==0)
				System.out.println("Even: "+i);
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public boolean isPrime(int n)
	{
		for(int i = 2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0) return false;
			try {
				Thread.sleep(45);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

}
class worker implements Runnable
{
	Demo2 ob = new Demo2();

	@Override
	public void run() 
	{
		
		ob.printPrime();
		
	}
	
}


class worker2 implements Runnable
{
	boolean odd;
	public worker2(boolean flag)
	{
		odd = flag;
	}
	
	@Override
	public void run()
	{
		if(odd)
		{
			for(int i = 1;i<=10; i+=2)
			{
				System.out.println("Odd: "+i);
				try {
					Thread.sleep(55);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
	}
}
