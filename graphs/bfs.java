import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {



    public static void main(String[] args) {
        /*



                    1---------3
                  /           |  \
                /             |    \
               0              |     5-------6
                \             |    /
                  \           |   /
                    \         |  /
                      \       | /
                       2-------4



         */


        int v =7;
        ArrayList<Edge> [] graph = new ArrayList[v];
       createGraph(graph);
       bfs(graph);

    }

    public static void createGraph(ArrayList<Edge> []graph) {
        int n = graph.length;


        for (int i = 0; i <n ; i++) {
            graph[i] = new ArrayList<>();
        }


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

    public static void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[graph.length];


        q.add(0);
        while(!q.isEmpty()){
            int temp = q.remove();

            if (!visit[temp]) {
                System.out.print(temp+" ");
                visit[temp] = true;


                for (int i = 0; i < graph[temp].size(); i++) {
                    Edge e = graph[temp].get(i);
                    q.add(e.des);
                }
            }

        }



    }

    static class Edge{

        int src;
        int des;


        public Edge(int s,int d) {
            this.src= s;
            this.des = d;

        }
    }

}
