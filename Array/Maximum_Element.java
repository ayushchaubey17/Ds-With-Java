//java code to find maximum element in an array
public class Maximum_Element {
    public static void main(String[] args) {

        int arr[] = {12, 32, 43, 64, 2, 54, 32, 87, 5, 43};

        findMax(arr);// method call

    }

    //method declaration
    public static void findMax(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {  //for loop for finding maxium
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("maximum element is " + max);
    }
}
