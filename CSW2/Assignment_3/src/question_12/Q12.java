package question_12;
import java.util.*;
public class Q12 
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int[] arr= {1,2,10,8,7,3,4,6,5,9};
		System.out.println("Array: "+Arrays.toString(arr));
		for(int i:arr)
		{
			pq.add(i);
		}
		System.out.println("Minheap: "+pq.toString());
		System.out.println("Repeated Dequeue: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(pq.poll());;
		}
	}

}
