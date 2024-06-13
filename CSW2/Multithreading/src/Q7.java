import java.util.concurrent.*;
public class Q7 
{

	public static void main(String[] args) 
	{
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(()->{
			int i= (int)Math.floor(Math.random()*100 +1);
			System.out.println("Task1 result: "+i);
			return i;
		});
		
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(()->{
			int i= (int)Math.floor(Math.random()*100 +1);
			System.out.println("Task2 result: "+i);
			return i;
		});
		
		CompletableFuture<Integer> result = future2.thenCombine(future1,(r1,r2)->r1+r2);
		
		try {
			System.out.println("Combined result: "+result.get());
		}catch(Exception e) {}
		
		
		
		
	}

}
