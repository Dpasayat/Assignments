package question_9;
import java.util.*;
public class Q9 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hset=new HashSet<>();
		int a[]= {2,4,5,6,7,2,4,6};
		System.out.println("Array: "+Arrays.toString(a));
		System.out.println("Repeated elements are: ");
		for(int i:a)
		{
			if(hset.contains(i)) {
				System.out.print(i+" ");
			}
			else
			{
				hset.add(i);
			}
		}
		

	}

}
