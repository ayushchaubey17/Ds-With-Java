import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(20);
        hs.add(20);
        hs.add(20);
        hs.add(30);
        hs.add(30);
        hs.add(30);
        hs.add(10);

//        hs.clear();


        System.out.println(hs.contains(20));
        System.out.println(hs);





    }
}