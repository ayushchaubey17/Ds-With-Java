//java code to move all the zeros at the end of array
public class Move_Zeros {
    public static void main(String[] args) {
        int arr[] = {12, 2, 3, 0, 6, 0, 54, 0, 3, 0};
        move(arr);
      PrintGivenArray obj = new PrintGivenArray();
        obj.print(arr);
     }

    public static void move(int[] arr) {
        int j= 0;           // focusing on zero value
        for (int i = 0; i < arr.length; i++) {      // i focusing on non zero vlue

            if ( arr[i] != 0 && arr[j] == 0 ) {     //swap when j's value will 0 and i's value will non zero
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
            if (arr[j] != 0) {
                j++;        // j is for focusiong on zero only
            }
        }
    }
}
