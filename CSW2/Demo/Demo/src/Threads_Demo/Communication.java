package Threads_Demo;

public class Communication{
	

	
	public static void main(String[] args) throws InterruptedException 
	{
		Communicator c = new Communicator();
	
		Runnable sender=()->{
			String[] secrets=new String[100];
			for(int i=0; i<secrets.length; i++)
			{
				secrets[i]=Integer.toString(i);
				System.out.println("Sent: "+secrets[i]);
				try {
					c.send(secrets[i]);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
					
		};
		Thread st= new Thread(sender);
		Thread rv= new Thread(receiver);
		rv.start();
		st.start();
		
		st.join();
//		t2.exit();

	}
	

}
class Communicator
{
		static String message;
		static boolean written=false;
	public void send(String s) throws InterruptedException
	{
		while(written);
		message=s;
		Communicator.written=true;
	}
	public void receive() throws InterruptedException
	{
		while(!written);
		Communicator.written=false;
		System.out.println("Received: "+message);
	}

}
