import java.util.ArrayList;

public class pq1 {
    static class hp{

        ArrayList<Integer> ar = new ArrayList<>();
        public void add(int data){
            ar.add(data); // add a node

            int c = ar.size()-1;
            int parent = c-1/2;
            // compare the child to parent
            // swap

            while(ar.get(c)>ar.get(parent)){
                int temp=ar.get(0);
                ar.set(0,ar.get(parent));
                ar.set(parent,temp);


            }



        }

        public static void main(String[] args) {
            hp ob = new hp();
            ob.add(4);
            ob.add(2);
            ob.add(8);
            ob.add(5);
            System.out.println(ob.ar);
        }
    }

}