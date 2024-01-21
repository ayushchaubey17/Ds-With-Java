public class RodCutting {
    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int len[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int toRod = 8;

        System.out.println(rodCutting(price,len,toRod));
    }

    public  static int rodCutting(int [] price , int [] len , int rod) {

        int n = len.length;


        int dp[][] = new int[n + 1][rod + 1];


        for (int i = 1;i<= n;i++)
        {
            for(int j=1;j<= rod;j++)
            {
                int v = price[i - 1];
                int l = len[i-1];
                if(l<= j){
                    dp[i][j] = Math.max(v + dp[i][j - l], dp[i - 1][j]);
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }


            }
        }

        return dp[n][rod];
    }
}
