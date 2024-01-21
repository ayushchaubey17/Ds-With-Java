import java.util.Arrays;

public class ClimbingForThree {
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);

        System.out.println(count(n,ways));
    }

    public static int count(int n, int ways[]) {
        if(n<0) return 0;
        if(n==0) return 1;

        if(ways[n]!= -1)return ways[n];

        ways[n] = count(n - 1, ways) + count(n - 2, ways) + count(n - 3, ways);
        return ways[n];


    }

}
