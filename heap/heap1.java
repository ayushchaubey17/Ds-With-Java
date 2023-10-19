

public class heap1 {


    public static void addInHeap(int data,int [] arr,int n) {

        arr[n] = data;// step 1;

        int c = n;//child index
        int p = (c - 1) / 2;


        while (arr[c] < arr[p]) {
            int temp = arr[c];
            arr[c] = arr[p];
            arr[p] = temp;
        }

    }



    public static void main(String[] args) {
        int ak[] = new int[7];
        ak[0] =20;
        ak[1] =37;
        ak[2]= 4;
        addInHeap(34,ak,3);
        addInHeap(314,ak,3);
        addInHeap(234,ak,3);
        addInHeap(334,ak,3);



        for (int ele: ak
             ) {
            System.out.println(ele);
        }








    }
}
