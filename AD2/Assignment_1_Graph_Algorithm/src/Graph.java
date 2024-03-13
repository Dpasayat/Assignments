import java.util.*;

public class Graph {
    private int Vertices;
    private LinkedList<Integer>[] adjLists;
    
    private int d[],pre[];
    private String col[];
    private static LinkedList<Integer> Q= new LinkedList<Integer>();

    Graph(int V) 
    {
        Vertices = V;
        adjLists = new LinkedList[Vertices];
        d=new int[V];
        pre=new int[V];
        col=new String[V];
        for (int i = 0; i < V; ++i) {
            adjLists[i] = new LinkedList<Integer>();
            d[i]=0;
            pre[i]=-1;
            col[i]="W";
        }
    }

    public void addEdge(int src, int dest) 
    {
        adjLists[src].add(dest);
        adjLists[dest].add(src);
    }
    
    public void degree(int v)
    {
    	for(int i=0;i<v;i++)
    	{
    		System.out.println("degree of "+i+": "+adjLists[i].size());
    	}
    }
    public void printGraph(int V)
    {
    	 for (int i = 0; i < V; ++i) {
             System.out.print("Adjacency list of vertex " + i + ": ");
             for (Integer neighbor : adjLists[i]) {
                 System.out.print(neighbor + " ");
             }
             System.out.println();
         }
    }
    
    public void BFS(int s)
    {
    	col[s]="B";
    	Q.add(s);
    	while(!Q.isEmpty())
    	{
    		int u=Q.poll();
    		for(int i=0;i<adjLists[u].size();i++)
    		{
    			int v=adjLists[u].get(i);
    			if(col[v]=="W")
    			{
    				col[v]="B";
    				d[v]=d[u]+1;
    				pre[v]=u;
    				Q.add(v);
    			}
    		}
    		col[u]="G";
    	}
    	System.out.print("Dis: ");
    	
    	for(int i=0;i<Vertices;i++)
    	{
    		System.out.print(d[i]+" ");
    	}
    	System.out.print("\nPre: ");
    	
    	for(int i=0;i<Vertices;i++)
    	{
    		System.out.print(pre[i]+" ");
    	}
    	
    }
    public void printPath(int u,int v)
    {
    	if(u==v)
    	{
    		System.out.print(u+" ");
    		return;
    	}
    	else
    	{
    		printPath(u,pre[v]);
    		System.out.print("-> "+v);
    	}
    }
    
    public void DFS(int s)
    {
    	int pred[]=new int[Vertices];
    	String visited[]=new String[Vertices];
    	for(int i=0;i<Vertices;i++)
    	{
    		pred[i]=-1;
    		visited[i]="W";
    	}
    	dfsVisit(s,pred,visited);
    	
    }
    public void dfsVisit(int u,int[] pred, String[] visited)
    {
    	visited[u]="B";
    	for(int i=0;i<adjLists[u].size();i++)
		{
			int v=adjLists[u].get(i);
			if(visited[v]=="W")
			{
				visited[v]="B";
				pred[v]=u;
				dfsVisit(v,pred,visited);
				
			}
			
		}
    	visited[u]="G";
		System.out.println(u+" ");
    	
    }
    
    

    public static void main(String[] args) 
    {
        int V = 7; 
        Graph graph = new Graph(V);

        
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 6);
        graph.addEdge(2, 6);
        
        graph.printGraph(V);
        
        graph.degree(V);
        graph.BFS(0);
       
        
        for(int i=0;i<V;i++)
        {
        	System.out.print("\nPath from 0 to "+i+": ");
        	graph.printPath(0, i);
        	
        }
        System.out.println("\nPerforming DFS and printing path: ");
        graph.DFS(0);
        
    }
}
