package Threads_Demo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.ArrayList;

public class BankMultiThreading extends Thread
{
	static DecimalFormat df = new DecimalFormat("#.##");
	static double accounts[] = new double[10];
	BankMultiThreading()
	{
		for(int i=0; i<accounts.length;i++)
		{
			accounts[i]=10;
		}
	}
	
	public synchronized void transfer(int from, int to, double amount)
	{
		if(accounts[from]>=amount)
		{
			accounts[from]-=amount;
			accounts[to]+=amount;
			System.out.println(df.format(amount)+ " transferred from "+from+" to "+to);
		}
		else
		{
			System.out.println("Denied transfer from "+ from+" to "+ to+" amt: "+df.format(amount));
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{
		BankMultiThreading bo = new BankMultiThreading();
		int i;
		Thread td = null;
		ArrayList<Thread> tdArr=new ArrayList<>(10);
		for( i=0;i<10;i++)
		{
			final int from = i;
			Runnable t = ()->{
				for(int j=0;j<10;j++)
				{
					int to=(int) Math.floor(Math.random()*10);
					double amt = Math.random()*10;
					bo.transfer(from, to, amt);
				}
			};
			td = new Thread(t);
			tdArr.add(td);
			td.start();
		}
		for(Thread x:tdArr) x.join();
		
		System.out.println("\n\nBalance for each account: ");
		Arrays.stream(accounts).forEach(e -> System.out.print(df.format(e) + " " ));
		double totval=0;
		for(double bal:accounts) totval+=bal;
		System.out.println("\nTotal balance: "+totval);

	}

}
