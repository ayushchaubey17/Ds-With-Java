import java.util.HashSet;
import java.util.Iterator;

public class operation_HashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("delhi");
        hs.add("delhi");
        hs.add("banglore");
        hs.add("pune");
        hs.add("patna");
        hs.add("patna");
        hs.add("maharastra");
        hs.add("rajasthan");


// iteration using enhanced for loop
        for (String s : hs) {
            System.out.println(s);
        }


        System.out.println("method 2\n\n");
        // iteration using iterator
        Iterator it = hs.iterator();
        while (it.hasNext())                // jb tak agala hai tabtak
        {
            System.out.println(it.next());   // is function se automatic current value print kr dega aur automatic iterator next value ko pick kar lega
        }
    }
}
