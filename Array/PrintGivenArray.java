

// java code fore printing element of an given arrray
public class PrintGivenArray {
    public static void main(String[] args) {

        //  let the array be
        int arr[] = {4, 45, 86, 978, 45, 23, 145, 65};
        // method call
        print(arr);


    }

    // method declared here
    public static void print(int[] array) {// an array i passed a a parameter

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }

}



