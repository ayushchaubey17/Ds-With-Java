import java.util.HashMap;

public class largest_subarray_with_sum_zero {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer, Integer> hm = new HashMap<>();

        int length =0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];                  // hashmap me hr index ka sum store kr rhe hai
            if (hm.containsKey(sum)) {
                length = Math.max(length, i - hm.get(sum));    // purana length aur naye length ka compare hai    // new length = j-i
            }
            else {
                hm.put(sum,i);
            }
        }

        System.out.println(length);

    }
}
