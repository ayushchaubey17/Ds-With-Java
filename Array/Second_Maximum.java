//java code to find second maximum in an array
public class Second_Maximum {
    public static void main(String[] args) {
        int arr[] = {1, 56, 21, 89, 32, 89,65, 45, 12, 45, 75};        //the given array
        FindSecMax(arr);
    }

    public static void FindSecMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
            //array value b/w max and 2ndmax        &&   if max value is duplicate
            else if (arr[i]>secMax  && arr[i]!=max) {
                secMax = arr[i];
            }

        }
        System.out.println(secMax);
    }
}
