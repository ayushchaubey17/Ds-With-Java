public class Target_Sum_Subset {
    public static void main(String[] args) {
        int numbers[] = { 4, 2,  7,1,3};
        int sum = 10;
        System.out.println(targetSum(numbers,sum));


    }

    public  static void printArr(boolean dp [][])
    {
        for (int i = 0; i < dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                System.out.print(dp[i][j]+"    ");
            }
            System.out.println();
        }
    }
    public static boolean targetSum(int[] num, int sum) {

        int n = num.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];



        for(int i = 0;i<=n;i++)dp[i][0]= true;


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=sum ; j++) {

                int val = num[i-1];
                if (val<= j) {

                    //include
                    if(dp[i-1][j-val] == true)dp[i][j] = true;


                    // exclude
                    if(dp[i-1][j]== true)dp[i][j] = true;
                }

                else {
                    if(dp[i-1][j]== true)dp[i][j] = true;
                }


            }
        }

     printArr(dp);

        return dp[n][sum];

    }
}
