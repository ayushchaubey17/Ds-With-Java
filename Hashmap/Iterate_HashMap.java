// itearation in hashmap using Set collection by keySet method

import java.util.HashMap;
import java.util.Set;

public class Iterate_HashMap {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("shirt", 1000);
        hm.put("tshirt", 200);
        hm.put("jeans", 5000);
        hm.put("shoes",6000);


        HashMap<Integer, Integer> hm2 = new HashMap<>();
        hm2.put(5, 1);
        hm2.put(1,1);
        hm2.put(70000000,1);
        hm2.put(7, 1);
        hm2.put(9, 1);
        hm2.put(2, 1);
        hm2.put(4, 1);
        System.out.println(hm2);





            // use for he iteration only
         Set<Integer> st = hm2.keySet();

        for (int i: st
             ) {
            System.out.print(i+" ");
        }



        // here the datatype is of key
        // keySet method
        Set<String> keys = hm.keySet();
        System.out.println(keys);



//     output---->   [shirt, tshirt, shoes, jeans]
// they are not in  a specific order

        //for iteration
        for (String k: keys
             ) {
            System.out.println("key = "+k+", value = "+hm.get(k));
        }

    }
}
