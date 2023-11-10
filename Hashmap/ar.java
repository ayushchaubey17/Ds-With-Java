import java.util.Arrays;
import java.util.List;

public class ar {
    public static void main(String[] args) {
        // Creating Arrays of Integer type
//        Integer a[] = {  30, 40,10,20};

//        // Get/ting the list view of Array
//        List<Integer> list = Arrays.asList(a);
//
//        System.out.println(list.size());
//        // Printing all the elements inside list object
//        System.out.println("The list is: " + list);
//
//        Arrays.sort(a);
//
//        System.out.println(Arrays.binarySearch(a,0,4,37));

        String s1 = "ramayan";
       String s2 = s1.replace("a", "p");
        System.out.println(s2);



        int intArr[] = { 8, 20, 17, 22, 90 };

        // Get the second Array
        int intArr1[] = { 8,20, 17, 22,90 };

//        int [] ak = Arrays.copyOfRange(intArr,1,14);

//   int x =      Arrays.compare(intArr,intArr1);

        Arrays.fill(intArr,0,2,30);
//        System.out.println(x);

      int y =  Arrays.compareUnsigned(intArr, intArr1);
        System.out.println(y);

//        for (int i:intArr) System.out.println(i);
//        // To compare both arrays
//        System.out.println("Integer Arrays on comparison: "
//                + Arrays.compare(intArr, intArr1));
    }
}
