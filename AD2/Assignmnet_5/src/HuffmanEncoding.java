import java.util.*;
public class HuffmanEncoding 
{
	
	class HuffmanNode implements Comparable<HuffmanNode>
	{
		int f;
		char ch;
		HuffmanNode left;
		HuffmanNode right;
		HuffmanNode(char ch, int freq)
		{
			this.ch = ch;
			this.f = freq;
			left=right=null;
		}
		@Override
		public int compareTo(HuffmanNode o) 
		{
			
			return this.f-o.f;
		}
		
	}
	
	public void printTree(HuffmanNode root, String s)
	{
		if(root.left == null && root.right == null)
		{
			System.out.println(root.ch+" : "+s);
			return;
		}
		printTree(root.left,s+"0");
		printTree(root.right,s+"1");
	}
	
	public HuffmanNode HuffmanTree(char[] sym, int[]freq)
	{
		PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
		
		for(int i=0; i<sym.length; i++)
		{
			HuffmanNode node = new HuffmanNode(sym[i],freq[i]);
			pq.add(node);
		}
		HuffmanNode root=null;
		while(pq.size()>1)
		{
			HuffmanNode x=pq.poll();
			HuffmanNode y=pq.poll();
			
			root = new HuffmanNode('-',x.f+y.f);
			root.left=x;
			root.right=y;
			
			pq.add(root);
		}
		
		printTree(pq.peek(),"");
		return pq.peek();
		
	}
	
	public void decode(String code, HuffmanNode root)
	{
		char[] cd = code.toCharArray();
		HuffmanNode temp=root;
		for(char ch:cd)
		{
			if(ch=='0')
				temp=temp.left;
			else
				temp=temp.right;
			if(temp.right==null && temp.left==null)
			{
				System.out.print(temp.ch);
				temp=root;
			}
			
		}
	}

	public static void main(String[] args) 
	{
		char[] sym = {'c','a','k','t','r'};
		int[] freq = {75,30,105,280,110};
		HuffmanEncoding hq=new HuffmanEncoding ();
		HuffmanNode root=hq.HuffmanTree(sym,freq);
		String code="01011101111110";
		System.out.println("Decode "+code+" : ");
		hq.decode(code, root);

	}

}


//output:
// t : 0
// r : 10
// k : 110
// a : 1110
// c : 1111