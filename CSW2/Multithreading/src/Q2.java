import java.io.*;
import java.util.concurrent.*;
public class Q2 
{

	public static void main(String[] args) 
	{
		String filePath = "C:\\Users\\dpasa\\OneDrive\\Desktop\\Assignments\\CSW2\\Multithreading\\src\\myfile.txt";
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
		{
			String line=null;
			while((line=reader.readLine())!=null)
			{
				final String finalLine = line;
				executor.submit(()-> processLine(finalLine));
			}
			
		}catch(Exception e) {e.printStackTrace();}
		finally
		{
			executor.shutdown();
		}

	}
	private static void processLine(String line)
	{
		System.out.println(" Line read: "+line);
	}
	

}
