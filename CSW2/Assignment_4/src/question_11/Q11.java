package question_11;
import java.util.*;
public class Q11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the value to calculate  sqrt(abs(sin(x) *\r"+ "cos(x))) / (tan(x) + 1)");
	
		double x=sc.nextDouble();
		try {
			double r=x%Math.PI/2;
			if(Math.abs(r-Math.PI/2) <= 0.0000001)
				throw new InvalidTanException("tan(Pi/2) is not defined");
			
			
			double res=Math.sqrt(Math.abs(Math.sin(x)*Math.cos(x)))/(Math.tan(x)-1);
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
		}
	}

}
class InvalidTanException extends Exception
{
	private static final long serialVersionUID = 1L;
	InvalidTanException(String msg,Throwable t)
	{
		super(msg,t);
	}
	InvalidTanException(String msg)
	{
		super(msg);
	}
	InvalidTanException()
	{
		System.out.println(this.getStackTrace());
	}
	
}
