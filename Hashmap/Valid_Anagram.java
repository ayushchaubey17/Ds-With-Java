import java.util.HashMap;

public class Valid_Anagram {
    public static void main(String[] args) {
        String a = "rama";
        String b = "marbk";

        System.out.println(check(a, b));
    }

    public static boolean check(String a, String b) {
        if(a.length()!= b.length()) return false;
        // if string size is not equal imtlb k anagram ho hi nahi sakte hai



        // ak naya hashmap banayee haii
        HashMap<Character, Integer> hm = new HashMap<>();


        //store the values with the frequency in the hash map
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
//            hm.put(ch, hm.getOrDefault(ch, 0) + 1);   //using get or default method
            hm.put(ch,hm.containsKey(ch)?hm.get(ch)+1:1);  // using if else block stattement
        }

        //checkin the second string in the  the map
        for (int i = 0; i < a.length(); i++) {
            char c = b.charAt(i);
            if (hm.containsKey(c)) {  // agar contain kregaaa tbbb nii krega to else part matlb return false

                int h = hm.get(c) == 1 ? hm.remove(c) : hm.put(c, hm.get(c) - 1);
                // agar ak baar aya to remove kar dege lakin ager do bar ayega to uski frequency ak se kam kar dege
            }
            else{
                return false;
            }


        }


        // ab hmm hashmap se element nikal liye to kucch bachna chahiye

        //agar empty hai iska mtlb anagram haii otherwise false
        return hm.isEmpty() ? true : false;




    }

}
