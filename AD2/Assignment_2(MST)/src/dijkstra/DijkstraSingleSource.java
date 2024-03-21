package dijkstra;
import java.util.*;




public class DijkstraSingleSource 
{
	int V,E;
	ArrayList<Edge> allEdge;
	PriorityQueue<Vertex> pq;
	ArrayList<Edge> adjEdge[];
	ArrayList<Vertex> All_v;
	
	DijkstraSingleSource(int V,int E)
	{
		this.V=V;
		this.E=E;
		this.adjEdge=new ArrayList[E];
		this.allEdge=new ArrayList<>();
		this.pq=new PriorityQueue<>((v1,v2)->(v1.getD()-v2.getD()));
		All_v=new ArrayList<Vertex>(V);
		for(int i=0;i<V;i++)
		{
			this.adjEdge[i]=new ArrayList<>(); 
		}	
	}
	
	public void addEdge(int u,int v,int w)
	{
		Edge e=new Edge(u,v,w);
		this.allEdge.add(e);
		this.adjEdge[u].add(e);
		
	}

	public void Dijkstra(int s)
	{
		for(int i=0;i<=4;i++)
		{
			Vertex v;
			if(i==s)
			{
				v=new Vertex(i,0,-1);
			}
			else
			{
				v=new Vertex(i,Integer.MAX_VALUE,-1);
			}
			All_v.add(v);
		}
		for(Vertex temp:this.All_v)
		{
			this.pq.add(temp);
		}
		while(!pq.isEmpty())
		{
			Vertex curr=pq.poll();
			
			int cur=curr.id;
			for(int i=0;i<adjEdge[cur].size();i++)
			{
				Edge tedg=adjEdge[cur].get(i);
				Vertex t_u=All_v.get(tedg.u);
				Vertex t_v=All_v.get(tedg.v);
				if((t_u.d +tedg.w) < t_v.d)
				{
					pq.remove(t_v);
					t_v.pred=t_u.id;
					t_v.d=t_u.d+tedg.w;
					All_v.set(t_v.id,t_v );
					pq.add(t_v);
				}
				
			}
		}	
		for(Vertex v:All_v)
		{
			System.out.println("vertex: "+v.id+" Distance: "+v.d+" Predecessor "+v.pred);
		}
		
		
	}
	public void shortestPath(int s,int d)
	{
		Vertex temp=All_v.get(d);
		while(temp.pred!=-1)
		{
			System.out.print(temp.id+" <-- ");
			temp= All_v.get(temp.pred);
		}
		System.out.println(temp.id);
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		DijkstraSingleSource d=new DijkstraSingleSource(5,9);
		d.addEdge(0, 1, 10);
		d.addEdge(1,3,1);
		d.addEdge(0,2,5);
		d.addEdge(1,2,2);
		d.addEdge(2,1,3);
		d.addEdge(2,3,9);
		d.addEdge(2,4,2);
		d.addEdge(4,0,7);
		d.addEdge(4,3,6);

		d.Dijkstra(0);
		System.out.println("Shortest path from 0 to other vertices: ");
		for(int i=1;i<d.All_v.size();i++)
		{
			d.shortestPath(0,i);
		}
		
		
		

	}

}

class Vertex
{
	int id;
	int d;
	int pred;
	Vertex(int id,int d,int pred)
	{
		this.id=id;
		this.d=d;
		this.pred=pred;
	}
	public int getD()
	{
		return this.d;
	}
}
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
