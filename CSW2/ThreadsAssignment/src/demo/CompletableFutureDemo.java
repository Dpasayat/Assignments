package demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo 
{

	public static void main(String[] args) 
	{
		CompletableFuture<Integer> cf1  = CompletableFuture.supplyAsync(()->
		{
			 int n =(int)(Math.random()*100)*2 ;
			 System.out.println("Random Even Number: "+n);
			 return n;
		});
		
		CompletableFuture<Integer> cf2  = CompletableFuture.supplyAsync(()->
		{
			 int n =(int)Math.floor((Math.random()*200)) ;
			 System.out.println("Random Number: "+n);
			 return n;
		});
		
		CompletableFuture<Integer> comb  = cf1.thenCombine(cf2,(n1,n2)->{
			System.out.println("Arguments of Comb: "+n1+" "+n2);
			return n1*n2;});
		
		comb.join();
		try {
			System.out.println(cf1.get()+"*"+cf2.get()+"="+comb.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
