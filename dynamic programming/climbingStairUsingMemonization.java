import java.util.Arrays;

public class climbingStairUsingMemonization {
    public static void main(String[] args) {
        int n = 4;
        // size should be one more than the end value
        int[] ways = new int[n + 1];

        Arrays.fill(ways, -1);

      int ans =   count(n, ways);
        System.out.println(ans);

    }


    public static int count(int n, int ways[]) {
        if(n<0) return 0;
        if(n==0) return 1;

        if (ways[n] != -1) return ways[n];  // already calculated

        ways[n] = count(n-1,ways)+count(n-2,ways);

        return ways[n];
    }
}
