// java program to remove odd integer from an array

public class Remove_Odd_Integer {
    public static void main(String[] args) {
        // let the given array be
        int arr[] = {12, 26, 31, 89, 45, 78, 65, 45, 12};

        Remove(arr);    //method call

    }

    // method declaration for removing
    public static void Remove(int arr[]) {
        int Evencount = 0;  //we will count even because the new array having only even

        for (int i = 0; i < arr.length; i++) {      //for loop for counting the evens
            if (arr[i] % 2 == 0) {
                Evencount++;
            }
        }

        int NewArr[] = new int[Evencount];
        int j=0;

        for (int i = 0; i < arr.length; i++) {      //for loop for inserting odd value in new array
            if (arr[i] % 2 == 0) {
                NewArr[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < NewArr.length; i++) {
            System.out.print(NewArr[i]+" ");
        }


    }
}
