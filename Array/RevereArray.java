// java code to revere an array(without creating a new array)
public class RevereArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        revere_Method1(arr);
//      revere_Method2(arr);
        print(arr);


    }

    public static void revere_Method1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    //   Another method (with creating a new array)
    public static void revere_Method2(int[] arr) {
        int[] arrNew = new int[arr.length];
        int j = 0;
        //this for loop reverse all the value and put in arrNew
        for (int i = arr.length - 1; i >= 0; i--) {
            arrNew[j] = arr[i];
            j++;
        }

        //for loop for updating the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrNew[i];
        }


    }


}