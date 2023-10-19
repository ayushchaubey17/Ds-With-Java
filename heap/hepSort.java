public class hepSort {

    public static void heapify(int arr[], int i, int n) {
        int l = 2*i+1;
        int r = 2*i+2;
        int mi = i;
        if (l<n  && arr[l]<arr[mi]) {
            mi = l;
        }
        if (r<n  && arr[r]<arr[mi]) {
            mi = r;
        }
        if (mi != i) {
            int temp = arr[i];
            arr[i] = arr[mi];
            arr[mi] = temp;

            heapify(arr,mi,n);
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2, 6, 4};

        // build
        int n = arr.length;

        for (int i = n / 2; i >= 0; i--) {

            heapify(arr,i,n);
        }


        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
           arr[0] = arr[i];
            arr[i] = temp;


            heapify(arr, 0, i);
        }



    }

}
