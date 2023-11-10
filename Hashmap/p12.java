import java.util.stream.Stream;

public class p12 {
    public static void main(String[] args) {
        char [] data = {'a','b','c','d'};
        String p = new String(data);
        System.out.println(p);
        String q = "aadd";

//        System.out.println(q.contains("da"));


        String a = "Ram";
        String b = "Ram";

        String[] m = {a, b,"shyam","ghanshyam"};
//        System.out.println(a);
//
//        String p1 = String.copyValueOf(data,1,1);
//        System.out.println(p1);
   String p3 =     String.join("",m);
        System.out.println(p3);

        System.out.println(a.indexOf("m"));

//
//        System.out.println(String.join("--","ram","is","a","good","buy"));
    }
}
