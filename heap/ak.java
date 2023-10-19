public class ak {
    public static void main(String[] args) {

        System.out.println(fib(7));


    }
    public static  int  fib(int n)
    {

        if (n == 1) return 0;
        if (n==2) return 1;

        int arr[] = new int[n];
        arr[0]=0;arr[1]=1;

            for (int i = 2; i <n ; i++) {
                arr[i]= (arr[i-1]*arr[i-1])+arr[i-2];
            }
        return arr[n-1];


    }
}