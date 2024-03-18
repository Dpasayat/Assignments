package question_11;
import java.util.*;
public class Q11 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> hmap=new HashMap<>();
		int[] arr= {1,5,4,3,2,8,7,6,10};
		for(int i:arr)
		{
			
			if(!hmap.containsKey(i))
				hmap.put(i, 1);
		}
		System.out.println("Array: "+Arrays.toString(arr));
		for(int i=1;i<=10;i++)
		{
			if(!hmap.containsKey(i))
			{
				System.out.println("Smallest positive number missing: "+i);
				break;
			}
		}

	}

}
