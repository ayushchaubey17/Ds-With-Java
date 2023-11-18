import java.util.*;
public class hasPath {
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

        boolean visit [] = new boolean[v];

        System.out.println(hasGraph(0,6,graph,visit));


    }

    public static boolean hasGraph(int src,int des, ArrayList<Edge> graph[],boolean [] visit){

        if(src== des)return true;

        visit[src] = true;


        for(Edge i : graph[src]){
            if(!visit[i.des] && hasGraph(i.des,des,graph,visit))return true;
        }
        return false;
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



    static class Edge{

        int src;
        int des;


        public Edge(int s,int d) {
            this.src= s;
            this.des = d;

        }
    }

}
