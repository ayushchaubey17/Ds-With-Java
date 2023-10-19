public class heapSort {

    public static void sort(int arr[],int n) {
        //make the max heap
        //call heapify for all the last level nodes

        for (int i = n / 2; i >= 0; i--) {
            heapify(arr,i,n);
        }

        //put largest at end
        for (int i = n-1; i >=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i]= temp;
            heapify(arr,0,i);

        }



    }

    public static void heapify(int arr[],int i, int size) {
        int left = 2*i+1;
        int right = 2*i+2;

        int min = i;
        if (left<size && arr[left]>arr[min] ) {
            min = left;
        }
        if (right<size && arr[right]>arr[min] ) {
            min = right;
        }

        if (min != i) {
            int  temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            heapify(arr,min,size);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};
        sort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
