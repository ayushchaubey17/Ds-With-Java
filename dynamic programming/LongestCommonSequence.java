public class LongestCommonSequence {
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";

        int ans = lcs(str1, str2, str1.length(), str2.length());
        System.out.println(ans);
    }


    public static int lcs(String str1,String str2,int l1, int l2){

        // base case
        if(l1==0 || l2==0)
        {
            return  0;
        }


        if (str1.charAt(l1 - 1) == str2.charAt(l2 - 1)) {
            return lcs(str1, str2, l1 - 1, l2 - 1)+1;
        }
        else{
            int ans1 = lcs(str1, str2, l1 - 1, l2);
            int ans2 = lcs(str1, str2, l1, l2 - 1);
            return Math.max(ans2, ans1);

        }


    }
}
