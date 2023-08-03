// java code to find missing number in an array

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9};   //here 3 is missing

        findNum(arr);   //method call

    }

    public static void findNum(int arr[]) {
        int n = arr.length + 1;       // max value of array
        int sum = n * (1 + n) / 2;        // total sum from 1 to 9 including 3
        for (int ele :
                arr) {
            sum -= ele;             // each array value is subtracted from sum
        }
        System.out.println(sum);       // after subtracting all value missing value will left
    }
}
