//import java.util.PriorityQueue;
//
//public class pq_For_Object {
//
//    static class student implements Comparable<student> {
//        String name;
//        int rank;
//
//        public student(String name,int rank) {
//            this.name = name;
//            this.rank = rank;
//        }
//
//
//        //method overriding
//
//        @Override
//        public int compareTo(student s4)
//        {
//            return  this.rank  -s4.rank ;
////            return  s4.rank - this.rank ;  // for descending order
//        }
//
//    }
//
//    public static void main(String[] args) {
//        PriorityQueue<student> pq = new PriorityQueue<>();
//        student a1 = new student("ram",5);
//        student a2 = new student("sam",1);
//        student a3 = new student("aman",3);
//        student a4 = new student("gaman",2);
//
//        pq.add(a1);
//        pq.add(a2);
//        pq.add(a3);
//        pq.add(a4);
//
//
//        while(!pq.isEmpty()){
//            System.out.println(pq.peek().name+"--->" +pq.peek().rank);
//            pq.remove();
//
//        }
//
//    }
//
//}


import java.util.PriorityQueue;

public class pq_For_Object{
    static class Student implements Comparable<Student> {
        int rank;
        String name;

        public Student(int r, String s){
            this.rank = r;
            this.name=s;
        }



        @Override
        public int compareTo(Student s){
            return this.rank-s.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student(34,"riyaede"));
        pq.add(new Student(3,"riyaded"));
        pq.add(new Student(134,"riyaed"));
        pq.add(new Student(324,"rdediya"));
        pq.add(new Student(1,"rseiya"));



        while(!pq.isEmpty()){

            System.out.println(pq.peek().rank+"--->"+pq.peek().name);
            pq.remove();
        }
    }
}