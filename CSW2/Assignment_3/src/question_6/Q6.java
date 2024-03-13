package question_6;
import java.util.*;
public class Q6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(5);
		ts.add(2);
		ts.add(10);
		ts.add(6);
		System.out.println(ts);
		System.out.println("Enter a number to search in the Tree Set: ");
		int n=sc.nextInt();
		System.out.println(ts.contains(n));
		sc.close();
		

	}

}


