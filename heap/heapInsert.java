
import java.util.ArrayList;

public class heapInsert {
    public static void main(String[] args) {
        heap ob = new heap();
        ob.add1(12);
        ob.add1(10);
        ob.add1(5);
        ob.add1(3);
//        ob.remove();



        System.out.println(ob.hp);




    }

   static class heap{

       ArrayList<Integer>  hp = new ArrayList<>();


       public  void add1(int data) {

           hp.add(data);
           int l = hp.size();
//           if(l==1)
//           {
//
//               return;
//           }

           int x = l-1;         //child

           int par = (x-1)/2;       //parrent

           while (hp.get(x) < hp.get(par)) {
               int temp = hp.get(x);
               hp.set(x,hp.get(par));
               hp.set(par, temp);
           }



       }

       public int peek(){
           return hp.get(0);
       }

       public void remove() {
           int n = hp.size();
           int data = hp.get(0);


           // swap 1st nd lst
           int temp = data;
           hp.set(0, hp.get(n - 1));
           hp.set(n - 1, temp);

           // 2...
           hp.remove(n-1);

           //3..heap ko fixxx kregee
           heapify(0);



       }

       public void heapify(int i) {

           int len = hp.size();


           //indexx bna rhe hh
           int left = 2*i+1;
           int right = 2 * i + 2;
           int min = i;

           if (left < len && hp.get(left) < hp.get(min)) {
               min = left;
           }

           if (right < len && hp.get(right) < hp.get(min)) {
               min = right;
           }

           if (min != i) {
               int temp = hp.get(i);
               hp.set(i, hp.get(min));
               hp.set(min, temp);

               heapify(min);

           }


       }




   }


}
