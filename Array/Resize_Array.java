// java code to change the size of an array
public class Resize_Array {
    public static void main(String[] args) {
        int arr[] = {12, 34, 45, 34, 34};          // current size is 5 ....need to resize of 10
        int capicity = 10;

        System.out.println("initial array is");
        printArray(arr);


        int[] newOne = resize(arr, capicity);    // array is resized
        newOne[6] = 40;                          //last array size is 5...it means it is resized

        System.out.println("\nresized array is ");
        printArray(newOne);

    }

    public static int[] resize(int[] arr, int capicity) {
        int n = arr.length;             // old array length

        int newArr[] = new int[capicity];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void printArray(int arr[]) {
        for (int ele :
                arr) {
            System.out.print(ele + " ");
        }
    }
}
