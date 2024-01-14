public class FabonacciUsingTabulation {
    public static void main(String[] args) {
        int n = 5;

        int ans = fib(n);
        System.out.println(ans);

    }


    public static int fib(int n) {

        int dp[] = new int[n + 1];

        dp[0] = 0;   // first of fibonacci
        dp[1] = 1;      // first of fibonacci



        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];




    }
}
