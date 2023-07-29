// java code for finding minimum element
public class Minimum_Element {
    public static void main(String[] args) {

        int arr[] = {12, 32, 43, 64, 2, 54, 32, 87, 5, 43};

        findMin(arr);// method call

    }

    //method declared
    public static void findMin(int arr[]) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {  //for loop for finding minimum
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minimum element is " + min);
    }
}
