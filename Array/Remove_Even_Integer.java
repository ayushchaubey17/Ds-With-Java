// java code to remove  the even integer from the array....

public class Remove_Even_Integer {
    public static void main(String[] args) {


        // let the array be
        int arr[] = {12, 23, 54, 65, 87, 98, 65, 45, 56, 12, 32};
        Remove(arr);

    }

    public static void Remove(int[] arr) {
        //firt we need to count number of odd integer in tghe array
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;         // if the number i not divisible by 2 then it i count in odd
            }
        }

        //make an array for only odd
        int oddArr[] = new int[oddCount];

        // inerting only odd value in oddArr
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArr[j] = arr[i];
                j++;
            }
        }

        //printing the value
        for (int i = 0; i < oddArr.length; i++) {
            System.out.print(oddArr[i] + " ");
        }


    }
}
