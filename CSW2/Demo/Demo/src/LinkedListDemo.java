import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(5);
		Integer x=list.removeFirst();
		System.out.println(x);
		PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
		q.add(4);
		q.add(3);
		q.add(9);
		q.add(5);
		System.out.println("Priority Queue: "+q);
		System.out.println("top: "+q.peek());
		System.out.println(q.poll()+" removed");
		System.out.println("top: "+q.peek());
		ArrayList<LinkedList<Integer>> l=new ArrayList<>(5);
		l.add(new LinkedList<Integer>());
		l.add(new LinkedList<Integer>());
		l.add(new LinkedList<Integer>());
		l.add(new LinkedList<Integer>());
		l.get(0).add(5);l.get(0).add(5);l.get(0).add(5);l.get(0).add(5);
		l.get(1).add(4);l.get(1).add(4);l.get(1).add(4);l.get(1).add(4);
		
		ListIterator<LinkedList<Integer>> it=l.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		

	}

}
