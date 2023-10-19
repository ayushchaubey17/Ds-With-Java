import java.util.PriorityQueue;

public class slidingWindow {
    static class pair implements Comparable<pair>{
        int val;
        int idx;

        public pair(int idx,int val) {
            this.idx = idx;
            this.val = val;
        }

        public int compareTo(pair p) {
            return p.idx - this.idx;
        }


    }



    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int n = arr.length;
        int k= 3;  // window size
        int res[] = new int[n - k + 1];
        PriorityQueue<pair> pq = new PriorityQueue<>();

        // add first three element
        for (int i = 0; i <k; i++) {


        }



    }
}
