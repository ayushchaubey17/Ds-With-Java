import java.util.Scanner;

// java code to print the user given Array
public class print_Users_Array {
    public static void main(String[] args) {
        System.out.println("enter the size of your required array");
        Scanner kbd = new Scanner(System.in);
        int num = kbd.nextInt();

        // make an array of required size
        int arr[] = new int[num];

        //Applying forEach loop for toring the value
        for (int i = 0; i < num; i++) {
            System.out.println("enter "+(i+1)+" element");
            arr[i] = kbd.nextInt();
        }

        //Applying forEach loop for printing the value
        System.out.print("your array is:: { ");
        for (int ele :
                arr) {
            System.out.print(ele+" ");
        }
        System.out.println("}");


    }
}
