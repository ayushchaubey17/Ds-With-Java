import java.util.ArrayList;

public class dfs {
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        
        creatingAGraph(graph);

        boolean visit[] = new boolean[v];


        dfs(0,graph,visit);
    }

    public static void dfs(int curr , ArrayList<Edge> graph[],boolean [] visit) {
        System.out.println(curr);
        visit[curr] = true;

        for(Edge e:graph[curr])
        {
           if(!visit[e.des])
           {
               dfs(e.des,graph,visit);
           }

        }
    }


    public static void creatingAGraph(ArrayList<Edge> graph[] )
    {
        
        int n = graph.length;

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        
        // graph 0 
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        
        
    }
    
    // edge class
    static class Edge{
        int src;
        int des;

        public Edge(int s,int d) {
            this.des = d;
            this.src = s;
        }
    }
}
