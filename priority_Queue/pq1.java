// introduction to priority queue

import java.util.Comparator;
import java.util.*;



public class pq1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(4);      //take O(log n)
        pq.add(3);  //take O(log n)
        pq.add(7);//take O(log n)
        pq.add(1);
        System.out.println(pq);

        // the priority queue arrange in the format
//         [1, 3, 7, 4]

        System.out.println(pq.peek());      //peek takes 0(1) time
        pq.remove();    //take O(log n)
        System.out.println(pq);


    }
}
