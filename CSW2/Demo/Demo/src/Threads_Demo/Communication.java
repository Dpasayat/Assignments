package Threads_Demo;
/*
 * -Here we use lock.wait() and lock.notifyAll() to ensure that sent is executed first then receive in alternate manner.
 * -We also use a written flag to implement it.
 * -Using while(written); on its own does not work, as there is not a guarantee that both method work alternatively.
 * also the above method does not work at all and is inconsistent as hell, I don't know why but it is
 * -Using lock.wait() ensures that CPU is not busy-waiting, which is more efficient.
 * -lock's method only works in a synchronized block, hence it is wrapped in one. 
 * 
 * -on a small note, the written flag should be set to false first to ensure that sent is run before receive.
 * -also lock can be implemented using any random object as wait() and notifyAll() function is present in Object class
 * try it yourself, I don't want to right now...
 */
public class Communication
{
	

	
	public static void main(String[] args) throws InterruptedException 
	{
		Communicator c = new Communicator();
	
		Runnable sender=()->{
			String[] secrets=new String[100];
			for(int i=0; i<secrets.length; i++)
			{
				secrets[i]=Integer.toString(i);
				
				try {
					c.send(secrets[i]);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable receiver = ()->{
			for(int i=0;i<100;i++)
			{
				try {
					c.receive();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
					
		};
		Thread st= new Thread(sender);
		Thread rv= new Thread(receiver);
		st.start();
		rv.start();
		


	}
	

}
class Communicator
{
		static String message;
		static boolean written=false;
		String lock = "Sr";
	public void send(String s) throws InterruptedException
	{
		synchronized(lock)//this is a simple synchronized block, similar to the previous implementation, this implementation is helpful when there is only one or two lines that are important
		{
			//we could also use synchronize(this){} 
			while(written) lock.wait(); // finally it works!!! 😒
			message=s;
			
			Communicator.written=true;
			System.out.println("Sent: "+message);
			lock.notifyAll();//this is an important statement!!
			
		}
	}
	public void receive() throws InterruptedException
	{
		synchronized(lock)
		{
			while(!written) lock.wait();;
			
			Communicator.written=false;
			System.out.println("Received: "+message);
			lock.notifyAll();//this too is important;
			
		}
	}

}
