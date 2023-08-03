// check wheather the string is palindrome or not
public class Check_Palindrome {
    public static void main(String[] args) {
        String word = "madam";

        System.out.println(check(word));        // method call and print it is palinddrome or not



    }

    public static boolean check(String word) {
        char [] charArray = word.toCharArray();     //convert the word into array of characters
                                                    //teacher-----> T E A C H E R
        int start =0;                       // it traverse from start
        int end = charArray.length-1;       // it traverse from end

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;        //if while loop ends means word is palindrome
    }
}