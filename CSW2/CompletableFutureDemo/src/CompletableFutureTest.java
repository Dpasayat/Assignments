import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class CompletableFutureTest 
{

	public static void main(String[] args) 
	{
		

	}
	
	private static CompletableFuture<String> calculateAsynce()
	{
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		Executors.newCachedThreadPool().submit(()->{
			
		});
	}

}
