//java code to search a key element in a given matrix
public class Search_In_Matrix {


    //    method of creating a matrix array
    //returns the array
    public static int[][] makeMatrix() {
        int[][] arr = new int[4][4];
        arr[0][0] = 10;
        arr[0][1] = 15;
        arr[0][2] = 27;
        arr[0][3] = 32;
        arr[1][0] = 20;
        arr[1][1] = 25;
        arr[1][2] = 29;
        arr[1][3] = 33;
        arr[2][0] = 30;
        arr[2][1] = 35;
        arr[2][2] = 37;
        arr[2][3] = 39;
        arr[3][0] = 40;
        arr[3][1] = 45;
        arr[3][2] = 48;
        arr[3][3] = 51;

        return arr;
    }


    // method for searching the element position in matrix
    public static void FindThis(int[][] arr, int key) {
        int i = 0;        // for row
        int j = 3;      //for col
        //starting from  top right corner


        // while loop runs till the last element
        while (i <= 3 && j >= 0) {
            //starting from  top right corner


            // if element matches give the position and return
            if (arr[i][j] == key) {
                System.out.println("element found at " + i + " row and " + j + " column");
                return;
            }


            // if key is lessser than the maatrix value move backward
            else if (key < arr[i][j]) {
                j--;
            }
            // if key is lesser than the matrix value go downward

            else {
                i++;
            }

        }


        // if whole while loop runs till the element not found then give the message
        System.out.println("element not found");
    }


    public static void main(String[] args) {

        // method for finding element in matrix
        //takes two arguments matrix array and element
        FindThis(makeMatrix(), 45);


    }
}
