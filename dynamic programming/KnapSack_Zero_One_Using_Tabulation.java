public class KnapSack_Zero_One_Using_Tabulation {
    public static void main(String[] args) {
        int value[] = {15, 14, 10, 45, 30};
        int weight[] = {2, 5, 1, 3, 4};
        int w = 7;
        System.out.println(knapSack(value, weight, w));
    }

    public static int knapSack(int [] val , int weight[],int w) {

        int n = val.length;


        // dp creation
        int dp[][] = new int[n + 1][w + 1];

        // for base case fill the first row and first column

        // for the first row
        for (int i = 0; i <= w; i++) dp[0][i] = 0;



        // for the first column
        for(int i= 0; i<= n ; i++)dp[0][i] = 0;


        // for remaining
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                    int v = val[i-1];    // value of ith item
                int wt = weight[i - 1];  // weight of ith item

                if (wt <= j) {// valid
                    int include = v + dp[i - 1][j - wt];
                    int exclude = dp[i-1][j];

                   dp[i][j] = Math.max(include, exclude);
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }





        return dp[n][w];

    }
}
