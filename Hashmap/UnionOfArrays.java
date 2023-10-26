import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 7, 9};
        int b[] = {7, 9, 11, 24};

        union(a, b);
    }

    public static void union(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet<>();

        // insert first array in the hashmap

        for (int k : a) hs.add(k);

        // insert for the second aray

        for (int k : b) hs.add(k);

        System.out.println("the union value is "+ hs.size());

        System.out.println("the union set is "+ hs );
    }
}
