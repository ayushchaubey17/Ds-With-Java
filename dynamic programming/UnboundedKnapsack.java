public class UnboundedKnapsack {
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int weight[] = {2, 5, 1, 3, 4};
        int w = 7;

        System.out.println(knapsack(val,weight,w));
    }


    public static int knapsack(int val[], int[] weight, int w) {
        int n = val.length;
        int dp[][] = new int[n + 1][w + 1];

        for(int i=0;i<=n;i++)dp[1][0] = 0;

        for(int i=0;i<=w;i++)dp[0][i] = 0;


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                int v = val[i - 1];
                int wt = weight[i-1];

                if (wt <= j) {// valid
                dp[i][j] =    Math.max(v+dp[i][j-wt],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }


            }
        }

        return dp[n][w];



    }
}
