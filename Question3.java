import java.nio.channels.NonWritableChannelException;
import java.util.*;
public class Question3 {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt)
        {
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    static void createGraph2(ArrayList<Edge> graph)
    {
    graph.add(new Edge(0, 1, 2));
    graph.add(new Edge(0, 2, 4));

    graph.add(new Edge(1, 2, -4));
    //graph[1].add(new Edge(1, 2, 1));
    
    graph.add(new Edge(2, 3, 2));
    graph.add(new Edge(3, 4, 4));
    
    graph.add(new Edge(4, 1, -1));
   // graph[4].add(new Edge(4, 5, 5));

    }
    static void createGraph(ArrayList<Edge> graph[])
    {
    for(int i=0;i<graph.length;i++)
    {
        graph[i]=new ArrayList<>();
    }
   /* graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));

    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));

    graph[3].add(new Edge(3, 0));
    graph[3].add(new Edge(3, 4));

    graph[4].add(new Edge(4, 3));
    graph[0].add(new Edge(0, 3));
    graph[2].add(new Edge(2, 3));
    graph[3].add(new Edge(3, 1));
    graph[4].add(new Edge(4, 0));
    graph[4].add(new Edge(4, 1));
    graph[5].add(new Edge(5, 0));
    graph[5].add(new Edge(5, 2));*/
    graph[0].add(new Edge(0, 1, 2));
    graph[0].add(new Edge(0, 2, 4));

    graph[1].add(new Edge(1, 2, -4));
    //graph[1].add(new Edge(1, 2, 1));
    
    graph[2].add(new Edge(2, 3, 2));
    graph[3].add(new Edge(3, 4, 4));
    
    graph[4].add(new Edge(4, 1, -1));
   // graph[4].add(new Edge(4, 5, 5));

}
public static boolean detectCycle(ArrayList<Edge> graph[])
{
    boolean vis[]=new boolean [graph.length];
    for(int i=0;i<graph.length;i++)
    {
        if(!vis[1])
        {
           if(detectCycleUtil(graph,vis,i,-1))
           {
            return true;
            // cycle exits in one of the parts

           }
        }
    }
    return false;
}
public static boolean detectCycleUtil(ArrayList<Edge> []graph,boolean vis[],int curr,int par)
{
vis[curr]=true;
for(int i=0;i<graph[curr].size();i++)
{
    Edge e=graph[curr].get(i);
    // case 3
 if(!vis[e.dest])
 {
 if(detectCycleUtil(graph,vis,e.dest,curr))
 {
    return true;
 }
}
 // case 1

 else if(vis[e.dest]&& e.dest!=par)
 {
    return true;
 }
 // case 2-> do nothing -> continue;

}
return false;
}
public static boolean isBipartite(ArrayList<Edge>[] graph)
{
    int col[]=new int[graph.length];
    for(int i=0;i<col.length;i++)
    {
        col[i]=-1;
    }
    Queue<Integer> q=new LinkedList<>();
    for( int i=0;i<graph.length;i++)
    {
        if(col[i]==-1)
        {
            q.add(i);
            col[i]=0;
            while(!q.isEmpty())
            {
                int curr=q.remove();
                for(int j=0;j<graph[curr].size();j++)
                {
                    Edge e=graph[curr].get(j);// e.dest
                    if(col[e.dest]==-1)
                    {
                        int nextcol=col[curr]==0?1:0;
                        col[e.dest]=nextcol;
                        q.add(e.dest);
                    }else if(col[e.dest]==col[curr])
                    {
                        return false;// not bipartite
                    }
                }
            }
        }
    }
    return true;
}
public static boolean isCycle(ArrayList<Edge>[] graph)
{
    boolean vis[]=new boolean[graph.length];
    boolean stack[]=new boolean[graph.length];

    for(int i=0;i<graph.length;i++)
    {
        if(!vis[i])
        {
            if(isCycleUtil(graph,i,vis,stack))
            {
                return true;
            }
        }
    }
    return false;
}
public static boolean isCycleUtil(ArrayList<Edge>[]graph,int curr,boolean vis[],boolean stack[])
{
vis[curr]=true;
stack[curr]=true;
for(int i=0;i<graph[curr].size();i++)
{
    Edge e= graph[curr].get(i);
    if(stack[e.dest])
    {
        return true;
    }
    if(!vis[e.dest]&& isCycleUtil(graph,e.dest,vis,stack))
    {
        return true;
    }
}
stack[curr]=false;
return false;
}
public static void topSort(ArrayList<Edge>[]graph)
{
    boolean vis[]=new boolean[graph.length];
    Stack<Integer> s=new Stack<>();
    for(int i=0;i<graph.length;i++)
    {
        if(!vis[i])
        {
            topSortUtil(graph,i,vis,s);// modified dfs
        }
    }
    while(!s.isEmpty())
    {
        System.out.print(s.pop()+" ");
    }
}
public static void topSortUtil(ArrayList<Edge>[]graph,int curr,boolean vis[],Stack<Integer> s)
{
    vis[curr]=true;

    for(int i=0;i<graph[curr].size();i++)
    {
        Edge e=graph[curr].get(i);
        if(!vis[e.dest])
        {
            topSortUtil(graph,e.dest,vis,s);
        }
    }
    s.push(curr);
}
public static void calcIndeg(ArrayList<Edge> graph[],int indeg[])
{
    for(int i=0;i<graph.length;i++)
    {
        int v=i;
        for(int j=0;j<graph[v].size();j++)
        {
            Edge e=graph[v].get(j);
            indeg[e.dest]++;
        }
    } 
}
public static void topsort(ArrayList<Edge> graph[])
{
    int indeg[]=new int [graph.length];
    calcIndeg(graph, indeg);
    Queue<Integer> q=new LinkedList<>();

    for(int i=0;i<indeg.length;i++)
    {
        if(indeg[i]==0)
        {
            q.add(i);
        }
    }
    // bfs
    while(!q.isEmpty())
    {
        int curr=q.remove();
        System.out.print(curr+" ");
      for(int i=0;i<graph[curr].size();i++)
      {
        Edge e= graph[curr].get(i);
        indeg[e.dest]--;
        if(indeg[e.dest]==0)
        {
            q.add(e.dest);
        }
      }  
    }
    System.out.println();
}
public static void printAllPath(ArrayList<Edge> graph[],int src,int dest,String path)
{
    if(src==dest)
    {
        System.out.println(path+dest);
        return;
    }
    for(int i=0;i< graph[src].size();i++)
    {
        Edge e=graph[src].get(i);
        printAllPath(graph,e.dest ,dest, path+src);
    }
}
static class Pair implements Comparable<Pair>{
    int n;
    int path;
    public Pair(int n,int path)
    {
        this.n=n;
        this.path=path;
    }
    @Override
    public int compareTo(Pair p2)
    {
        return this.path-p2.path;
    }
}
public static void dijkstra(ArrayList<Edge> graph[],int src)
{
    int dist[]=new int [graph.length];
    for(int i=0;i<graph.length;i++)
    {
        if(i!=src)
        {
            dist[i]=Integer.MAX_VALUE;
        }
    }
    boolean vis[]=new boolean[graph.length];
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    pq.add(new Pair(src, 0));
    // loop
    while(!pq.isEmpty())
    {
        Pair curr=pq.remove();
        if(!vis[curr.n])
        {
            vis[curr.n]=true;
            // neighbours
            for(int i=0;i<graph[curr.n].size();i++)
            {
                Edge e =graph[curr.n].get(i);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;
                if(dist[u]+wt<dist[v])
                {
                    dist[v]=dist[u]+wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
    }
    // print all source to vertices shortest dist
    for(int i=0;i<dist.length;i++)
    {
        System.out.print(dist[i]+" ");
    }
    System.out.println();
}
public static void bellmanFord(ArrayList<Edge>graph,int src,int V)
{
    int dist[]=new int[V];
    for(int i=0;i<dist.length;i++)
    {
        if(i!=src)
        {
            dist[i]=Integer.MAX_VALUE;
        }
    }
    for(int i=0;i<V-1;i++)
    {
        for(int j=0;j<graph.size();j++)
        {
               Edge e=graph.get(j);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;
                if(dist[u]!=Integer.MAX_VALUE&& dist[u]+wt<dist[v])
                {
                    dist[v]=dist[u]+wt;
                }
            }
        }
    for(int i=0;i<dist.length;i++)
    {
        System.out.print(dist[i]+" ");
    }
    System.out.println();
}
public static void main(String[] args) {
    /*
     0---------3
    /|         |
   / |         |
  1  |         4
   \ |
    \|
     2
     */
    int V=5;
   // ArrayList<Edge> graph[]=new ArrayList[v];
   ArrayList<Edge> graph=new ArrayList<>();
    //createGraph(graph);
    createGraph2(graph);
   // System.out.println(detectCycle(graph));
    //System.out.println(isBipartite(graph));
    //System.out.println(isCycle(graph));
   // topSort(graph);
    //topsort(graph);
   // int src=5,dest=1;
//printAllPath(graph, src, dest, "");
//int src=0;
//dijkstra(graph, src);// tc=v+elogv
bellmanFord(graph, 0,V);

}
}
