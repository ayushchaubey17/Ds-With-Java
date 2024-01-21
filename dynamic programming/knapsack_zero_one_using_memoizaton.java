public class knapsack_zero_one_using_memoizaton


{


    public static void main(String[] args) {
        int value[] = {15, 14, 10, 45, 30};
        int weight[] = {2, 5, 1, 3, 4};
        int w = 7;

        int dp[][] = new int[value.length + 1][w + 1];


        for (int i=0;i< dp.length;i++){
            for (int j = 0; j <dp[i].length ; j++) {
                dp[i][j] = -1;
            }
        }


        System.out.println(knapsack(value,weight,w,5,dp));


    }

    public static int knapsack(int[] value, int[] weight, int w, int n,int dp[][]) {

        // base case
        if (w == 0 || n == 0) return 0;


        if (dp[n][w] != -1) return dp[n][w];


        if (weight[n - 1] <= w) {  // valid

            // for including it into the bag
            int ans1 = value[n - 1] + knapsack(value, weight, w - weight[n - 1], n - 1, dp);

            //for exclude
            int ans2 = knapsack(value, weight, w, n - 1, dp);


            dp[n][w] = Math.max(ans2, ans1);
            return dp[n][w];
        }

        else { // not valid

            dp[n][w] = knapsack(value, weight, w, n - 1,dp);
            return dp[n][w];
        }


    }
  }


