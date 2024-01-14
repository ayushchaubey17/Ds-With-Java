import java.util.Arrays;

public class ClimbingStairUsingRecursion {
    public static void main(String[] args) {

        int n = 5;


       int p =  count(n);
        System.out.println(p);


    }

    public static int count(int n) {
        if(n<0) return 0;
        if(n==0) return  1;

        return count(n-1)+count(n-2);

    }
}
