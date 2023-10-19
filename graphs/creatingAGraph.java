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
//                         (4)
//                         /
//            (0)         /  2
//              \       (2)
//               \      / \
//               5\   1/   \ 1
//                 \  /     \
//                  (1)-----(3)
// ````                   3

        int v = 5;
// size of vertices


// int arr[] = new int[]
        ArrayList<Edge>[] graph = new ArrayList[v];  // null arraylist
// store arraylist in an array
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>(null);
        }


// 0 vertex
        graph[0].add(new Edge(0, 1, 5));

//1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

     


    }
}