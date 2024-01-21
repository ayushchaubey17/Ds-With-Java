public class knapsack_Zero_One {
    public static void main(String[] args) {
        int value[] = {15, 14, 10, 45, 30};
        int weight[] = {2, 5, 1, 3, 4};
        int w = 7;
        System.out.println(knapsack(value,weight,w,5));


    }

    public static int knapsack(int[] value, int[] weight, int w, int n) {

        // base case
        if(w==0 || n==0 )return  0;

        if (weight[n - 1] <= w) {  // valid

            // for including it into the bag
            int ans1 =value[n - 1] + knapsack(value, weight, w - weight[n - 1], n - 1);

            //for exclude
            int ans2 = knapsack(value, weight, w, n - 1);


            return Math.max(ans2, ans1);
        }
        else{ // not valid

            return knapsack(value, weight, w, n - 1);
        }


    }
}
