import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.*;

public class sq {
    public static void main(String[] args) {

//        int a = 9, b = 7;
//        int c = Math.min(67, 98);
//        System.out.println(c);
//      double x =  Math.round(5.9);
//        System.out.println((x));
//        String a = "9";
//        String b = "8";
//        int c = Integer.parseInt(a);
//        int d = Integer.parseInt(b);
//
//        int k = c*d;
//        System.out.println(Integer.toString(k));

//        char data[] = {'a','b','c','d'};
//        String str = String.valueOf(data);
//        System.out.println(str);


        String s = "ram";
        String t = "amar";
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i =0;i<s.length();i++)
        {
            char x = s.charAt(i);
            hm.put(x,hm.containsKey(x)?hm.get(x)+1:1);
        }


        int count =0;

        for(int i =0;i<t.length();i++)
        {

            char y = t.charAt(i);
            if(hm.containsKey(y))
            {
                int z =hm.get(y)==1?hm.remove(y):hm.put(y,hm.get(y)-1);

            }
            else
                count++;
        }

        System.out.println(count);


    }
}