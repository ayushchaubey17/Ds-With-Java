public class fibonacciUsingMemoization {
    public static void main(String[] ayush) {
        int n = 6;
        int dp [] = new int[n+1];
      int ans =   fib(n,dp);
        System.out.println(ans);

    }

    public static int fib(int n, int[] dp) {
//         base case
        if(n==0 || n==1) return  n;


        // alreaady calculated
        if (dp[n] != 0) return  dp[n];


//        for future use
        dp[n] = fib(n-1,dp)+ fib(n-2,dp);
        return dp[n];


    }
}
