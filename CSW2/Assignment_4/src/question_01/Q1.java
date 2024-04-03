package question_01;

public class Q1 
{

	public static void main(String[] args) 
	{
		try {
			String s=null;
			s=s.concat("1234");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}

	}

}
