import java.util.*;
public class Graph 
{
	int v;
	LinkedList[] adj;
	Graph(int n)
	{
		v=n;
		adj=new LinkedList[v];
		
	}
	void addEdge(int s, int d)
	{
		adj[s].add(d);
		adj[d].add(s);
		
	}
	public static void main(String[] args) 
	{

	}
	

}
