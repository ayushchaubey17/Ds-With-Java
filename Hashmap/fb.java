public class fb {
    public static void main(String[] args) {
        int arr[] = new int[10];
         arr[0]=0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] * arr[i - 1]) + arr[i - 2];
            System.out.println((i+1)+"element of series is"+arr[i]);
        }

    }

}
