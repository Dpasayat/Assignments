package Threads_Demo;

import java.util.concurrent.CompletableFuture;

public class fututeExample 
{

	public static void main(String[] args) 
	{
		CompletableFuture<String> s  = CompletableFuture.supplyAsync(()->
		{
			 return "Hello World";
		});
//		try {
//			System.out.println(s.get());
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s.isDone());
		
		CompletableFuture<String> p= p.thenApplyAsync((s)->{System.out.println(s);});

	}

}
