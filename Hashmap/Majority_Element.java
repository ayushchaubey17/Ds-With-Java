import java.util.HashMap;
import java.util.Set;

public class Majority_Element {
    public static void main(String[] args) {
        int arr [] ={1,2,1,1,2,1,21,2,3,4,2,2};
        sol(arr);

        // 2 se jyada walo elements ko print kroo

    }

    public static void sol(int arr[]) {
        int n = arr.length;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = arr[i];

            hm.put(x, hm.containsKey(x) ? hm.get(x) + 1 : 1);

        }

        // jiska 2 se jyd hi print kra de
        Set<Integer> s = hm.keySet();
        for (int a: s
             ) {
           if (hm.get(a)>1) System.out.println(a);


        }


    }


}