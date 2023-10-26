import java.util.HashSet;

public class Intesection_Of_Arrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 7, 9};
        int b[] = {7, 9, 11, 24};

        intersection(a, b);
    }

    public static void intersection(int[] a, int[] b) {
        // creating a hashmap
        HashSet<Integer> hs = new HashSet<>();

        // insert first array in hashset

        for(int i: a) hs.add(i);

        int count =0;
        for(int i: b) {
            if (hs.contains(i)) {
                count++;
                hs.remove(i);
            }
        }


        System.out.println(count+ " elements are common");


        // if we want the intersected array
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i: a) hs1.add(i);

        HashSet<Integer> hs2 = new HashSet<>();
        for(int i: b) hs2.add(i);


        //  isme yah check kiye haii k agar dono me common hai usko hm print kr de

        for ( int x : hs2)  if(hs1.contains(x))System.out.print(x+" ");







    }
}
