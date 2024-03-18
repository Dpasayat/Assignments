package question_11;
import java.util.*;
public class Q11 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hset=new HashSet<>();
		int[] arr= {1,5,4,3,2,8,7,6,10};
		for(int i:arr)
		{
			if(!hset.contains(i))
				hset.add(i);
		}
		System.out.println("Array: "+Arrays.toString(arr));
		for(int i=1;i<=10;i++)
		{
			if(!hset.contains(i))
			{
				System.out.println("Smallest positive number missing: "+i);
				break;
			}
		}

	}

}
