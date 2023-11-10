import java.util.*;
public class creatingAGraph {

    static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;


        }


    }
    public static void main(String[] args) {

        // create an array
        /*
                         (4)
                         /
            (0)         /  2
              \       (2)
               \      / \
               5\   1/   \ 1
                 \  /     \
                  (1)-----(3)
 ````                   3

       */

        int v = 5;
// size of vertices


//        create an array of arraylist
      // int arr[] = new int[]
        ArrayList<Edge> [] graph = new ArrayList[v];  // null arraylist

        // now we only tell that array containg arraylist



        // creating arraylist
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<Edge>();  //
        }

        {
            // 0 vertex
            graph[0].add(new Edge(0, 1, 5));

            //1 vertex
            graph[1].add(new Edge(1, 0, 5));
            graph[1].add(new Edge(1, 2, 1));
            graph[1].add(new Edge(1, 3, 3));

            // 2 vertex
            graph[2].add(new Edge(2, 1, 1));
            graph[2].add(new Edge(2, 3, 1));
            graph[2].add(new Edge(2, 4, 2));

            // 3 vertex
            graph[3].add(new Edge(3, 1, 3));
            graph[3].add(new Edge(3, 2, 1));

            // 4 vertex
            graph[4].add(new Edge(4, 2, 2));

        }

        for (int i = 0; i <graph[3].size() ; i++) {
            Edge k = graph[3].get(i);
            System.out.println(k.des);
        }


    }
}