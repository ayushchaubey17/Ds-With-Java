import java.util.HashMap;
import java.util.Set;

public class FInd_Itenerary_Of_Ticket {
    public static void main(String[] args) {
        HashMap<String, String> tkt = new HashMap<>();

        //      from se to tk haii
        tkt.put("chennai", "bengaluru");
        tkt.put("mumbai", "delhi");
        tkt.put("goa", "chennai");
        tkt.put("delhi", "goa");

        // phle hm nikalege k kaha se start karna haiii.......
        // iske liye hme reverse karna hogaa

        HashMap<String, String> rtkt = new HashMap<>();


        // ulta value dal dege
        Set<String> st = tkt.keySet();
        for (String s:st)   rtkt.put(tkt.get(s), s);

        // tkt me  from se to tk
        //rtkt me to  se from


        //starting point find krne k liye
        String start = null;
        for (String s : st) {
            if (!rtkt.containsKey(s)) {
                start= s;
            }

        }


        System.out.print(start);
        for (String s: st
             ) {

            System.out.print("->"+tkt.get(start));
            start = tkt.get(start);
        }




    }
}
