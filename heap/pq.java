import java.util.PriorityQueue;

public class pq {
    static  class student implements Comparable<student> {
     int rank;
        String name;

        public student(int r , String n){
            this.rank = r;
            this.name=n;
        }

        @Override
        public int compareTo(student mus) {
            return this.rank - mus.rank;

        }


    }

    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(6);
        p.add(2);
        p.add(8);
        p.add(5);


        while (!p.isEmpty()){
            System.out.println(p.peek());
            p.remove();
        }
    }
}