import java.util.*;
public class MST 
{
	int V,E;
	ArrayList<Edge> allEdge;
	ArrayList<Edge> MST_edge;
	ArrayList<Edge> adjEdge[];
	class Edge
	{
		int u,v,w;
		Edge(int u,int v,int w){
			this.u=u;
			this.v=v;
			this.w=w;
		}
		int weight()
		{
			return w;
		}
		@Override
		public String toString()
		{
			return this.u+"---"+this.v;
		}
	}
	MST(int V,int E)
	{
		this.V=V;
		this.E=E;
		allEdge=new ArrayList<>(E);
		MST_edge=new ArrayList<>(E);
		adjEdge=new ArrayList[V];
		for(int i=0;i<V;i++)
		{
			adjEdge[i]=new ArrayList<Edge>();
		}
		
		
		
	}
	
	
	public void addEdge(int u,int v,int w)
	{
		Edge e=new Edge(u,v,w);
		this.allEdge.add(e);
		
	}
	
	public void adjEdgeSort()
	{
		Comparator<Edge> wComparator=(e1,e2)->((int)(e1.weight()-e2.weight()));
		allEdge.sort(wComparator);
	}
	
	public void kruskalMST(int v)
	{
		//sorting all edges according to weight
		adjEdgeSort();
		//initializing set of all edges
		Set<Integer> set[]=new HashSet[v];		
		for(int i=0;i<v;i++)
		{
			set[i]=new HashSet<Integer>();
			set[i].add(i);
		}
		DisjoinedSet d=new DisjoinedSet(set);
		for(Edge e:allEdge)
		{
			if(d.findSet(e.u) != d.findSet(e.v))
			{
				this.MST_edge.add(e);
				d.union(e.u, e.v);
			}
		}
		
	}
	public void showMST()
	{
		int wt=0;
		for(Edge e:MST_edge)
		{
			System.out.println(e.u+"--"+e.v);
			wt+=e.w;
		}
		System.out.println("\nWeight: "+wt);
	}
	
	

	public static void main(String[] args) 
	{
		MST g=new MST(5,5);
		g.addEdge(0, 1, 2);
		g.addEdge(1, 2, 1);
		g.addEdge(2, 3, 3);
		g.addEdge(3, 4, 1);
		g.addEdge(4, 0, 5);
		
		g.kruskalMST(5);
//		System.out.println(g.MST_edge);
		g.showMST();

	}

}

class DisjoinedSet
{
	Set<Integer> set[];
	DisjoinedSet(Set<Integer> set[])
	{
		this.set=set;
	}
	public int findSet(int x)
	{
		for(int i=0;i<set.length;i++)
		{
			if(set[i].contains(x))
				return i;
			
		}
		return -1;
		
	}
	public void union(int x,int y)
	{
		
		int i=findSet(x);
		int j=findSet(y);
		if(i != j)
		{
			set[i].addAll(set[j]);
			set[j].clear();
			
		}
	}
}
