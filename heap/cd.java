import java.util.ArrayList;

public class cd {
    static class heap{
        ArrayList<Integer> ar = new ArrayList<>();

        public void add(int data){
            ar.add(data);

            int child = ar.size()-1;
            int parent = child-1/2;

            while (ar.get(parent)>ar.get(child)){
                int temp = ar.get(0);
                ar.set(0,ar.get(parent));
                ar.set(parent,temp);

            }
        }

        public int peek(){
            return ar.get(0);

        }
    }

    public static void main(String[] args) {
        heap o = new heap();
        o.add(2);
        o.add(4);
        o.add(3);
        System.out.println(o.ar);
        System.out.println();
        System.out.println(o.peek());
    }


}